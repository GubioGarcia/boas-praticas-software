import servicos.FuncoesMedia;
import servicos.IOUtils;

public static void main(String[] args) {
    String nomeAluno = "Carlos";
    double notaN1 = 8;
    double notaN2 = 7;

    double mediaAluno = FuncoesMedia.calcularMediaAluno(notaN1, notaN2);
    String statusAprovacao = FuncoesMedia.calcularAprovacao(mediaAluno);

    IOUtils.exibirAlunoEAprovacao(nomeAluno, mediaAluno, statusAprovacao);
}