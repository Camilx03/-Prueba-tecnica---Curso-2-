import entities.Vuelo;
import repository.VueloRepositorio;
import utils.VueloFiltro;
import view.VueloVista;
import java.time.LocalDate;
import java.util.List;

//Clase principal de la aplicacion de gestion de vuelos
public class Main {
    //Constantes de fecha definidas en Main, pueden ser nulas
    private static final LocalDate FECHA_INICIO = LocalDate.of(2025,5,5);
    private static final LocalDate FECHA_FIN = LocalDate.of(2025,5,20);

    public static void main(String[] args) {
        //Obtenemos los 10 vuelos de prueba
        List<Vuelo> datosBrutos = VueloRepositorio.cargarVuelos();

        System.out.println("--- PRUEBAS DE FILTRADO ---");
        //CASO 1: Rango completo (FECHA INICIO y FECHA FIN)
        //Se envian ambas constantes, debe devolver vuelos entre el 05/05 y 05/20
        System.out.println("\n>>> Prueba 1: Filtrado rango completo");
        List<Vuelo> casoRango = VueloFiltro.aplicarFiltro(datosBrutos, FECHA_INICIO, FECHA_FIN);
        VueloVista.imprimirTabla(casoRango, FECHA_INICIO, FECHA_FIN);

        //CASO 2: Sin fecha de inicio (SOLO FECHA FIN)
        //Al enviar null en inicio, devuelve todos los vuelos hasta el 05/20
        System.out.println("\n>>> Prueba 2: Filtrando sin fecha de inicio");
        List<Vuelo> casoSinInicio = VueloFiltro.aplicarFiltro(datosBrutos, null, FECHA_FIN);
        VueloVista.imprimirTabla(casoSinInicio, null, FECHA_FIN);

        //CASO 3: Sin fecha fin (SOLO FECHA INICIO)
        //Igual que el caso 2, devuelve vuelos desde el 05/05 en adelante
        System.out.println("\n>>> Prueba 3: Filtrando sin fecha fin");
        List<Vuelo> casoSinFin = VueloFiltro.aplicarFiltro(datosBrutos, FECHA_INICIO, null);
        VueloVista.imprimirTabla(casoSinFin, FECHA_INICIO, null);

        //CASO 4: Sin filtros (AMBOS NULOS)
        //Devuelve la lista completa, todos devuelven el orden por la fechaSalida
        System.out.println("\n>>> Prueba 4: Sin fechas enviadas (Muestra todos los vuelos ordenados)");
        List<Vuelo> casoTodo = VueloFiltro.aplicarFiltro(datosBrutos, null, null);
        VueloVista.imprimirTabla(casoTodo, null, null);

        System.out.println("--- FIN DE LAS PRUEBAS DE FILTRADO ---");
    }
}
