package calculadora;

public class Calculadora {

    public int sumar(int a, int b){
        return a + b;
    }

    public int restar(int a, int b){
        return a - b;
    }

    public int multiplicar(int a, int b){
        return a * b;
    }

    public int dividir(int a, int b){
        if (b == 0){
            throw new ArithmeticException( "no se puede divir entre 0");
        }
        return a / b;
    }

}
