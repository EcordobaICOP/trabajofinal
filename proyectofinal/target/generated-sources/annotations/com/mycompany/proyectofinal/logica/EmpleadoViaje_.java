package com.mycompany.proyectofinal.logica;

import com.mycompany.proyectofinal.logica.Empleado;
import com.mycompany.proyectofinal.logica.Viaje;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-10-20T12:18:39", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(EmpleadoViaje.class)
public class EmpleadoViaje_ { 

    public static volatile SingularAttribute<EmpleadoViaje, Integer> empleadoViajeID;
    public static volatile SingularAttribute<EmpleadoViaje, Empleado> empleado;
    public static volatile SingularAttribute<EmpleadoViaje, Viaje> viaje;

}