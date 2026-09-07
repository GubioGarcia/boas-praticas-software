package servicos;

public class IOUtils {
    public static void exibirAlunoEAprovacao(String nomeAluno, double mediaAluno, String statusAprovacao) {
        StringBuilder saida = new StringBuilder();
        saida.append("Aluno: ").append(nomeAluno).append("\n");
        saida.append("Média: ").append(mediaAluno).append("\n");
        saida.append("Status: ").append(statusAprovacao);

        System.out.println(saida);
    }
}
