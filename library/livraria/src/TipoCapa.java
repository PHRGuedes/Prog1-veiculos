import java.util.ArrayList;
import java.util.List;

public class TipoCapa {

private int id;
private String descricao;

public TipoCapa() {
}

public TipoCapa(int id, String descricao) {
    this.id = id;
    this.descricao = descricao;
}

public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}

public String getDescricao() {
    return descricao;
}

public void setDescricao(String descricao) {
    this.descricao = descricao;
}

    // Lista estática para armazenar todos os objetos TipoCapa
    private static List<TipoCapa> listaTipoCapa = new ArrayList<>();

    public void salvar() {
        listaTipoCapa.add(this);
    }

    // Método para alterar a descrição de um TipoCapa pelo id
    public static boolean alterar(int id, String novaDescricao) {
        for (TipoCapa tipo : listaTipoCapa) {
            if (tipo.getId() == id) {
                tipo.setDescricao(novaDescricao);
                return true;
            }
        }
        return false;
    }

    // Método para excluir um TipoCapa pelo id
    public static boolean excluir(int id) {
        for (TipoCapa tipo : listaTipoCapa) {
            if (tipo.getId() == id) {
                listaTipoCapa.remove(tipo);
                return true;
            }
        }
        return false;
    }

    // Método para pesquisar um TipoCapa pelo id
    public static TipoCapa pesquisar(int id) {
        for (TipoCapa tipo : listaTipoCapa) {
            if (tipo.getId() == id) {
                return tipo;
            }
        }
        return null;
    }
}





