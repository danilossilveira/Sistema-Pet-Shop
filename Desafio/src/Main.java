import java.util.Scanner;

import Model.Donos;
import Model.Pets;

import Service.Associar;
import Service.Cabecario;
import Service.CadastroDono;
import Service.CadastroPet;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CadastroPet pet = new CadastroPet();
        CadastroDono dono = new CadastroDono();
        Associar associar = new Associar();
        Donos donoObj = dono.cadastrodono();
        Pets petObj = pet.cadastroPet();
        Cabecario cabecario = new Cabecario();

        scan.nextLine();

        int escolha = 0;

        do {

            cabecario.cabecario();

            escolha = scan.nextInt();

            switch (escolha) {

                case 1: {
                    pet.cadastroPet();
                    break;
                }
                case 2: {
                    dono.cadastrodono();
                    break;
                }
                case 3: {
                    associar.associar(donoObj, petObj);
                    break;
                }
                case 4: {
                    System.out.println("Até mais");

                    break;
                }

                default:
                    System.out.println("Opção inválida");
                    break;
            }

        } while (escolha != 4);

    }
}