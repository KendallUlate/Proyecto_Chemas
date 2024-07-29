/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.chemas.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author XPC
 */

@Data
@Entity
@Table(name = "chemas")
public class Principal implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Chema")
    private Long idChema;
    
    @Column(name = "precio")
    private int precio;
    
    @Column(name = "talla")
    private String talla;
    
    @Column(name = "tipo")
    private String tipo;
    
    @Column(name = "ruta_imagen")
    private String rutaImagen;
    
    public Principal() {
    }
    
}
