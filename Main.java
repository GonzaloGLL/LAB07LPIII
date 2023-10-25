public class Main {
    public static void main(String[] args) {
        LeerEntrada entrada = new LeerEntrada();

        while (true) {
            try {
                entrada.procesar();
            } catch (ExcepcionVocal e) {
                System.out.println(e.getMessage());
            } catch (ExcepcionNumero e) {
                System.out.println(e.getMessage());
            } catch (ExcepcionBlanco e) {
                System.out.println(e.getMessage());
            } catch (ExcepcionSalida e) {
                System.out.println(e.getMessage());
                break; 
            }
        }
    }
}

