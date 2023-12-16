public class Ex07 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;
            }

            switch (i) {
                case 1:
                    System.out.println("N�mero 1 - � o n�mero 1");
                    break;
                case 2:
                    System.out.println("N�mero 2 - � o n�mero 2");
                    break;
                case 3:
                    System.out.println("N�mero 3 - � o n�mero 3");
                    break;
                case 4:
                    System.out.println("N�mero 4 - � o n�mero 4");
                    break;
                case 5:
                    System.out.println("N�mero 5 - � o n�mero 5");
                    break;
                default:
                    System.out.println("N�mero desconhecido");
            }
        }
    }
}
