package sistemadereservas;

public class Usuario {
    private final int id;
    private final String nome;
    private final String tipo;

    public Usuario(int id, String nome, String tipo) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }
}