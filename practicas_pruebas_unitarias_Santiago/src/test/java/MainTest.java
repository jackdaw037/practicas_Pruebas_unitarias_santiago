import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    void testSumar(){

        Main calc = new Main();

        int resultado = calc.sumar(3,5);

        assertEquals(8, resultado);
    }
}