public class Condicao_If_Else {
    public static void main(String[] args){
        int mediaAluno = 70;

        if(mediaAluno >= 70){
            System.out.println("O Aluno esta com media de: " + mediaAluno);
            System.out.println("O Aluno Esta Aprovado");
        }else if(mediaAluno >= 50 && mediaAluno <= 69){
            System.out.println("O Aluno esta com media de: " + mediaAluno);
            System.out.println("Ele Esta de Recuperação");
        }else if(mediaAluno < 50){
            System.out.println("O Aluno esta com media de: " + mediaAluno);
            System.out.println("O Alnu esta Reprovado.");
        }else{
            System.out.println("Não Foi Possivel Calcula a Media");
        }
    }
}
