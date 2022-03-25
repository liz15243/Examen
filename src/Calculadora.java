public class Calculadora {
    private String marca;
    private boolean esCientifica;
    private double primerValor;
    private double segundoValor;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isEsCientifica() {
        return esCientifica;
    }

    public void setEsCientifica(boolean esCientifica) {
        this.esCientifica = esCientifica;
    }

    public double getPrimerValor() {
        return primerValor;
    }

    public void setPrimerValor(double primerValor) {
        this.primerValor = primerValor;
    }

    public double getSegundoValor() {
        return segundoValor;
    }

    public void setSegundoValor(double segundoValor) {
        this.segundoValor = segundoValor;
    }

    public Calculadora(String marca, boolean esCientifica) {
        this.marca = marca;
        this.esCientifica = esCientifica;
    }

    public double sumar (){
        return primerValor+segundoValor;
    }
    public double restar(){
        return primerValor-segundoValor;
    }
    public double multiplicar(){
        return primerValor*segundoValor;
    }
    public double dividir(){
        if(segundoValor == 0){
            System.out.println("No se puede hacer la division");
        }

        return primerValor/segundoValor;
    }
    public double elevarPotencia () {
        double pow = 0;
        if (esCientifica == true) {
            pow = (Math.pow(primerValor, segundoValor));
        } else {
            System.out.println("Su calculadora no es cientifica ");
        }
        return pow;
    }

    @Override
    public String toString() {
        return "La calculadora es de marca" + " "+ marca + " " + "y" +" "+ esCientifica ;
    }
}
