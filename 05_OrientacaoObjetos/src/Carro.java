import java.util.Scanner;

public class Carro {
    String marca;
    String modelo;
    int anoFabricacao;
    String cor;
    String combustivel;

    Carro(String marcaInit, String modeloInit, int anoFabricacaoInit, String corInit, String combustivelInit){
        marca = marcaInit;
        modelo = modeloInit;
        anoFabricacao = anoFabricacaoInit;
        cor = corInit;
        combustivel = combustivelInit;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Digite a marca do Carro: ");
        String marca = input.nextLine();
        System.out.printf("Digite o modelo do Carro: ");
        String modelo = input.nextLine();
        System.out.printf("Digite o ano de fabricação do Carro: ");
        int anoFabricacao = input.nextInt();
        System.out.printf("Digite a cor do Carro: ");
        String cor = input.nextLine();
        System.out.printf("Digite o combustível do Carro: ");
        String combustivel = input.nextLine();

        Carro carro1 = new Carro(marca, modelo, anoFabricacao, cor, combustivel);
        System.out.println("Marca: " + carro1.marca);
        System.out.println("Modelo: " + carro1.modelo);
        System.out.println("Ano de fabricação: " + carro1.anoFabricacao);
        System.out.println("Cor: " + carro1.cor);
        System.out.println("Combustível: " + carro1.combustivel);

        input.close();
    }
}

