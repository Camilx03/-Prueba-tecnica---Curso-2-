package entities;

import java.time.LocalDate;
//Esta clase es el molde que define que datos tiene un Vuelo, usamos el principio de encapsulamiento (datos privados)
public class Vuelo {
    //Atributos o caracteristicas del vuelo
    private int id;
    private String nombreVuelo;
    private String empresa;
    private String lugarSalida;
    private String lugarLLegada;
    private LocalDate fechaSalida;
    private LocalDate fechaLLegada;

    //El constructor sirve para crear el objeto con todos sus datos desde el principio
    public Vuelo(int id, String nombreVuelo, String empresa, String lugarSalida, String lugarLLegada, LocalDate fechaSalida, LocalDate fechaLLegada) {
        this.id = id;
        this.nombreVuelo = nombreVuelo;
        this.empresa = empresa;
        this.lugarSalida = lugarSalida;
        this.lugarLLegada = lugarLLegada;
        this.fechaSalida = fechaSalida;
        this.fechaLLegada = fechaLLegada;
    }

    //Este metodo es necesario para que otras clases puedan leer la fecha de salida
    public LocalDate getFechaSalida() {return fechaSalida;}

    //El metodo toString define como se vera el vuelo cuando lo imprimimos en la consola
    @Override
    public String toString() {
        //Usamos String.format para que los datos salgan en columnas ordenadas
        return String.format("ID: %-3d | %-8s | %-12s | %-12s -> %-15s | Salida: %s | Llegada: %s",
                id, nombreVuelo, empresa, lugarSalida, lugarLLegada, fechaSalida, fechaLLegada);
    }
}
