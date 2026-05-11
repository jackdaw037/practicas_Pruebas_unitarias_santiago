package Tres_en_raya;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TresEnRayaTest {

    @Test
    void colocarFichaCorrecta() {
        TresEnRaya juego = new TresEnRaya();
        assertTrue(juego.colocarFicha(0, 0, 'X'));
    }

    @Test
    void colocarFueraTablero() {
        TresEnRaya juego = new TresEnRaya();
        assertFalse(juego.colocarFicha(3, 3, 'X'));
    }

    @Test
    void colocarEnCasillaOcupada() {
        TresEnRaya juego = new TresEnRaya();
        juego.colocarFicha(0, 0, 'X');
        assertFalse(juego.colocarFicha(0, 0, 'O'));
    }

    @Test
    void ganarPorFila() {
        TresEnRaya juego = new TresEnRaya();

        juego.colocarFicha(0,0,'X');
        juego.colocarFicha(0,1,'X');
        juego.colocarFicha(0,2,'X');

        assertTrue(juego.hayGanador('X'));
    }

    @Test
    void ganarPorColumna() {
        TresEnRaya juego = new TresEnRaya();

        juego.colocarFicha(0,0,'X');
        juego.colocarFicha(1,0,'X');
        juego.colocarFicha(2,0,'X');

        assertTrue(juego.hayGanador('X'));
    }


    @Test
    void ganarDiagonalPrincipal() {
        TresEnRaya juego = new TresEnRaya();

        juego.colocarFicha(0,0,'X');
        juego.colocarFicha(1,1,'X');
        juego.colocarFicha(2,2,'X');

        assertTrue(juego.hayGanador('X'));
    }


    @Test
    void ganarDiagonalSecundaria() {
        TresEnRaya juego = new TresEnRaya();

        juego.colocarFicha(0,2,'X');
        juego.colocarFicha(1,1,'X');
        juego.colocarFicha(2,0,'X');

        assertTrue(juego.hayGanador('X'));
    }


    @Test
    void partidaSinGanador() {
        TresEnRaya juego = new TresEnRaya();

        juego.colocarFicha(0,0,'X');
        juego.colocarFicha(0,1,'O');
        juego.colocarFicha(0,2,'X');
        juego.colocarFicha(1,0,'O');
        juego.colocarFicha(1,1,'X');
        juego.colocarFicha(1,2,'O');
        juego.colocarFicha(2,0,'O');
        juego.colocarFicha(2,1,'X');
        juego.colocarFicha(2,2,'O');

        assertFalse(juego.hayGanador('X'));
        assertFalse(juego.hayGanador('O'));
    }
}