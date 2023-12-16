public class Ex10 {
    public static void main(String[] args) {
        int[] numeros = {-2, -1, 0, 1, 2};

        for (int numero : numeros) {
            System.out.println(numero);

            if (numero < 0) {
                System.out.println("N�mero negativo encontrado. Interrompendo o loop.");
                break;
            }
        }
    }
}
