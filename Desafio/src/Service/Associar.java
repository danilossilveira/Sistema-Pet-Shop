package Service;

import java.util.Scanner;

import Model.Donos;
import Model.Pets;

public class Associar {
    Scanner scan = new Scanner(System.in);

    public void associar(Donos donos, Pets pets) {
        System.out.println(donos.getNome() + " " + donos.getTelefone());
        System.out.println(pets.getEspecie() + " " + pets.getNome() + " " + pets.getIdade() + " " + pets.getPorte() + " " + pets.getRaca());
    }
}

// for (DadosGerais pets : listPet) {
// if (pets.getNome().equalsIgnoreCase(buscarpet)) {
// System.out.println(pets);
// return;
// }
// }