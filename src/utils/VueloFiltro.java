package utils;

import entities.Vuelo;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Utilidad para el procesamiento de colecciones del vuelo
public class VueloFiltro {
    public static List<Vuelo> aplicarFiltro(List<Vuelo> vuelos, LocalDate inicio, LocalDate fin) {
        return vuelos.stream()
                .filter(vuelo -> {
                    LocalDate fecha = vuelo.getFechaSalida();
                    //1. Si no hay fechas, devolver todos
                    if(inicio == null && fin == null) return true;
                    //2. Si no hay inicio, devolver hasta fin
                    if(inicio == null ) return !fecha.isAfter(fin);
                    //3. Si no hay fin, devolver desde inicio en adelante
                    if(fin == null) return !fecha.isBefore(inicio);
                    //4. Si estan ambas, devolver rango inclusivo
                    return (fecha.isEqual(inicio) || fecha.isAfter(inicio)) &&
                            (fecha.isEqual(fin) || fecha.isBefore(fin));
                })
                //Devolver siempre ordenados por fechaSalida
                .sorted(Comparator.comparing(Vuelo::getFechaSalida))
                .collect(Collectors.toList());
    }
}
