package Model;

public class Pets extends DadosGerais {
    private String especie;
    private int idade;
    private String raca;
    private String porte;

    public Pets(String especie, String nome, int idade, String raca, String porte) {
        super(nome);
        this.especie = especie;
        this.idade = idade;
        this.raca = raca;
        this.porte = porte;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
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

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

}
