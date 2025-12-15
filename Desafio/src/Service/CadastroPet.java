package Service;

import java.util.ArrayList;
import java.util.Scanner;

import Model.DadosGerais;
import Model.Pets;

public class CadastroPet {

    Scanner scan = new Scanner(System.in);
    ArrayList<DadosGerais> listPet = new ArrayList<>();

    public Pets cadastroPet() {

        System.out.println("""
                Qual é seu pet?
                1- Gato
                2- Cachorro
                """);
        int escolhaEspecie = scan.nextInt();
        String especie;
        if (escolhaEspecie == 1) {
            especie = "Gato";
        } else {
            especie = "Cachorro";
        }
        scan.nextLine();
        System.out.println("Qual o nome do seu " + especie + "?");
        String nome = scan.nextLine();
        System.out.println("O " + nome + " é de qual raça?");
        String raca = scan.nextLine();
        System.out.println("Quantos anos o " + nome + " tem?");
        int idade = scan.nextInt();
        System.out.println("""
                Qual é o porte do seu pet?
                1-Pequeno
                2-Médio
                3-Grande
                """);
        int escolhaRaca = scan.nextInt();
        String porte;
        if (escolhaRaca == 1) {
            porte = "Pequeno";
        } else if (escolhaRaca == 2) {
            porte = "Médio";
        } else {
            porte = "Grande";
        }

        System.out.println("Cadastro concluído!");

        Pets p = new Pets(especie, nome, idade, raca, porte);
        listPet.add(p);
        return p;
    }





}
