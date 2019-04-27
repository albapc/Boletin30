public class Seleccionador extends SeleccionFutbol {

    public Seleccionador() {
    }

    public Seleccionador(int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
    }

    public void seleccionarJugador() {
        System.out.println("Se selecciona a un jugador.");
    }

    @Override
    public void concentrarse() {
        System.out.println("Se concentra el seleccionador");
    }

    @Override
    public void viajar() {
        System.out.println("Viaja el seleccionador");
    }

    @Override
    public void entrenar() {
        System.out.println("Entrena el seleccionador");
    }

    @Override
    public void jugarPartido() {
        System.out.println("El seleccionador juega un partido");
    }

    @Override
    public String toString() {
        return "Seleccionador{" +
                "id= " + id +
                ", nombre= '" + nombre + '\'' +
                ", apellidos= '" + apellidos + '\'' +
                ", edad= " + edad +
                '}';
    }
}
