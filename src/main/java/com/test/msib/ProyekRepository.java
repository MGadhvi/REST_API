/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.test.msib;

import com.test.msib.Proyek;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * The ProyekRepository interface extends the JpaRepository interface
 * and provides methods for interacting with the Proyek entity.
 *
 * @author user
 */
public interface ProyekRepository extends JpaRepository<Proyek, Long> {}