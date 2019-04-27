import java.util.ArrayList;

public class Aplicacion {

    public static void main(String[] args) {
        ArrayList<SeleccionFutbol> equipo = new ArrayList<>();

        equipo.add(new Futbolista(786, "Cristiano", "Ronaldo", 34, 7, "Delantero"));
        equipo.add(new Entrenador(784, "Zinedine", "Zidane", 46, 60));
        equipo.add(new Masajista(787, "Manuel", "Rodriguez", 47, "Fisioterapia", 23));
        equipo.add(new Seleccionador(800, "Luis Enrique", "Martinez", 48));

        for (SeleccionFutbol seleccionFutbol : equipo) {
            System.out.println(seleccionFutbol);
        }
    }
}
