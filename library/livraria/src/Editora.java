public class Editora {

private int id;
private String nome_editora;

public Editora() {
}

public Editora(int id, String nome_editora) {
    this.id = id;
    this.nome_editora = nome_editora;
}

public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}

public String getNome_editora() {
    return nome_editora;
}

public void setNome_editora(String nome_editora) {
    this.nome_editora = nome_editora;
}
    // Lista estática para armazenar todos os objetos Editora
    private static java.util.List<Editora> listaEditora = new java.util.ArrayList<>();

    // Método para salvar (adicionar) uma editora na lista
    public void salvar() {
        listaEditora.add(this);
    }

    // Método para alterar o nome da editora pelo id
    public static boolean alterar(int id, String novoNome) {
        for (Editora editora : listaEditora) {
            if (editora.getId() == id) {
                editora.setNome_editora(novoNome);
                return true;
            }
        }
        return false;
    }

    // Método para excluir uma editora pelo id
    public static boolean excluir(int id) {
        for (Editora editora : listaEditora) {
            if (editora.getId() == id) {
                listaEditora.remove(editora);
                return true;
            }
        }
        return false;
    }

    // Método para pesquisar uma editora pelo id
    public static Editora pesquisar(int id) {
        for (Editora editora : listaEditora) {
            if (editora.getId() == id) {
                return editora;
            }
        }
        return null;
    }
}

