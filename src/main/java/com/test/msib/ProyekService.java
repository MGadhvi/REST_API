/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.test.msib;

import com.test.msib.Proyek;
import com.test.msib.ProyekRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * The ProyekService class provides methods for managing the Proyek entity.
 * It uses the ProyekRepository interface to interact with the database.
 *
 * @author user
 */
@Service
public class ProyekService {

    /**
     * The ProyekRepository instance used for database operations.
     */
    @Autowired
    private ProyekRepository proyekRepository;

    /**
     * Saves a new Proyek entity to the database.
     *
     * @param proyek the Proyek entity to be saved
     * @return the saved Proyek entity
     */
    public Proyek saveProyek(Proyek proyek) {
        return proyekRepository.save(proyek);
    }

    /**
     * Retrieves all Proyek entities from the database.
     *
     * @return a list of all Proyek entities
     */
    public List<Proyek> getAllProyek() {
        return proyekRepository.findAll();
    }

    /**
     * Updates an existing Proyek entity in the database.
     *
     * @param id the unique identifier of the Proyek entity to be updated
     * @param proyekDetails the updated Proyek entity details
     * @return the updated Proyek entity
     */
    public Proyek updateProyek(Long id, Proyek proyekDetails) {
        Proyek proyek = proyekRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Proyek not found"));
        proyek.setNamaProyek(proyekDetails.getNamaProyek());
        proyek.setClient(proyekDetails.getClient());
        proyek.setTglMulai(proyekDetails.getTglMulai());
        proyek.setTglSelesai(proyekDetails.getTglSelesai());
        proyek.setPimpinanProyek(proyekDetails.getPimpinanProyek());
        proyek.setKeterangan(proyekDetails.getKeterangan());
        proyek.setLokasi(proyekDetails.getLokasi());
        return proyekRepository.save(proyek);
    }

    /**
     * Deletes a Proyek entity from the database.
     *
     * @param id the unique identifier of the Proyek entity to be deleted
     */
    public void deleteProyek(Long id) {
        proyekRepository.deleteById(id);
    }
}