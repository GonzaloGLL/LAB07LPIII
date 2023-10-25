import java.io.*;

class ExcepcionDeVocal extends Exception {
    public ExcepcionDeVocal(String message) {
        super(message);
    }
}

class ExcepcionDeNumero extends Exception {
    public ExcepcionDeNumero(String message) {
        super(message);
    }
}

class ExcepcionDeBlanco extends Exception {
    public ExcepcionDeBlanco(String message) {
        super(message);
    }
}

class ExcepcionDeSalida extends Exception {
    public ExcepcionDeSalida(String message) {
        super(message);
    }
}

class LeerEntrada {
    private BufferedReader reader;

    public LeerEntrada() {
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public char getChar() throws IOException {
        return (char) reader.read();
    }
}

