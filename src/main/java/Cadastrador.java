import java.util.Scanner;

public class Cadastrador {
    private String nome, cpf;
    private int idade;
    StringBuilder pessoas = new StringBuilder();

    public StringBuilder getPessoas() {
        return pessoas;
    }

    public void cadastrar() {
        Scanner digite = new Scanner(System.in);

        System.out.print("Digite o nome da pessoa: ");
        nome = digite.next();
        Pessoa pessoa = new Pessoa(nome);

        System.out.print("Digite o cpf: ");
        cpf = digite.next();
        pessoa.setNumeroDoCpf(cpf);
        while (pessoa.getNumeroDoCpf() == null){
            System.out.print("Cpf inválido \n");
            System.out.print("Digite o cpf: ");
            cpf = digite.next();
            pessoa.setNumeroDoCpf(cpf);
        }

        System.out.print("Digite a idade: ");
        idade = digite.nextInt();
        pessoa.setIdade(idade);

        System.out.println("====================================== \n" + "Cadastrado com sucesso \n" + "====================================== \n");

        pessoas.append(pessoa);

        }
    }

