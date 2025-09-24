public class Autor {

private int id;
private String nome;   
private String cidade;

public Autor() {   
}

public Autor(int id, String nome, String cidade) {
    this.id = id;
    this.nome = nome;
    this.cidade = cidade;
}

public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public String getCidade() {
    return cidade;
}

public void setCidade(String cidade) {
    this.cidade = cidade;
}



    // Lista estática para armazenar todos os objetos Autor
    private static java.util.List<Autor> listaAutor = new java.util.ArrayList<>();

    // Método para salvar (adicionar) um autor na lista
    public void salvar() {
        listaAutor.add(this);
    }

    // Método para alterar nome e cidade do autor pelo id
    public static boolean alterar(int id, String novoNome, String novaCidade) {
        for (Autor autor : listaAutor) {
            if (autor.getId() == id) {
                autor.setNome(novoNome);
                autor.setCidade(novaCidade);
                return true;
            }
        }
        return false;
    }

    // Método para excluir um autor pelo id
    public static boolean excluir(int id) {
        for (Autor autor : listaAutor) {
            if (autor.getId() == id) {
                listaAutor.remove(autor);
                return true;
            }
        }
        return false;
    }

    // Método para pesquisar um autor pelo id
    public static Autor pesquisar(int id) {
        for (Autor autor : listaAutor) {
            if (autor.getId() == id) {
                return autor;
            }
        }
        return null;
    }
}
