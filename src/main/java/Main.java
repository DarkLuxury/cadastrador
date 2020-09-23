import br.com.contmatic.empresa.Empresa;
import br.com.contmatic.empresa.Pessoa;

import java.util.ArrayList;
import java.util.List;

import static br.com.contmatic.util.CnpjValidator.*;
import static br.com.contmatic.util.CpfValidator.*;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("18688133000168");
        Pessoa pessoa = new Pessoa("51187115843");
        validarCnpj(empresa.getCnpj());
        validarCpf(pessoa.getCpf());

        List lista = new ArrayList();
        lista.add("teste");

        System.out.println(lista.size());
    }
}
