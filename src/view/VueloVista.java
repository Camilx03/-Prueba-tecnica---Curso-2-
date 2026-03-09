package view;

import entities.Vuelo;

import java.time.LocalDate;
import java.util.List;

//Clase responsable de mostrar los datos en la terminal
public class VueloVista {
    //Imprime los resultados del filtrado de forma estetica
    public static void imprimirTabla(List<Vuelo> vuelo, LocalDate inicio, LocalDate fin) {
        System.out.println("=== SISTEMA DE GESTION DE VUELOS ===");
        //Mostramos que filtro estamos aplicando para que el usuario sepa que esta viendo
        System.out.println("Filtro: " + (inicio != null ? inicio : "---") + " a " + (fin != null ? fin : "---"));
        System.out.println("---------------------------------------------------------------------------------");

        //Verificamos si la lista esta vacia antes de intentar imprimir
        if (vuelo.isEmpty()) {
            System.out.println("No se encontraron resultados");
        }else {
            //Imprimimos cada vuelo de la lista uno por uno
            vuelo.forEach(System.out::println);
        }
        System.out.println("---------------------------------------------------------------------------------");

    }
}
