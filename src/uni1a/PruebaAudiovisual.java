package uni1a;

public class PruebaAudiovisual {
	public static void main(String[] args) {

		  // Objetos de apoyo
        Actor actor1 = new Actor("Keanu Reeves");

        Temporada temporada1 = new Temporada(5);

        Investigador investigador1 =
                new Investigador("Carl Sagan");

        // Objetos principales
        Pelicula pelicula1 =
                new Pelicula(
                        "Matrix",
                        136,
                        "Ciencia Ficcion",
                        "Warner Bros");

        SerieDeTV serie1 =
                new SerieDeTV(
                        "Breaking Bad",
                        50,
                        "Drama",
                        5);

        Documental documental1 =
                new Documental(
                        "El Universo",
                        90,
                        "Cientifico",
                        "Astronomia");

        Podcast podcast1 =
                new Podcast(
                        "Ciencia para Todos",
                        45,
                        "Educativo",
                        "Juan Perez",
                        investigador1);

        Entrevista entrevista1 =
                new Entrevista(
                        "Conversaciones Cientificas",
                        30,
                        "Informativo",
                        "Neil Tyson",
                        investigador1);

        pelicula1.mostrarDetalles();
        serie1.mostrarDetalles();
        documental1.mostrarDetalles();
        podcast1.mostrarDetalles();
        entrevista1.mostrarDetalles();
    }
}
