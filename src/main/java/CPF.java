import java.util.Objects;

public class CPF {
    private String cpf;
    private static int resultado;

    CPF(String cpf){
        setCpf(cpf);
    }

    public String getCpf() {
        return cpf;
    }

    public boolean setCpf(String cpf) {
        this.cpf = cpf;
        if (this.validaCPF() == false){
            this.cpf = null;
            return false;
        }
        return true;
    }

    public boolean validaCPF(){
        resultado = 0;

        if (this.cpf.charAt(0) == this.cpf.charAt(1) && this.cpf.charAt(0) == this.cpf.charAt(2) && this.cpf.charAt(0) == this.cpf.charAt(1) && this.cpf.charAt(0) == this.cpf.charAt(2) && this.cpf.charAt(0) == this.cpf.charAt(3) && this.cpf.charAt(0) == this.cpf.charAt(4) && this.cpf.charAt(0) == this.cpf.charAt(5) && this.cpf.charAt(0) == this.cpf.charAt(6) && this.cpf.charAt(0) == this.cpf.charAt(7) && this.cpf.charAt(0) == this.cpf.charAt(8) && this.cpf.charAt(0) == this.cpf.charAt(9) && this.cpf.charAt(0) == this.cpf.charAt(10)){
            return false;
        }

        for (int i = 0; i < 9; i++){
            String strDigito = "" + this.cpf.charAt(i);
            int digito = Integer.parseInt(strDigito);
            resultado += digito * (10-i);
        }

        resultado = resultado * 10;
        resultado = resultado % 11;

        String strDigitoVerificador1 = "" + this.cpf.charAt(9);
        int digitoVerificador1 = Integer.parseInt(strDigitoVerificador1);

        if (resultado == 10){
            resultado = 0;
        }

        if (resultado != digitoVerificador1){
            return false;
        }
        resultado = 0;
        for (int i = 0; i < 10; i++){
            String strDigito = "" + this.cpf.charAt(i);
            int digito = Integer.parseInt(strDigito);
            resultado += digito * (11-i);
        }

        resultado = resultado * 10;
        resultado = resultado % 11;

        String strDigitoVerificador2 = "" + this.cpf.charAt(10);
        int digitoVerificador2 = Integer.parseInt(strDigitoVerificador2);

        if (resultado == digitoVerificador2){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CPF cpf1 = (CPF) o;
        return cpf.equals(cpf1.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }

    @Override
    public String toString() {
        return "CPF{" +
                "cpf='" + cpf + '\'' +
                '}';
    }
}
