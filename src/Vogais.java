import java.util.Scanner;

public class Vogais {
    public static void main(String[] args) {
        String frase;
        int contVogal = 0;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digitte uma frase");
        frase = ler.nextLine();
        frase = frase.toUpperCase();

        for (int i = 0; i < frase.length(); i++) {
            if(frase.charAt(i) == 'A' || frase.charAt(i) == 'E' || frase.charAt(i) == 'I' || frase.charAt(i) == 'O' || frase.charAt(i) == 'U')
                    contVogal++;



    }
        System.out.println("Numero de Vogais na frase é" +contVogal);
}}
