/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.test.msib;

import com.test.msib.Proyek;
import com.test.msib.ProyekService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * The ProyekController class provides REST API endpoints for managing projects.
 *
 * @author user
 */
@RestController
@RequestMapping("/proyek")
public class ProyekController {

    /**
     * The ProyekService instance used for project management operations.
     */
    @Autowired
    private ProyekService proyekService;

    /**
     * Creates a new project.
     *
     * @param proyek the project details to be created
     * @return the created project
     */
    @PostMapping
    public ResponseEntity<Proyek> createProyek(@RequestBody Proyek proyek) {
        Proyek savedProyek = proyekService.saveProyek(proyek);
        return new ResponseEntity<>(savedProyek, HttpStatus.CREATED);
    }

    /**
     * Retrieves all projects.
     *
     * @return a list of all projects
     */
    @GetMapping
    public ResponseEntity<List<Proyek>> getAllProyek() {
        return ResponseEntity.ok(proyekService.getAllProyek());
    }

    /**
     * Updates an existing project.
     *
     * @param id the unique identifier of the project to be updated
     * @param proyekDetails the updated project details
     * @return the updated project
     */
    @PutMapping("/{id}")
    public ResponseEntity<Proyek> updateProyek(@PathVariable Long id, @RequestBody Proyek proyekDetails) {
        Proyek updatedProyek = proyekService.updateProyek(id, proyekDetails);
        return ResponseEntity.ok(updatedProyek);
    }

    /**
     * Deletes a project.
     *
     * @param id the unique identifier of the project to be deleted
     * @return a response indicating the successful deletion
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProyek(@PathVariable Long id) {
        proyekService.deleteProyek(id);
        return ResponseEntity.noContent().build();
    }
}