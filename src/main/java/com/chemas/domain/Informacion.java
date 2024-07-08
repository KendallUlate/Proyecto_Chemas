package com.chemas.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "informacion")
public class Informacion implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_informacion")
    private long idInformacion;

    private String descripcion;

    private boolean activo;
    
    

     public Informacion() {
    }
    
}
