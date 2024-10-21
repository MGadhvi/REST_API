/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.test.msib;

import com.test.msib.Lokasi;
import com.test.msib.LokasiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * The LokasiService class provides methods for managing the Lokasi entity.
 * It uses the LokasiRepository interface to interact with the database.
 *
 * @author user
 */
@Service
public class LokasiService {

    /**
     * The LokasiRepository instance used for database operations.
     */
    @Autowired
    private LokasiRepository lokasiRepository;

    /**
     * Saves a new Lokasi entity to the database.
     *
     * @param lokasi the Lokasi entity to be saved
     * @return the saved Lokasi entity
     */
    public Lokasi saveLokasi(Lokasi lokasi) {
        return lokasiRepository.save(lokasi);
    }

    /**
     * Retrieves all Lokasi entities from the database.
     *
     * @return a list of all Lokasi entities
     */
    public List<Lokasi> getAllLokasi() {
        return lokasiRepository.findAll();
    }

    /**
     * Updates an existing Lokasi entity in the database.
     *
     * @param id the unique identifier of the Lokasi entity to be updated
     * @param lokasiDetails the updated Lokasi entity details
     * @return the updated Lokasi entity
     */
    public Lokasi updateLokasi(Long id, Lokasi lokasiDetails) {
        Lokasi lokasi = lokasiRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Lokasi not found"));
        lokasi.setNamaLokasi(lokasiDetails.getNamaLokasi());
        lokasi.setNegara(lokasiDetails.getNegara());
        lokasi.setProvinsi(lokasiDetails.getProvinsi());
        lokasi.setKota(lokasiDetails.getKota());
        return lokasiRepository.save(lokasi);
    }

    /**
     * Deletes a Lokasi entity from the database.
     *
     * @param id the unique identifier of the Lokasi entity to be deleted
     */
    public void deleteLokasi(Long id) {
        lokasiRepository.deleteById(id);
    }
}