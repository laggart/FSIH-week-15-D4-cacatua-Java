import java.util.Scanner;

public class App {
    public class Calculadora {
        public static double sumar(double a, double b) {
            return a + b;
        }

        public static double restar(double a, double b) {
            return a - b;
        }

        public static double multiplicar(double a, double b) {
            return a * b;
        }

        public static double dividir(double a, double b) {
            if(b != 0) { 
                return a / b;      
            } else { 
                System.out.println("Error: La división entre 0 no está definida");
                return Double.NaN;
            }
        }
    
        public static void main(String[] args) throws Exception {
            Scanner teclado = new Scanner(System.in);
            boolean continuar = true;
            while (continuar) {
                System.out.println("Elige que quieres hacer, (+ - * /)  o 's' para salir:");
                char operacion = teclado.next().charAt(0);
        
                if (operacion == 's') {
                    continuar = false;
                    continue;
                }
                
                System.out.println("Ingresa el primer número");
                double num1 = teclado.nextDouble();
                System.out.println("Ingresa el segundo número:");
                double num2 = teclado.nextDouble();
                
                double resultado;
                switch (operacion) {
                    case '+':
                    resultado = sumar(num1, num2);
                        break;
                        
                    case '-':
                    resultado = restar(num1, num2);
                        break;
                    
                    case '*':
                    resultado = multiplicar(num1, num2);
                        break;
                    
                    case '/':
                    resultado = dividir(num1, num2);
                        break;

                    default:
                    System.out.println("operación nó válida");
                        continue;
                    
                }
                
                System.out.println("El resultado es: " + resultado);
            }

            teclado.close();
        }

    }
}
