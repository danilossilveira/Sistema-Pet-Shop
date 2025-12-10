package Model;

public class Pets extends DadosGerais{
    private String especie;
    private int idade;
    private String raca;
    private String porte;
    public Pets(String especie, String nome,  int idade, String raca, String porte) {
        super(nome);
        this.especie = especie;
        this.idade = idade;
        this.raca = raca;
        this.porte = porte;
    }
    @Override
    public String toString() {
        return 
        
        "  \n Espécie: " + especie +
        "  \n Nome: " + getNome() +
        "  \n Idade:" + idade +
        "  \n Raça:" + raca +
        "  \n Porte: " + porte +
        "\n" +
        "\n";
    }

    
    
}
