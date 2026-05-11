package calculadora;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    Calculadora calc = new Calculadora();

    @Test
    void sumaPos(){
        assertEquals(8, calc.sumar(3,5));
    }

    @Test
    void sumaNeg(){
        assertEquals(-8, calc.sumar(-3, -5));
    }

    @Test
    void resta(){
        assertEquals(10, calc.restar(20, 10));
    }

    @Test
    void multiplicacion(){
        assertEquals(0,calc.multiplicar(2, 0));
    }

    @Test
    void divicionBasica(){
        assertEquals(2, calc.dividir(4, 2));
    }

    @Test
    void divicionCero(){
        assertThrows(ArithmeticException.class,() -> {

            calc.dividir(2, 0);
        });
    }

    @Test
    void divicionNeg(){
        assertEquals(2, calc.dividir(-4, -2));
    }
}
