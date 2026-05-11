package Tres_en_raya;

public class TresEnRaya {

    private char[][] tablero;

    public TresEnRaya() {
        tablero = new char[3][3];
    }

    public boolean colocarFicha(int fila, int col, char jugador) {

        if (fila < 0 || fila > 2 || col < 0 || col > 2) {
            return false;
        }

        if (tablero[fila][col] != '\0') {
            return false;
        }

        tablero[fila][col] = jugador;
        return true;
    }

    public boolean hayGanador(char jugador) {


        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] == jugador &&
                    tablero[i][1] == jugador &&
                    tablero[i][2] == jugador) {
                return true;
            }
        }


        for (int j = 0; j < 3; j++) {
            if (tablero[0][j] == jugador &&
                    tablero[1][j] == jugador &&
                    tablero[2][j] == jugador) {
                return true;
            }
        }

        if (tablero[0][0] == jugador &&
                tablero[1][1] == jugador &&
                tablero[2][2] == jugador) {
            return true;
        }

        if (tablero[0][2] == jugador &&
                tablero[1][1] == jugador &&
                tablero[2][0] == jugador) {
            return true;
        }

        return false;
    }
}
