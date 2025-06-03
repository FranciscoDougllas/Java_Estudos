public class logicos {
    public static void main(String[] args) {
        // Declaração de variáveis
        boolean a = true;
        boolean b = false;

        // Operador AND (E)
        boolean and = a && b;
        System.out.println("AND: " + and); // false

        // Operador OR (OU)
        boolean or = a || b;
        System.out.println("OR: " + or); // true

        // Operador NOT (NÃO)
        boolean notA = !a;
        System.out.println("NOT A: " + notA); // false

        // Operador XOR (OU exclusivo)
        boolean xor = a ^ b;
        System.out.println("XOR: " + xor); // true
    }
}
