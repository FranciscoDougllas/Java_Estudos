public class ParImpar {
    public static void main(String[] args){
        int[] numeros = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12,
        13, 14, 15, 16, 17, 18, 19, 20};

        for(int i = 0; i < numeros.length; i ++){
            if(numeros[i] % 2 == 0){
                System.out.println("O numero: "+numeros[i]+" e par");
            }else{
                System.out.println("O numero: "+numeros[i]+" e impar");
            }
        }

    }
}
