package Validacion_contraseña;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    ValidarContrasena validator = new ValidarContrasena();

    @Test
    void passwordValida(){

        assertTrue(validator.validar("Hola1234"));
    }

    @Test
    void passwordCorta(){

        assertFalse(validator.validar("Ho12"));
    }

    @Test
    void passwordSinMayusculas(){

        assertFalse(validator.validar("hola1234"));
    }

    @Test
    void passwordSinNumeros(){

        assertFalse(validator.validar("HolaMundo"));
    }

    @Test
    void passwordVacia(){

        assertFalse(validator.validar(""));
    }

    @Test
    void passwordConEspacios(){

        assertTrue(validator.validar("Hola 1234"));
    }
}