package opet.acs.com.avaliacaofilmes;

/**
 * Created by Diego on 19/09/2018.
 */

public class Filme {
    private String nome;
    private String genero;
    private String nota;

    public Filme(){}

    public Filme(String nome, String genero, String nota) {
        this.nome = nome;
        this.genero = genero;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }
}
