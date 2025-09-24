public class PaginaPrincipal {
    public static void main(String[] args) {
        Persona p1 = new Persona("Lucia");
        Persona p2 = new Persona("Mateo");

        Musica m1 = new Musica("Fiesta Urbana", "12/10/2025");
        Charla ch1 = new Charla("Ciencia Joven", "20/10/2025");
        MusicaConTiempo mt1 = new MusicaConTiempo("Tarde Jazz", "05/11/2025", "Lluvioso");

        p1.ver();
        p2.ver();

        m1.ver();
        ch1.ver();
        mt1.ver();
    }
}
