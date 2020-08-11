package br.com.contmatic.empresa;
import org.junit.runner.*;
import org.junit.runner.notification.Failure;

public class TestRunner {
    public static void main(String[] args) {
        Result resultado = JUnitCore.runClasses(EmpresaTest.class, EnderecoTest.class, PessoaTest.class);

        for(Failure failure : resultado.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(resultado.wasSuccessful());
    }
}
