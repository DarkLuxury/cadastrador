import br.com.contmatic.empresa.Empresa;
import br.com.contmatic.empresa.Pessoa;

import static br.com.contmatic.Validator.*;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("18688133000168");
        Pessoa pessoa = new Pessoa("51187115843");
        validarCnpj(empresa.getCnpj());
        validarCpf(pessoa.getCpf());
    }
}
