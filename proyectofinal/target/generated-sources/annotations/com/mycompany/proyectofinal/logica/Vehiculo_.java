package com.mycompany.proyectofinal.logica;

import com.mycompany.proyectofinal.logica.Marca;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-10-20T12:18:39", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Vehiculo.class)
public class Vehiculo_ { 

    public static volatile SingularAttribute<Vehiculo, Integer> capacidad_carga;
    public static volatile SingularAttribute<Vehiculo, Integer> nro_vehiculo;
    public static volatile SingularAttribute<Vehiculo, Marca> marca;
    public static volatile SingularAttribute<Vehiculo, Integer> vehiculoID;
    public static volatile SingularAttribute<Vehiculo, Integer> patente;

}