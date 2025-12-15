package Service;

import java.util.Scanner;

import Model.Donos;
import Model.Pets;

public class Menu {
    Cabecario cabecario = new Cabecario();
    
        CadastroPet pet = new CadastroPet();
    CadastroDono dono = new CadastroDono();
    Associar associar = new Associar();
    Donos donoObj = dono.cadastrodono();
    Pets petObj = pet.cadastroPet();

    Scanner scan = new Scanner(System.in);



    public void menuu() {

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
