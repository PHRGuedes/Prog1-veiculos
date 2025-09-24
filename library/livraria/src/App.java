public class App {
    public static void main(String[] args) throws Exception {
       
    // Criando objetos
    Autor autor = new Autor(1, "João", "Goiânia");
    autor.salvar();

    Editora editora = new Editora(1, "Editora Exemplo");
    editora.salvar();

    TipoCapa tipoCapa = new TipoCapa(1, "Capa Dura");
    tipoCapa.salvar();

    Livro livro = new Livro(1, "Livro Exemplo", "Resenha", 1, 2025, 100, autor, editora, tipoCapa);
    livro.salvar();

    // Alterar autor
    Autor.alterar(1, "João Silva", "Anápolis");

    // Pesquisar editora
    Editora editoraPesquisada = Editora.pesquisar(1);
    if (editoraPesquisada != null) {
        System.out.println("Editora encontrada: " + editoraPesquisada.getNome_editora());
    }

    // Excluir tipo de capa
    TipoCapa.excluir(1);

    // Pesquisar livro
    Livro livroPesquisado = Livro.pesquisar(1);
    if (livroPesquisado != null) {
        System.out.println("Livro encontrado: " + livroPesquisado.getNome());
    }

    // Printar todos os dados do livro antes da edição
    System.out.println("Antes da edição:");
    System.out.println("ID: " + livro.getId());
    System.out.println("Nome: " + livro.getNome());
    System.out.println("Resenha: " + livro.getResenha());
    System.out.println("Edição: " + livro.getEdicao());
    System.out.println("Ano: " + livro.getAno_publicacao());
    System.out.println("Páginas: " + livro.getN_paginas());
    System.out.println("Autor: " + livro.getAutor().getNome());
    System.out.println("Editora: " + livro.getEditora().getNome_editora());
    System.out.println("Tipo de Capa: " + (livro.getTipoCapa() != null ? livro.getTipoCapa().getDescricao() : "Removido"));

    // Exemplo de edição do livro
    Livro.alterar(1, "Novo Nome", "Nova Resenha", 2, 2026, 200, autor, editora, null);

    // Printar todos os dados do livro depois da edição
    System.out.println("\nDepois da edição:");
    Livro livroEditado = Livro.pesquisar(1);
    if (livroEditado != null) {
        System.out.println("ID: " + livroEditado.getId());
        System.out.println("Nome: " + livroEditado.getNome());
        System.out.println("Resenha: " + livroEditado.getResenha());
        System.out.println("Edição: " + livroEditado.getEdicao());
        System.out.println("Ano: " + livroEditado.getAno_publicacao());
        System.out.println("Páginas: " + livroEditado.getN_paginas());
        System.out.println("Autor: " + livroEditado.getAutor().getNome());
        System.out.println("Editora: " + livroEditado.getEditora().getNome_editora());
        System.out.println("Tipo de Capa: " + (livroEditado.getTipoCapa() != null ? livroEditado.getTipoCapa().getDescricao() : "Removido"));
    }
    }
}
