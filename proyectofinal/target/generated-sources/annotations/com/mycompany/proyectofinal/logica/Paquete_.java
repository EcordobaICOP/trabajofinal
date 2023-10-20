package com.mycompany.proyectofinal.logica;

import com.mycompany.proyectofinal.logica.Cliente;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-10-20T12:18:39", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Paquete.class)
public class Paquete_ { 

    public static volatile SingularAttribute<Paquete, String> descripcion;
    public static volatile SingularAttribute<Paquete, String> estado;
    public static volatile SingularAttribute<Paquete, Integer> paqueteID;
    public static volatile SingularAttribute<Paquete, Cliente> receptor;
    public static volatile SingularAttribute<Paquete, Integer> codigo_paquete;
    public static volatile SingularAttribute<Paquete, String> domicilioEntrega;
    public static volatile SingularAttribute<Paquete, Cliente> emisor;

}