import java.util.Scanner;

class LeerEntrada {
    private char caracterLeido;

    public char getChar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un carácter: ");
        return scanner.next().charAt(0);
    }

    public void procesar() throws ExcepcionVocal, ExcepcionNumero, ExcepcionBlanco, ExcepcionSalida {
        caracterLeido = getChar();
    
        if (Character.isLetter(caracterLeido)) {
            char letra = Character.toLowerCase(caracterLeido);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                throw new ExcepcionVocal();
            }
        } else if (Character.isDigit(caracterLeido)) {
            throw new ExcepcionNumero();
        } else if (Character.isWhitespace(caracterLeido)) {
            throw new ExcepcionBlanco();
        } else if (caracterLeido == 'X') { 
            throw new ExcepcionSalida();
        }
    }
    
}
