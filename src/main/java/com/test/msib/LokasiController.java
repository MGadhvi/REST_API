/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.test.msib;

import com.test.msib.Lokasi;
import com.test.msib.LokasiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * The LokasiController class provides REST API endpoints for managing locations.
 *
 * @author user
 */
@RestController
@RequestMapping("/lokasi")
public class LokasiController {

    /**
     * The LokasiService instance used for location management operations.
     */
    @Autowired
    private LokasiService lokasiService;

    /**
     * Creates a new location.
     *
     * @param lokasi the location details to be created
     * @return the created location
     */
    @PostMapping
    public ResponseEntity<Lokasi> createLokasi(@RequestBody Lokasi lokasi) {
        Lokasi savedLokasi = lokasiService.saveLokasi(lokasi);
        return new ResponseEntity<>(savedLokasi, HttpStatus.CREATED);
    }

    /**
     * Retrieves all locations.
     *
     * @return a list of all locations
     */
    @GetMapping
    public ResponseEntity<List<Lokasi>> getAllLokasi() {
        return ResponseEntity.ok(lokasiService.getAllLokasi());
    }

    /**
     * Updates an existing location.
     *
     * @param id the unique identifier of the location to be updated
     * @param lokasiDetails the updated location details
     * @return the updated location
     */
    @PutMapping("/{id}")
    public ResponseEntity<Lokasi> updateLokasi(@PathVariable Long id, @RequestBody Lokasi lokasiDetails) {
        Lokasi updatedLokasi = lokasiService.updateLokasi(id, lokasiDetails);
        return ResponseEntity.ok(updatedLokasi);
    }

    /**
     * Deletes a location.
     *
     * @param id the unique identifier of the location to be deleted
     * @return a response indicating the successful deletion
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteLokasi(@PathVariable Long id) {
        lokasiService.deleteLokasi(id);
        return ResponseEntity.noContent().build();
    }
}