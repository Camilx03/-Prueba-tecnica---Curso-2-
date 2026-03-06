import entities.Vuelo;
import utils.FiltroVuelo;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        List<Vuelo> listaVuelos = cargaDatosPrueba();

        //Filtro1: Sin fechas(Debe devolver los 10)
        //comprobarFiltro("CASO 1: Sin fechas",listaVuelos,null,null);

        //Filtro2: Solo fechaFin(Vuelos hasta el 10 de mayo)
        //comprobarFiltro("CASO 2: Solo fechaFin (Hasta 2025-05-10)",listaVuelos,null,LocalDate.of(2025,5,20));

        //Filtro3: Solo fechaInicio(Desde el 20 de mayo en adelante)
        //comprobarFiltro("CASO 3: solo fechaInicio (Desde 2025-05-20)",listaVuelos,LocalDate.of(2025,5,20),null);

        //Filtro4: Rango completo(Entre el 5 y el 15 de mayo)
        comprobarFiltro("CASO 4: Rango completo (05 al 15 de mayo)",listaVuelos,LocalDate.of(2025,5,5),LocalDate.of(2025,5,15));
    }

    private static void comprobarFiltro(String titulo, List<Vuelo> vuelos, LocalDate inicio, LocalDate fin) {
        System.out.println("\n" + "=".repeat(20));
        System.out.println(titulo);
        System.out.println("=".repeat(20));

        List<Vuelo> resultados = FiltroVuelo.filtrarPorRango(vuelos, inicio, fin);

        if (resultados.isEmpty()) {
            System.out.println("No hay vuelos en este rango.");
        }else {
            resultados.forEach(System.out::println);
        }
    }

    private static List<Vuelo> cargaDatosPrueba() {
        List<Vuelo> vuelos = new ArrayList<>();
        vuelos.add(new Vuelo(1, "H-01", "Iberia", "Madrid", "NY", LocalDate.of(2025, 5, 10), LocalDate.of(2025, 5, 11)));
        vuelos.add(new Vuelo(2, "H-02", "Turkish", "Barcelona", "Estambul", LocalDate.of(2025, 5, 25), LocalDate.of(2025, 5, 26)));
        vuelos.add(new Vuelo(3, "H-03", "Aerolineas", "BA", "Madrid", LocalDate.of(2025, 5, 5), LocalDate.of(2025, 5, 6)));
        vuelos.add(new Vuelo(4, "H-04", "Delta", "NY", "Barcelona", LocalDate.of(2025, 5, 20), LocalDate.of(2025, 5, 21)));
        vuelos.add(new Vuelo(5, "H-05", "Air France", "Madrid", "Paris", LocalDate.of(2025, 4, 30), LocalDate.of(2025, 4, 30)));
        vuelos.add(new Vuelo(6, "H-06", "Lufthansa", "Frankfurt", "Madrid", LocalDate.of(2025, 5, 12), LocalDate.of(2025, 5, 12)));
        vuelos.add(new Vuelo(7, "H-07", "British", "Londres", "NY", LocalDate.of(2025, 5, 2), LocalDate.of(2025, 5, 3)));
        vuelos.add(new Vuelo(8, "H-08", "Air Europa", "Madrid", "Miami", LocalDate.of(2025, 5, 22), LocalDate.of(2025, 5, 23)));
        vuelos.add(new Vuelo(9, "H-09", "Emirates", "Dubai", "Madrid", LocalDate.of(2025, 5, 15), LocalDate.of(2025, 5, 16)));
        vuelos.add(new Vuelo(10, "H-10", "Iberia", "Sevilla", "Barcelona", LocalDate.of(2025, 6,1),LocalDate.of(2025,6,1)));
        return vuelos;
    }
}
