package Validacion_contraseña;

public class ValidarContrasena {

    public boolean validar(String password){

        if(password == null || password.isEmpty()){
            return false;
        }

        if(password.length() < 8){
            return false;
        }

        boolean tieneMayuscula = false;
        boolean tieneNumero = false;

        for(char c : password.toCharArray()){

            if(Character.isUpperCase(c)){
                tieneMayuscula = true;
            }

            if(Character.isDigit(c)){
                tieneNumero = true;
            }
        }

        return tieneMayuscula && tieneNumero;
    }
}
