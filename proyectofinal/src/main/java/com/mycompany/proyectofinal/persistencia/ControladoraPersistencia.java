
package com.mycompany.proyectofinal.persistencia;

public class ControladoraPersistencia {
    
    ClienteJpaController cliente = new ClienteJpaController();
    
    DetalleMantenimientoJpaController detalleMantenimiento = new DetalleMantenimientoJpaController();
    
    EmpleadoJpaController empleado = new EmpleadoJpaController();
    
    EmpleadoViajeJpaController empleadoViaje = new EmpleadoViajeJpaController();
    
    MantenimientoJpaController mantenimiento = new MantenimientoJpaController();
    
    MarcaJpaController marca = new MarcaJpaController();
    
    PaqueteJpaController paquete = new PaqueteJpaController();
    
    ParteDiarioJpaController parteDiario = new ParteDiarioJpaController();
    
    VehiculoJpaController vehiculo = new VehiculoJpaController();
    
    ViajeJpaController viaje = new ViajeJpaController();
    
    ViajePaqueteJpaController viajePaquete = new ViajePaqueteJpaController();
    
}
