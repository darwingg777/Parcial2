public class EspacioRecrecional{

    private String nombre;
    private String tipo;
    private int capacidad;
    private String[] horariosDisponibles;
    private int[] reservas;

    public EspacioRecrecional(String nombre, String tipo, int capacidad, String[] horariosDisponibles) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.horariosDisponibles = horariosDisponibles;
        this.reservas = new int[horariosDisponibles.length]; 
    }

    
    public boolean reservar(String horario) {
        for (int i = 0; i < horariosDisponibles.length; i++) {
            if (horariosDisponibles[i].equals(horario) && reservas[i] < capacidad) {
                reservas[i]++;
                return true;
            }
        }
        return false;
    }

    public void cancelarReserva(String horario) {
        for (int i = 0; i < horariosDisponibles.length; i++) {
            if (horariosDisponibles[i].equals(horario) && reservas[i] > 0) {
                reservas[i]--;
            }
        }
    }

    public void mostrarDisponibilidad() {
        System.out.println("Disponibilidad para " + nombre + ":");
        for (int i = 0; i < horariosDisponibles.length; i++) {
            if (reservas[i] < capacidad) {
                System.out.println(" - " + horariosDisponibles[i]);
            }
        }
    }

    public String GetNombre(){
        return nombre;
    }

}

class Estudiante {
    private String nombre;
    private String id;

    public Estudiante(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    public boolean reservarEspacio(EspacioRecrecional espacio, String horario) {
        return espacio.reservar(horario);
    }

    public void cancelarReserva(EspacioRecrecional espacio, String horario) {
        espacio.cancelarReserva(horario);
    }

    public String getNombre() {
        return nombre;
    }
}

    public static void main(String[] args){
        
       
    }

}
