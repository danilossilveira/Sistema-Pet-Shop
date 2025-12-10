import java.util.Scanner;

import Service.Associar;
import Service.CadastroDono;
import Service.CadastroPet;

public class Main {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
        CadastroPet pet = new CadastroPet();
        CadastroDono dono = new CadastroDono();
        Associar associar = new Associar();
        while (true) {
                pet.cadastroPet();
                dono.cadastrodono();
                associar.associar();
        }
    }
}