import java.util.Objects;

public class Pessoa {
    private String nome;
    private String numeroDoCpf;
    private int idade;

    Pessoa(String nome){
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNumeroDoCpf() {
        return this.numeroDoCpf;
    }

    public void setNumeroDoCpf(String numeroDoCpf) {
        CPF cpf = new CPF(numeroDoCpf);
        this.numeroDoCpf = cpf.getCpf();
    }

    @Override
    public String toString() {
        return  "Nome: " + nome + "\n" +
                "Cpf: " + numeroDoCpf + "\n" +
                "Idade: " + idade + "\n" +
                "====================================== \n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return idade == pessoa.idade &&
                nome.equals(pessoa.nome) &&
                Objects.equals(numeroDoCpf, pessoa.numeroDoCpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroDoCpf.charAt(0));
    }

}
