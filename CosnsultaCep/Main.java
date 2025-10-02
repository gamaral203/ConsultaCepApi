package CosnsultaCep;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
    //Scanner sc = new Scanner(System.in);
    //String cep = sc.nextLine();

        ConsultaCep consultaCep = new ConsultaCep();
        Endereco novoEndereco = consultaCep.buscaEndereco("44720000");
        System.out.println(novoEndereco);
    }
}
