import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Esercizio1 {
    public void esegui() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il numero di parole (N): ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Set<String> paroleDistinte = new HashSet<>();
        Set<String> duplicati = new HashSet<>();

        System.out.println("Inserisci " + n + " parole:");
        for (int i = 0; i < n; i++) {
            String parola = scanner.nextLine();
            if (!paroleDistinte.add(parola)) {
                duplicati.add(parola);
            }
        }

        System.out.println("Parole duplicate: " + duplicati);
        System.out.println("Numero di parole distinte: " + paroleDistinte.size());
        System.out.println("Elenco parole distinte: " + paroleDistinte);
    }
}
