
package com.mycompany.proyectofinal.logica;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

    @Entity
    @Table(name = "Marca")
    public class Marca implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "marcaID")
    private Integer marcaID;

    @Column(name = "modelo")
    private String modelo;

    @Column(name = "tipo")
    private String tipo;

    public Marca() {
    }

    public Marca(Integer marcaID, String modelo, String tipo) {
        this.marcaID = marcaID;
        this.modelo = modelo;
        this.tipo = tipo;
    }

    public Integer getMarcaID() {
        return marcaID;
    }

    public void setMarcaID(Integer marcaID) {
        this.marcaID = marcaID;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
        
}
