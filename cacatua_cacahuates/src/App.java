import java.util.Scanner;

public class App {

    public class Cacatua {
    
        public static void pideComida(){
            Scanner teclado = new Scanner (System.in);
            boolean quiereComer = true;


            while (quiereComer) {
                System.out.println("Cacatúa!!! Cacahuetes!!!");
                System.out.println("Que comida le das?");
                String comida = teclado.nextLine().toLowerCase();

                if (comida.equals("cacahuetes")) {
                    dormirse();
                    quiereComer = false;
                }
            }
        
        teclado.close();
        
        }
    public static void dormirse(){
        System.out.println("zzZZZzzzZZZ");
    }

    public static void main(String[] args) throws Exception {
    
        pideComida();
        }
    
    }

}
