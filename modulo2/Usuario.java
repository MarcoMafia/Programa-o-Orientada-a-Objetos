public class Usuario extends Pessoa {

    private int idade;
    private Emprestimo[] historicoEmprestimos;

    public Usuario(String nome, int idade) {
        super(nome);
        this.idade = idade;
        this.historicoEmprestimos = new Emprestimo[0];
    }

    public int getIdade() {
        return idade;
    }

    public Emprestimo[] getHistoricoEmprestimos() {
        return historicoEmprestimos;
    }

    public void adicionarEmprestimo(Emprestimo emp) {
        Emprestimo[] novo = new Emprestimo[historicoEmprestimos.length + 1];
        for (int i = 0; i < historicoEmprestimos.length; i++) {
            novo[i] = historicoEmprestimos[i];
        }
        novo[novo.length - 1] = emp;
        historicoEmprestimos = novo;
    }
}
