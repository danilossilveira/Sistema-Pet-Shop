package Service;

import java.util.Scanner;

public class Servicos {
    Scanner scan = new Scanner(System.in);
    public void servicos() {
        System.out.println("""
                Qual serviço vai fazer hoje?
                1- Banho
                2- Tosa
                3- Vacina
                4- Consulta Veterinária
                """);
                int escolha = scan.nextInt();
                switch (escolha) {
                    case 1:
                        System.out.println("Você escolheu Banho para seu pet.");
                        break;
                    case 2:
                        System.out.println("Você escolheu Tosa para seu pet.");
                        break;
                    case 3:
                        System.out.println("Você escolheu Vacina para seu pet.");
                        break;
                    case 4:
                        System.out.println("Você escolheu Consulta Veterinária para seu pet.");
                        break;
                    default:
                        System.out.println("Opção inválida.");
                        break;
                }

    }

}
