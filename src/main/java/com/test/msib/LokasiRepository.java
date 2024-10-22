/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.test.msib;

import com.test.msib.Lokasi;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * The LokasiRepository interface extends the JpaRepository interface
 * and provides methods for interacting with the Lokasi entity.
 *
 * @author user
 */
public interface LokasiRepository extends JpaRepository<Lokasi, Long> {
}