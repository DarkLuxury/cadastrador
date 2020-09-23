package br.com.contmatic.util;

import java.util.List;

public final class Validator {

    private Validator(){};

    public static void naoNulo(Object obj, String nomeDoCampo){
        if (obj == null){
            throw new IllegalArgumentException("O campo " + nomeDoCampo + " não pode ser nulo.");
        }
    }

    public static void tamanhoStringMinMax(String campo, String nomeDoCampo, int min, int max){
        if (campo.length() < min || campo.length() > max){
            throw new IllegalArgumentException("O campo " + nomeDoCampo + " deve ter entre " + min + " e " + max + " caracteres.");
        }
    }

    public static void tamanhoStringIgual(String campo, String nomeDoCampo, int igual){
        if (campo.length() != igual){
            throw new IllegalArgumentException("O campo " + nomeDoCampo + " deve ter " + igual + " caracteres.");
        }
    }

    public static void tamanhoListaMaxMin(List campo, String nomeDoCampo, int min, int max){
        if (campo.size() < min || campo.size() > max){
            throw new IllegalArgumentException("O campo " + nomeDoCampo + " deve ter entre " + min + " e " + max + " caracteres.");
        }
    }

    public static void tamanhoListaMin(List campo, String nomeDoCampo, int min){
        if (campo.size() < min){
            throw new IllegalArgumentException("O campo " + nomeDoCampo + " deve ser maior que " + min + ".");
        }
    }

    public static void stringContemSomenteNumeros(String campo, String nomeDoCampo){
        for(int i = 0; i < campo.length(); i++){
            if (campo.charAt(i) < 48 || campo.charAt(i) > 57) {
                throw new IllegalArgumentException("O campo " + nomeDoCampo + " deve ter somente digitos numéricos.");
            }
        }
    }

    public static void stringContemSomenteLetras(String campo, String nomeDoCampo){
        for(int i = 0; i < campo.length(); i++){
            if (campo.charAt(i) < 65 || campo.charAt(i) > 90 && campo.charAt(i) < 97 ||
                    campo.charAt(i) > 122 && /* Acentos "A" */ campo.charAt(i) < 192 && campo.charAt(i) > 195 ||
                    campo.charAt(i) > 122 && /* Acentos "a" */ campo.charAt(i) < 224 && campo.charAt(i) > 227 ||
                    campo.charAt(i) > 122 && /* Acentos "E" */ campo.charAt(i) < 200 && campo.charAt(i) > 202 ||
                    campo.charAt(i) > 122 && /* Acentos "e" */ campo.charAt(i) < 232 && campo.charAt(i) > 234 ||
                    campo.charAt(i) > 122 && /* Acentos "I" */ campo.charAt(i) < 204 && campo.charAt(i) > 206 ||
                    campo.charAt(i) > 122 && /* Acentos "i" */ campo.charAt(i) < 236 && campo.charAt(i) > 238 ||
                    campo.charAt(i) > 122 && /* Acentos "O" */ campo.charAt(i) < 210 && campo.charAt(i) > 213 ||
                    campo.charAt(i) > 122 && /* Acentos "o" */ campo.charAt(i) < 242 && campo.charAt(i) > 245 ||
                    campo.charAt(i) > 122 && /* Acentos "U" */ campo.charAt(i) < 217 && campo.charAt(i) > 219 ||
                    campo.charAt(i) > 122 && /* Acentos "u" */ campo.charAt(i) < 249 && campo.charAt(i) > 251) {
                throw new IllegalArgumentException("O campo " + nomeDoCampo + " deve ter somente letras.");
            }
        }
    }

    public static void stringContemSomenteLetrasEspacos(String campo, String nomeDoCampo){
        for(int i = 0; i < campo.length(); i++){
            if (campo.charAt(i) < 65 && campo.charAt(i) != 32 || campo.charAt(i) > 90 && campo.charAt(i) < 97 ||
                    campo.charAt(i) > 122 && /* Acentos "A" */ campo.charAt(i) < 192 && campo.charAt(i) > 195 ||
                    campo.charAt(i) > 122 && /* Acentos "a" */ campo.charAt(i) < 224 && campo.charAt(i) > 227 ||
                    campo.charAt(i) > 122 && /* Acentos "E" */ campo.charAt(i) < 200 && campo.charAt(i) > 202 ||
                    campo.charAt(i) > 122 && /* Acentos "e" */ campo.charAt(i) < 232 && campo.charAt(i) > 234 ||
                    campo.charAt(i) > 122 && /* Acentos "I" */ campo.charAt(i) < 204 && campo.charAt(i) > 206 ||
                    campo.charAt(i) > 122 && /* Acentos "i" */ campo.charAt(i) < 236 && campo.charAt(i) > 238 ||
                    campo.charAt(i) > 122 && /* Acentos "O" */ campo.charAt(i) < 210 && campo.charAt(i) > 213 ||
                    campo.charAt(i) > 122 && /* Acentos "o" */ campo.charAt(i) < 242 && campo.charAt(i) > 245 ||
                    campo.charAt(i) > 122 && /* Acentos "U" */ campo.charAt(i) < 217 && campo.charAt(i) > 219 ||
                    campo.charAt(i) > 122 && /* Acentos "u" */ campo.charAt(i) < 249 && campo.charAt(i) > 251) {
                throw new IllegalArgumentException("O campo " + nomeDoCampo + " deve ter somente letras e espaços.");
            }
        }
    }

    public static void integerTamanhoMaxMin(Integer n, int min, int max){
        if (n < min || n > max) {
            throw new IllegalStateException("O número deve estar entre " + min + " e " + max);
        }
    }

    public static void integerTamanhoMin(Integer n, int min){
        if (n < min) {
            throw new IllegalStateException("O número deve ser menor que " + min);
        }
    }
}
