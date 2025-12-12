package Service;

import java.util.Scanner;

import Model.Donos;
import Model.Pets;

public class Associar {
    Scanner scan = new Scanner(System.in);

    public void associar(Donos donos, Pets pets) {
        System.out.println("Se você já fez o cadastro, diga seu nome para fazer login:");
        String buscarDono = "";
        while (buscarDono != donos.getNome()) {
           buscarDono = scan.nextLine();
        
        if (buscarDono.equalsIgnoreCase(donos.getNome())) {
            System.out.println("Bem-vindo de volta, " + donos.getNome() + "!");
            System.out.println("digite o nome do seu pet para encontrá-lo:");
        } else {
            System.out.println("Proprietário não encontrado.");
            System.out.println("Digite o nome novamente:");
        }
        }
        String buscarpet = "";
        while (buscarpet != pets.getNome()) {
            buscarpet = scan.nextLine();
        
        if (buscarpet.equalsIgnoreCase(pets.getNome())) {
            System.out.println("Aqui está o perfil do seu pet:");
            System.out.println(pets);
        } else {
            System.out.println("Pet não encontrado.");
            System.out.println("digite o nome do seu pet para encontrá-lo:");
        }
    }

    }
}

