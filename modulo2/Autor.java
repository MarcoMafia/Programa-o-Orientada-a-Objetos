public class Autor extends Pessoa {

    private String nacionalidade;

    public Autor(String nome, String nacionalidade) {
        super(nome);
        this.nacionalidade = nacionalidade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public Livro[] getObrasPublicadas() {
        return livros;
    }

    public Livro[] getObrasPublicadasPorGenero(String genero) {
        int count = 0;
        for (Livro l : livros) {
            if (l.getGenero().equalsIgnoreCase(genero)) {
                count++;
            }
        }

        Livro[] result = new Livro[count];
        int j = 0;
        for (Livro l : livros) {
            if (l.getGenero().equalsIgnoreCase(genero)) {
                result[j] = l;
                j++;
            }
        }
        return result;
    }

    public void adicionarLivro(Livro livro) {
        Livro[] novo = new Livro[livros.length + 1];
        for (int i = 0; i < livros.length; i++) {
            novo[i] = livros[i];
        }
        novo[novo.length - 1] = livro;
        livros = novo;
    }
}
