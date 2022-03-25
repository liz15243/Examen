public class Main {
    public static void main(String[] args) {
        Calculadora basica = new Calculadora("Patito",false);
        basica.setPrimerValor(284.9);
        basica.setSegundoValor(0.0);
        System.out.println("Suma: " + basica.sumar());
        System.out.println("Resta: " + basica.restar());
        System.out.println("Multiplicacion: " + basica.multiplicar());
        System.out.println("Dvidir; " + basica.dividir());
        System.out.println("Potencia de "+ basica.getPrimerValor()+ " ^ "+ basica.getSegundoValor());
        System.out.println(basica.elevarPotencia());
        System.out.println(basica.toString());

        System.out.println();

        Calculadora cientifica = new Calculadora("Casio",true);
        cientifica.setPrimerValor(45.83);
        cientifica.setSegundoValor(13.6);
        System.out.println("Suma: " + cientifica.sumar());
        System.out.println("Resta: " + cientifica.restar());
        System.out.println("Multiplicacion: " + cientifica.multiplicar());
        System.out.println("Dvidir; " + cientifica.dividir());
        System.out.println("Potencia de "+ cientifica.getPrimerValor()+ " ^ "+ cientifica.getSegundoValor());
        System.out.println(cientifica.elevarPotencia());
        System.out.println(cientifica.toString());



    }
}
