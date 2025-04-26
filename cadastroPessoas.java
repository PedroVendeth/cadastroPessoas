public class cadastroPessoas {
    private static int contadorId = 1;
    private int id;
    private String nome;
    private int idade;
    private String telefone;

    //construtor
    public cadastroPessoas( String nome, int idade,  String telefone) {
        this.id = contadorId++;
        this.nome = nome;
        this.idade = idade;
        this.telefone  = telefone;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String nome) {
        this.nome = nome;
    }

    public void  setIdade(int idade) {
        this.idade = idade;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }  

    public String getName() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getTelefone() {
        return telefone;
    }
    
    @Override
    public String toString() {
        return "ID: " + id + ", \nNome: " + nome + ", \nIdade: " + idade + ", \nTelefone: " + telefone;
    }
}