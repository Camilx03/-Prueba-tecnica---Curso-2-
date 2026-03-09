import entities.Vuelo;
import repository.VueloRepositorio;
import utils.VueloFiltro;
import view.VueloVista;
import java.time.LocalDate;
import java.util.List;

//Clase principal de la aplicacion de gestion de vuelos
public class Main {
    //Constantes de fecha definidas en Main
    private static final LocalDate FECHA_INICIO = LocalDate.of(2025,5,5);
    private static final LocalDate FECHA_FIN = LocalDate.of(2025,5,20);

    public static void main(String[] args) {
        //Obtenemos los 10 vuelos de prueba
        List<Vuelo> datosBrutos = VueloRepositorio.cargarVuelos();

        //Procesamos la informacion
        List<Vuelo> datosFiltrados = VueloFiltro.aplicarFiltro(datosBrutos, FECHA_INICIO, FECHA_FIN);

        //Mostramos la informacion
        VueloVista.imprimirTabla(datosFiltrados, FECHA_INICIO, FECHA_FIN);
    }
}
