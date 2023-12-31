
package com.mycompany.proyectofinal.logica;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Paquete")
public class Paquete implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "paqueteID")
    private Integer paqueteID;

    @Column(name = "codigo_paquete")
    private Integer codigo_paquete;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "domicilioEntrega")
    private String domicilioEntrega;

    @Column(name = "estado")
    private String estado;

    @ManyToOne
    @JoinColumn(name = "clienteID")
    private Cliente emisor;

    @ManyToOne
    @JoinColumn(name = "clienteID")
    private Cliente receptor;

    public Paquete() {
    }

    public Paquete(Integer paqueteID, Integer codigo_paquete, String descripcion, String domicilioEntrega, String estado, Cliente emisor, Cliente receptor) {
        this.paqueteID = paqueteID;
        this.codigo_paquete = codigo_paquete;
        this.descripcion = descripcion;
        this.domicilioEntrega = domicilioEntrega;
        this.estado = estado;
        this.emisor = emisor;
        this.receptor = receptor;
    }

    public Integer getPaqueteID() {
        return paqueteID;
    }

    public void setPaqueteID(Integer paqueteID) {
        this.paqueteID = paqueteID;
    }

    public Integer getCodigo_paquete() {
        return codigo_paquete;
    }

    public void setCodigo_paquete(Integer codigo_paquete) {
        this.codigo_paquete = codigo_paquete;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDomicilioEntrega() {
        return domicilioEntrega;
    }

    public void setDomicilioEntrega(String domicilioEntrega) {
        this.domicilioEntrega = domicilioEntrega;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Cliente getEmisor() {
        return emisor;
    }

    public void setEmisor(Cliente emisor) {
        this.emisor = emisor;
    }

    public Cliente getReceptor() {
        return receptor;
    }

    public void setReceptor(Cliente receptor) {
        this.receptor = receptor;
    }
    
    
}
