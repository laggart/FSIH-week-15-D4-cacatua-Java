public class saludarApp {
    public static void main(String[] args) throws Exception {

        String resultadoSaludo = saludar();
        System.out.println(resultadoSaludo);
        String nombre = "Juan";
        String saludo = "Como estas? ";
        saludarSinParams();
        saludarConParams(nombre, saludo); 
        String mensaje = saludarConRetorno("Hola", "Juan");
        System.out.println(mensaje);

    }

    public static String saludar() {
        return "Hola Juan 1";
    }

    public static void saludarSinParams(){
        System.out.println("Hola Juan");
    }

    public static void saludarConParams(String nombre, String saludo){
        System.out.println(saludo + " " + nombre);

    }

    public static String saludarConRetorno(String saludo, String nombre) {
       return saludo + " " + nombre;
    }

    
}
