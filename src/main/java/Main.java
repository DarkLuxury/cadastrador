import br.com.contmatic.empresa.Empresa;

public class Main {
    public static void main(String[] args){
        Empresa contmatic = new Empresa("58.119.371/0004-10");
        contmatic.setRazaoSocial("SOFTMATIC SISTEMAS AUTOMATICOS DE INFORMATICA LTDA");
        contmatic.setEndereco("Rua Padre Estevão Pernet", 215, "São Paulo - SP", "03315-000", "Brasil");
        contmatic.setTamanho("Medio/Grande");
        contmatic.setFuncionario("Luiz Henrique", "51187115843", 17);
        contmatic.setFuncionario("Luiz Henrique", "51187115842", 22);
        contmatic.setFuncionario("Luiz Henrique", "51187315843", 18);

        System.out.println(contmatic);

    }
}
