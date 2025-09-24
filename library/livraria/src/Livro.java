public class Livro {

private int id;
private String nome;
private String resenha;
private int edicao;
private int ano_publicacao;
private int n_paginas;
private Autor autor;
private Editora editora;
private TipoCapa tipoCapa;


public Livro() {
}


public Livro(int id, String nome, String resenha, int edicao,
int ano_publicacao, int n_paginas, Autor autor, Editora editora,
TipoCapa tipoCapa) {
    this.id = id;
    this.nome = nome;
    this.resenha = resenha;
    this.edicao = edicao;
    this.ano_publicacao = ano_publicacao;
    this.n_paginas = n_paginas;
    this.autor = autor;
    this.editora = editora;
    this.tipoCapa = tipoCapa;
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
public String getResenha() {
    return resenha;
}
public void setResenha(String resenha) {
    this.resenha = resenha;
}
public int getEdicao() {
    return edicao;
}
public void setEdicao(int edicao) {
    this.edicao = edicao;
}
public int getAno_publicacao() {
    return ano_publicacao;
}
public void setAno_publicacao(int ano_publicacao) {
    this.ano_publicacao = ano_publicacao;
}
public int getN_paginas() {
    return n_paginas;
}
public void setN_paginas(int n_paginas) {
    this.n_paginas = n_paginas;
}
public Autor getAutor() {
    return autor;
}
public void setAutor(Autor autor) {
    this.autor = autor;
}
public Editora getEditora() {
    return editora;
}
public void setEditora(Editora editora) {
    this.editora = editora;
}
public TipoCapa getTipoCapa() {
    return tipoCapa;
}
public void setTipoCapa(TipoCapa tipoCapa) {
    this.tipoCapa = tipoCapa;
}
    // Lista estática para armazenar todos os objetos Livro
    private static java.util.List<Livro> listaLivro = new java.util.ArrayList<>();

    // Método para salvar (adicionar) um livro na lista
    public void salvar() {
        listaLivro.add(this);
    }

    // Método para alterar os dados de um livro pelo id
    public static boolean alterar(int id, String nome, String resenha, int edicao, int ano_publicacao, int n_paginas, Autor autor, Editora editora, TipoCapa tipoCapa) {
        for (Livro livro : listaLivro) {
            if (livro.getId() == id) {
                livro.setNome(nome);
                livro.setResenha(resenha);
                livro.setEdicao(edicao);
                livro.setAno_publicacao(ano_publicacao);
                livro.setN_paginas(n_paginas);
                livro.setAutor(autor);
                livro.setEditora(editora);
                livro.setTipoCapa(tipoCapa);
                return true;
            }
        }
        return false;
    }

    // Método para excluir um livro pelo id
    public static boolean excluir(int id) {
        for (Livro livro : listaLivro) {
            if (livro.getId() == id) {
                listaLivro.remove(livro);
                return true;
            }
        }
        return false;
    }

    // Método para pesquisar um livro pelo id
    public static Livro pesquisar(int id) {
        for (Livro livro : listaLivro) {
            if (livro.getId() == id) {
                return livro;
            }
        }
        return null;
    }


}
