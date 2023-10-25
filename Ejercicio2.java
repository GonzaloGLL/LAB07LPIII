

public class Ejercicio2 {
    public static void main(String[] args){
        
        try {
            //aqui
        }
        catch (Exception e){
            System.out.println("excepcion en metodo ");
            e.printStackTrace();
        }
    }
    private static int metodo(String num){
        int valor= 0;
        try {
            valor ++;
            valor += Integer.parseInt(num);
            valor ++;
            System.out.println("Valor al final del catch: "+ valor);
        }
        catch (NumberFormatException e) {
            valor += Integer.parseInt("42");
            System.out.println("valor al final de finally " + valor);
        }
        finally{
            valor ++;
            System.out.println("valor final de finall: "+ valor);
        }
        valor ++;
        System.out.println("valor antes del return" + valor);
        return valor;
    }
    
}
