abstract class Actividad {
    String titulo;
    String dia;

    Actividad(String titulo, String dia) {
        this.titulo = titulo;
        this.dia = dia;
    }

    abstract void ver();
}

class Musica extends Actividad {
    Musica(String titulo, String dia) {
        super(titulo, dia);
    }

    @Override
    void ver() {
        System.out.println("Musica: " + titulo + " - " + dia);
    }
}

class Charla extends Actividad {
    Charla(String titulo, String dia) {
        super(titulo, dia);
    }

    @Override
    void ver() {
        System.out.println("Charla: " + titulo + " - " + dia);
    }
}

interface Tiempo {
    void mostrarTiempo();
}

class MusicaConTiempo extends Musica implements Tiempo {
    String estado;

    MusicaConTiempo(String titulo, String dia, String estado) {
        super(titulo, dia);
        this.estado = estado;
    }

    @Override
    public void mostrarTiempo() {
        System.out.println("Clima: " + estado);
    }

    @Override
    void ver() {
        super.ver();
        mostrarTiempo();
    }
}

class Persona {
    String nombre;

    Persona(String nombre) {
        this.nombre = nombre;
    }

    void ver() {
        System.out.println("Persona: " + nombre);
    }
}
    