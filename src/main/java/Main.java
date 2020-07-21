import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Cadastrador cadastrador = new Cadastrador();
        Scanner digite = new Scanner(System.in);

        String continuar = "s";

        while (continuar.equals("s")){
            cadastrador.cadastrar();
            System.out.println("Deseja cadastrar outra pessoa? (s/n)");
            continuar = digite.next();
        }

        System.out.println(cadastrador.getPessoas());

    }
}
