package Model;

public class Pet {
    private String especie;
    private String nome;
    private String raca;
    private int idade;
    private String porte;

    

    public Pet(String especie, String nome, String raca, int idade, String porte) {
        this.especie = especie;
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.porte = porte;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    @Override
    public String toString() {
        return "Especie: " + especie +
               "Nome: " + nome +
               "Raça: " + raca +
               "Idade: " + idade +
               "Porte: " + porte;
    }
}
