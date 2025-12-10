package Service;

import java.util.ArrayList;
import java.util.Scanner;

import Model.Donos;

public class CadastroDono {
    Scanner scan = new Scanner(System.in);
    ArrayList<Donos> listDono = new ArrayList<>();

    public void cadastrodono() {
        System.out.println("Nome do dono:");
        String nome = scan.nextLine();
        System.out.println("Número de telefone para contato:");
        String numerodigitar = scan.nextLine();
        String ddd= numerodigitar.substring(0,2);
        String numer1 = numerodigitar.substring(2,7);
        String numer2 =numerodigitar.substring(7,11);
        String numero = "(" + ddd + ")" +numer1 + "-" + numer2;
        System.out.println("Cadastro realizado!");
        System.out.println(numero);
        listDono.add(new Donos(nome, numero));
    }
}