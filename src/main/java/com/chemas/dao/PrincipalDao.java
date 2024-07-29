/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.chemas.dao;

import com.chemas.domain.Principal;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author XPC
 */
public interface PrincipalDao extends JpaRepository<Principal, Long>{
    
}
