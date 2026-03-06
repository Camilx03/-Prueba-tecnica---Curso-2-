package utils;

import entities.Vuelo;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FiltroVuelo {
    public static List<Vuelo> filtrarPorRango(List<Vuelo> vuelos, LocalDate inicio, LocalDate fin) {
        return vuelos.stream()
                .filter(vuelo -> {
                    LocalDate fecha = vuelo.getFechaSalida();
                    if(inicio == null && fin == null) return true;
                    if(inicio == null ) return !fecha.isAfter(fin);
                    if(fin == null) return !fecha.isBefore(inicio);
                    return (fecha.isEqual(inicio) || fecha.isAfter(inicio)) &&
                            (fecha.isEqual(fin) || fecha.isBefore(fecha));
                })
                .sorted(Comparator.comparing(Vuelo::getFechaSalida))
                .collect(Collectors.toList());
    }
}
