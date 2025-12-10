package Model;

public class Donos extends DadosGerais{
    private String telefone;
    
    public Donos(String nome, String telefone) {
        super(nome);
        this.telefone = telefone;
    }

    




    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {

        return " \n Nome: " + getNome() +
               " \n Telefone: " + telefone;

    }

}
