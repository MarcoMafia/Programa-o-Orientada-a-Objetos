import java.util.Date;

public class Emprestimo {

    private Date dataRetirada;
    private Date dataDevolucao;
    private Livro livro;
    private Usuario usuario;

    public Emprestimo(Livro livro, Usuario usuario, Date dataRetirada, Date dataDevolucao) {
        this.dataRetirada = dataRetirada;
        this.dataDevolucao = dataDevolucao;
        this.livro = livro;
        this.usuario = usuario;
        livro.setDisponivel(false);
        usuario.adicionarEmprestimo(this);
    }

    public Date getDataRetirada() {
        return dataRetirada;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public Livro getLivro() {
        return livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }
}
