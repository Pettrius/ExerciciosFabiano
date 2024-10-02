package revEx_4;

public class Situacao {

    public String verificaSituacao(Aluno aluno, Media media)
    {
        double mediaNotas = media.calcularMedia(aluno);
        if (mediaNotas > 6.0)
        {
            return "Aprovado";
        }

        else
        {
            return "Reprovado";
        }
    }
}
