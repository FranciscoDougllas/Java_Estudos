package empresa;

public class Funcionario {
    String nome;
    double salario;
    int idade;
    String cargo;

    public Funcionario(String nomeInit, double salarioInit, int idadeInit, String cargoInit){
        nome = nomeInit;
        salario = salarioInit;
        idade = idadeInit;
        cargo = cargoInit;
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Cargo: "+cargo);
        System.out.println(("Salario: "+salario));
        System.out.println("=============================");
        System.out.println("O PROGRAMA FUNCIONOU CORRETAMENTE");
    }
}


/** Modificadores de Acesso
 * public - Ficara Publico
 * private - Ficara Privado
 * protected - Ficara Protegido
 * default - Padrao
 **/
