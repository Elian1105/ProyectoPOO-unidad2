package uni1a;

public class Podcast extends ContenidoAudiovisual {

    private String anfitrion;
    private Investigador investigador;

    public Podcast(String titulo, int duracionEnMinutos,
                   String genero, String anfitrion,
                   Investigador investigador) {
    	System.out.println("Investigador: "
    	        + investigador.getNombre());

        super(titulo, duracionEnMinutos, genero);
        this.anfitrion = anfitrion;
        this.investigador = investigador;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del Podcast:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Anfitrión: " + anfitrion);
        System.out.println();
    }
}