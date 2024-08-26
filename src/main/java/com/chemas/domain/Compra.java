package com.chemas.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "compra")
public class Compra implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_compra")
    private Long idCompra;

    @Column(name = "cantidad")
    private int cantidad;

    @Column(name = "talla")
    private String talla;

    @Column(name = "tarjeta")
    private String tarjeta;

    @Column(name = "codigo")
    private String codigo;

    @Column(name = "encargado")
    private String encargado;

    @ManyToOne
    @JoinColumn(name = "id_chema")
    private Principal principal;

    public Compra() {
    }


    public Compra(int cantidad, String talla, String tarjeta, String codigo, String encargado, Principal principal) {
        this.cantidad = cantidad;
        this.talla = talla;
        this.tarjeta = tarjeta;
        this.codigo = codigo;
        this.encargado = encargado;
        this.principal = principal;
    }
}
