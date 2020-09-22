package br.com.contmatic;

public class Validator {
    public static void validarCnpj(String cnpj){
        tamanhoString(cnpj, "cnpj",14, 14);
        stringContemSomenteNumeros(cnpj, "cnpj");
        validarCnpjDigitosRepetidos(cnpj);
        validarCnpjComDigitosVerificadores(cnpj);
    }

    public static void validarCpf(String cpf){
        tamanhoString(cpf, "cpf",11, 11);
        stringContemSomenteNumeros(cpf, "cpf");
        validarCpfDigitosRepetidos(cpf);
        validarCpfComDigitosVerificadores(cpf);
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
        int primeiroDigitoVerificador =
                ((int)cpf.charAt(0) - 48) * 10 +
                        ((int)cpf.charAt(1) - 48) * 9 +
                        ((int)cpf.charAt(2) - 48) * 8 +
                        ((int)cpf.charAt(3) - 48) * 7 +
                        ((int)cpf.charAt(4) - 48) * 6 +
                        ((int)cpf.charAt(5) - 48) * 5 +
                        ((int)cpf.charAt(6) - 48) * 4 +
                        ((int)cpf.charAt(7) - 48) * 3 +
                        ((int)cpf.charAt(8) - 48) * 2;
        if (11 - primeiroDigitoVerificador % 11 > 9){
            primeiroDigitoVerificador = 0;
        } else {
            primeiroDigitoVerificador = 11 - primeiroDigitoVerificador % 11;
        }
        int segundoDigitoVerificador =
                ((int)cpf.charAt(0) - 48) * 11 +
                        ((int)cpf.charAt(1) - 48) * 10 +
                        ((int)cpf.charAt(2) - 48) * 9 +
                        ((int)cpf.charAt(3) - 48) * 8 +
                        ((int)cpf.charAt(4) - 48) * 7 +
                        ((int)cpf.charAt(5) - 48) * 6 +
                        ((int)cpf.charAt(6) - 48) * 5 +
                        ((int)cpf.charAt(7) - 48) * 4 +
                        ((int)cpf.charAt(8) - 48) * 3 +
                        ((int)cpf.charAt(9) - 48) * 2;
        if (11 - segundoDigitoVerificador % 11 > 9){
            segundoDigitoVerificador = 0;
        } else {
            segundoDigitoVerificador = 11 - segundoDigitoVerificador % 11;
        }
        if (primeiroDigitoVerificador != (int)cpf.charAt(9) - 48 && segundoDigitoVerificador != (int)cpf.charAt(10) - 48){
            throw new IllegalStateException("O cpf informado é inválido. Verifique se o mesmo está correto.");
        }
    }

    public static void naoNulo(Object obj, String nomeDoCampo){
        if (obj == null){
            throw new IllegalArgumentException("O campo " + nomeDoCampo + " não pode ser nulo.");
        }
    }

    public static void tamanhoString(String campo, String nomeDoCampo, int min, int max){
        if (campo.length() < min || campo.length() > max){
            throw new IllegalArgumentException("O campo " + nomeDoCampo + " deve ter entre " + min + " e " + max + " caracteres.");
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

}
