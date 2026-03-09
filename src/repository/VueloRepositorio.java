package repository;

import entities.Vuelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//Clase encargada de simular una base de datos, aplica el principio de division de responsabilidades.
public class VueloRepositorio {
    //Este metodo crea y devuelve una lista con los 10 vuelos de prueba
    public static List<Vuelo> cargarVuelos(){
        List<Vuelo> vuelos = new ArrayList<>();
        //Añadimos 10 vuelos de prueba con distintas aerolineas y fechas
        vuelos.add(new Vuelo(1, "IB320", "Iberia", "Madrid", "Barcelona", LocalDate.of(2025, 5, 10), LocalDate.of(2025, 5, 10)));
        vuelos.add(new Vuelo(2, "TK442", "Turkish", "Estambul", "New York", LocalDate.of(2025, 5, 25), LocalDate.of(2025, 5, 26)));
        vuelos.add(new Vuelo(3, "AR114", "Aerolíneas", "Buenos Aires", "Madrid", LocalDate.of(2025, 5, 2), LocalDate.of(2025, 5, 3)));
        vuelos.add(new Vuelo(4, "DL889", "Delta", "New York", "Sevilla", LocalDate.of(2025, 5, 18), LocalDate.of(2025, 5, 19)));
        vuelos.add(new Vuelo(5, "AF990", "Air France", "París", "Madrid", LocalDate.of(2025, 4, 30), LocalDate.of(2025, 4, 30)));
        vuelos.add(new Vuelo(6, "LH112", "Lufthansa", "Frankfurt", "Madrid", LocalDate.of(2025, 5, 12), LocalDate.of(2025, 5, 12)));
        vuelos.add(new Vuelo(7, "BA223", "British", "Londres", "Barcelona", LocalDate.of(2025, 5, 8), LocalDate.of(2025, 5, 9)));
        vuelos.add(new Vuelo(8, "UX041", "Air Europa", "Madrid", "Miami", LocalDate.of(2025, 5, 20), LocalDate.of(2025, 5, 21)));
        vuelos.add(new Vuelo(9, "EK001", "Emirates", "Dubai", "New York", LocalDate.of(2025, 5, 15), LocalDate.of(2025, 5, 16)));
        vuelos.add(new Vuelo(10, "IB600", "Iberia", "Madrid", "Santiago", LocalDate.of(2025, 6, 1), LocalDate.of(2025, 6, 1)));
        return vuelos;
    }
}
