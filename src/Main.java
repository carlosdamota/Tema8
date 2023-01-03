public class Main {
    public static void main(String[] args) {

        Persona perosna1 = new Persona();
        perosna1.setEdad(30);
        perosna1.setNombre("Carlos");
        perosna1.setTelefono(666666666);

        System.out.println("Edad: " + perosna1.getEdad());
        System.out.println("Nombre: " + perosna1.getNombre());
        System.out.println("Numero de telefono: " + perosna1.getTelefono());
    }
}
    class Persona{
        private int edad;
        private String nombre;
        private int telefono;

        public void setEdad (int edad){

            this.edad = edad;
        }

        public int getEdad() {
            return edad;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getNombre() {
            return nombre;
        }

        public void setTelefono(int telefono) {
            this.telefono = telefono;
        }

        public int getTelefono() {
            return telefono;
        }
    }

