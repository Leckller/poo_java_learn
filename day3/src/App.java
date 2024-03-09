public class App {

    public static void main(String[] args) {
        // String[] numeros = new String[10];

        // for (int i = 0; i < 10; i++) {
        // if (i % 2 != 0) {
        // numeros[i] = "ou é beninah";
        // } else {
        // numeros[i] = "é beninô";
        // }
        // System.out.println(numeros[i]);
        // }
        int actNum = 3;
        int range = 100;

        while (actNum < range) {
            boolean primo = false;
            for (int i = 1; i <= actNum; i++) {
                if (actNum == i) {
                    primo = true;
                }
                if (actNum % 2 == 0) {
                    primo = false;
                }
                float isDiv = actNum / i;
                if (isDiv != (int) isDiv) {
                    primo = false;
                }
            }
            System.out.println(primo ? actNum + " é primo" : actNum + " não é primo");
            actNum++;
        }

    }
}
