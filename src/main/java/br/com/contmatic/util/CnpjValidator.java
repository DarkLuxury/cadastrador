package br.com.contmatic.util;
import static br.com.contmatic.util.Validator.*;

public final class CnpjValidator {

    private CnpjValidator(){}

    public static void validarCnpj(String cnpj){
        tamanhoStringIgual(cnpj, "cnpj",14);
        stringContemSomenteNumeros(cnpj, "cnpj");
        validarCnpjDigitosRepetidos(cnpj);
        validarCnpjComDigitosVerificadores(cnpj);
    }

    private static void validarCnpjDigitosRepetidos(String cnpj) {
        if (cnpj.equals("00000000000000") || cnpj.equals("11111111111111") ||
                cnpj.equals("22222222222222") || cnpj.equals("33333333333333") ||
                cnpj.equals("44444444444444") || cnpj.equals("55555555555555") ||
                cnpj.equals("66666666666666") || cnpj.equals("77777777777777") ||
                cnpj.equals("88888888888888") || cnpj.equals("99999999999999") )
        {
            throw new IllegalStateException("O cnpj informado é inválido. Verifique se o mesmo está correto.");
        }
    }

    private static void validarCnpjComDigitosVerificadores(String cnpj){
        int primeiroDigitoVerificador =
                ((int)cnpj.charAt(0) - 48) * 5 +
                        ((int)cnpj.charAt(1) - 48) * 4 +
                        ((int)cnpj.charAt(2) - 48) * 3 +
                        ((int)cnpj.charAt(3) - 48) * 2 +
                        ((int)cnpj.charAt(4) - 48) * 9 +
                        ((int)cnpj.charAt(5) - 48) * 8 +
                        ((int)cnpj.charAt(6) - 48) * 7 +
                        ((int)cnpj.charAt(7) - 48) * 6 +
                        ((int)cnpj.charAt(8) - 48) * 5 +
                        ((int)cnpj.charAt(9) - 48) * 4 +
                        ((int)cnpj.charAt(10) - 48) * 3 +
                        ((int)cnpj.charAt(11) - 48) * 2;
        if (primeiroDigitoVerificador % 11 <2){
            primeiroDigitoVerificador = 0;
        } else {
            primeiroDigitoVerificador = 11 - primeiroDigitoVerificador % 11;
        }
        int segundoDigitoVerificador =
                ((int)cnpj.charAt(0) - 48) * 6 +
                        ((int)cnpj.charAt(1) - 48) * 5 +
                        ((int)cnpj.charAt(2) - 48) * 4 +
                        ((int)cnpj.charAt(3) - 48) * 3 +
                        ((int)cnpj.charAt(4) - 48) * 2 +
                        ((int)cnpj.charAt(5) - 48) * 9 +
                        ((int)cnpj.charAt(6) - 48) * 8 +
                        ((int)cnpj.charAt(7) - 48) * 7 +
                        ((int)cnpj.charAt(8) - 48) * 6 +
                        ((int)cnpj.charAt(9) - 48) * 5 +
                        ((int)cnpj.charAt(10) - 48) * 4 +
                        ((int)cnpj.charAt(11) - 48) * 3 +
                        ((int)cnpj.charAt(12) - 48) * 2;
        if (segundoDigitoVerificador % 11 <2){
            segundoDigitoVerificador = 0;
        } else {
            segundoDigitoVerificador = 11 - segundoDigitoVerificador % 11;
        }
        if (primeiroDigitoVerificador != (int)cnpj.charAt(12) - 48 && segundoDigitoVerificador != (int)cnpj.charAt(13) - 48){
            throw new IllegalStateException("O cnpj informado é inválido. Verifique se o mesmo está correto.");
        }
    }
}
