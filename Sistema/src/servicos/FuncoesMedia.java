package servicos;

public class FuncoesMedia {
    public static double calcularMediaAluno (double notaN1, double notaN2) {
        if (notaN1 < 0 || notaN2 < 0)
            System.out.println("Informe apenas notas positivas.");

        return (notaN1 + notaN2) / 2;
    }

    public static String calcularAprovacao (double mediaAluno)
    {
        if (mediaAluno >= 6) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
}
