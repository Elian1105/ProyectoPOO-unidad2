package uni1a;


public class Entrevista extends ContenidoAudiovisual {

    private String entrevistado;
    private Investigador investigador;

    public Entrevista(String titulo, int duracionEnMinutos,
                      String genero, String entrevistado,
                      Investigador investigador) {
    	System.out.println("Investigador: "
    	        + investigador.getNombre());

        super(titulo, duracionEnMinutos, genero);
        this.entrevistado = entrevistado;
        this.investigador = investigador;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la Entrevista:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Entrevistado: " + entrevistado);
        System.out.println();
    }
}