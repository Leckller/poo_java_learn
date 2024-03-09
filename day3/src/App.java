public class App {

    public static void main(String[] args) {
        String[] numeros = new String[10];

        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {
                numeros[i] = "ou é beninah";
            } else {
                numeros[i] = "é beninô";
            }
            System.out.println(numeros[i]);
        }

    }
}
