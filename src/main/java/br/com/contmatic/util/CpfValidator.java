package br.com.contmatic.util;

import static br.com.contmatic.util.Validator.*;

public final class CpfValidator {

    private CpfValidator(){}

    public static void validarCpf(String cpf){
        tamanhoStringIgual(cpf, "cpf",11);
        stringContemSomenteNumeros(cpf, "cpf");
        validarCpfDigitosRepetidos(cpf);
        validarCpfComDigitosVerificadores(cpf);
    }

    private static void validarCpfDigitosRepetidos(String cpf) {
        if (cpf.equals("00000000000") || cpf.equals("11111111111") ||
                cpf.equals("22222222222") || cpf.equals("33333333333") ||
                cpf.equals("44444444444") || cpf.equals("55555555555") ||
                cpf.equals("66666666666") || cpf.equals("77777777777") ||
                cpf.equals("88888888888") || cpf.equals("99999999999") )
        {
            throw new IllegalStateException("O cpf informado é inválido. Verifique se o mesmo está correto.");
        }
    }

    private static void validarCpfComDigitosVerificadores(String cpf){
        int primeiroDigitoVerificador = getPrimeiroDigitoVerificador(cpf);
        primeiroDigitoVerificador = validarDigitoVerificador(primeiroDigitoVerificador);
        int segundoDigitoVerificador = getSegundoDigitoVerificador(cpf);
        segundoDigitoVerificador = validarDigitoVerificador(segundoDigitoVerificador);
        validarCpf(cpf, primeiroDigitoVerificador, segundoDigitoVerificador);
    }

    private static void validarCpf(String cpf, int primeiroDigitoVerificador, int segundoDigitoVerificador) {
        if (primeiroDigitoVerificador != (int) cpf.charAt(9) - 48 && segundoDigitoVerificador != (int) cpf.charAt(10) - 48){
            throw new IllegalStateException("O cpf informado é inválido. Verifique se o mesmo está correto.");
        }
    }

    private static int getSegundoDigitoVerificador(String cpf) {
        int segundoDigitoVerificador =
                ((int) cpf.charAt(0) - 48) * 11 +
                        ((int) cpf.charAt(1) - 48) * 10 +
                        ((int) cpf.charAt(2) - 48) * 9 +
                        ((int) cpf.charAt(3) - 48) * 8 +
                        ((int) cpf.charAt(4) - 48) * 7 +
                        ((int) cpf.charAt(5) - 48) * 6 +
                        ((int) cpf.charAt(6) - 48) * 5 +
                        ((int) cpf.charAt(7) - 48) * 4 +
                        ((int) cpf.charAt(8) - 48) * 3 +
                        ((int) cpf.charAt(9) - 48) * 2;
        return segundoDigitoVerificador;
    }

    private static int validarDigitoVerificador(int primeiroDigitoVerificador) {
        if (11 - primeiroDigitoVerificador % 11 > 9) {
            primeiroDigitoVerificador = 0;
        } else {
            primeiroDigitoVerificador = 11 - primeiroDigitoVerificador % 11;
        }
        return primeiroDigitoVerificador;
    }

    private static int getPrimeiroDigitoVerificador(String cpf) {
        int primeiroDigitoVerificador =
                ((int) cpf.charAt(0) - 48) * 10 +
                        ((int) cpf.charAt(1) - 48) * 9 +
                        ((int) cpf.charAt(2) - 48) * 8 +
                        ((int) cpf.charAt(3) - 48) * 7 +
                        ((int) cpf.charAt(4) - 48) * 6 +
                        ((int) cpf.charAt(5) - 48) * 5 +
                        ((int) cpf.charAt(6) - 48) * 4 +
                        ((int) cpf.charAt(7) - 48) * 3 +
                        ((int) cpf.charAt(8) - 48) * 2;
        return primeiroDigitoVerificador;
    }
}
