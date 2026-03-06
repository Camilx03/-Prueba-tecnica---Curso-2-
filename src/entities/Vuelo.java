package entities;

import java.time.LocalDate;

public class Vuelo {
    private int id;
    private String nombreVuelo;
    private String empresa;
    private String lugarSalida;
    private String lugarLLegada;
    private LocalDate fechaSalida;
    private LocalDate fechaLLegada;

    public Vuelo(int id, String nombreVuelo, String empresa, String lugarSalida, String lugarLLegada, LocalDate fechaSalida, LocalDate fechaLLegada) {
        this.id = id;
        this.nombreVuelo = nombreVuelo;
        this.empresa = empresa;
        this.lugarSalida = lugarSalida;
        this.lugarLLegada = lugarLLegada;
        this.fechaSalida = fechaSalida;
        this.fechaLLegada = fechaLLegada;
    }

    public LocalDate getFechaSalida() {return fechaSalida;}

    @Override
    public String toString() {
        return String.format("ID: %-3d | %-10s | %-15s | %s -> %s | Salida: %s",
                id, nombreVuelo, empresa, lugarSalida, lugarLLegada, fechaSalida);
    }
}
