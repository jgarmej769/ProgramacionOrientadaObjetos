package ProyectoBiblioteca;

    public class Libro {
        private String autor;
        private String titulo;
        private int ejemplaresVendidos;
        private Libro secuela;
        private Libro precuela;

        public Libro (String autor, String titulo){
            this.autor = autor;
            this.titulo = titulo;
        }
        //------------GETTER y SETTER---------------
        public Libro getSecuela() {
            return secuela;
        }

        public Libro getPrecuela() {
            return precuela;
        }

        public String getTitulo() {
            return titulo;
        }
        //-------------METODOS--------------------
        public void obtenerInformacion(){
            System.out.println("El libro " + this.titulo + " es de " + this.autor +" y ha vendido un total de : " + this.ejemplaresVendidos + " ejemplares." );
        }
        public void registrarVenta (int numVentas){
            this.ejemplaresVendidos += numVentas;
        }

        public String obtenerTituloSecuela (){
            String titulo = this.secuela.getSecuela().getTitulo();
            return titulo;
        }

        public String obtenerTiruloPreciela(){
            String titulo = this.precuela.getPrecuela().getTitulo();
            return titulo;
        }


    }

