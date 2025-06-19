package empresa;

/*
 * Modificadores de Acesso em Java:
 * 
 * 1. public: O membro (classe, atributo ou método) pode ser acessado de qualquer lugar do projeto, inclusive por outras classes de outros pacotes.
 * 2. private: O membro só pode ser acessado dentro da própria classe onde foi declarado. Não é visível nem para subclasses.
 * 3. protected: O membro pode ser acessado dentro da própria classe, por subclasses (mesmo que estejam em outros pacotes) e por outras classes do mesmo pacote.
 * 4. default (sem modificador): Se nenhum modificador for especificado, o acesso é permitido apenas para classes do mesmo pacote.
 */

public class Funcionario {
    // Atributo com modificador default (visível apenas dentro do pacote 'empresa')
    String nome;

    // Atributo privado (visível apenas dentro da classe Funcionario)
    private double salario;

    // Construtor público (pode ser acessado de qualquer lugar)
    public Funcionario(String nomeInit, double salarioInit){
        nome = nomeInit;
        salario = salarioInit;
        System.out.println("Nome: " + nome);
        System.out.println("Salario: " + salario);
    }

    // Método protegido (acessível por subclasses e classes do mesmo pacote)
    protected void mostrarSalario() {
        System.out.println("Salario protegido: " + salario);
    }

    // Método default (acessível apenas dentro do pacote)
    void mostrarNome() {
        System.out.println("Nome default: " + nome);
    }

    // Método privado (acessível apenas dentro desta classe)
    private void metodoPrivado() {
        System.out.println("Este é um método privado.");
    }
}
