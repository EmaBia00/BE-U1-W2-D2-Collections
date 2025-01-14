import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Esercizio 1:");
        Esercizio1 esercizio1 = new Esercizio1();
        esercizio1.esegui();

        System.out.println("\nEsercizio 2:");
        Esercizio2 esercizio2 = new Esercizio2();

        int n = 10;
        List<Integer> numeriCasuali = esercizio2.generaNumeriCasuali(n);
        System.out.println("Lista ordinata di numeri casuali: " + numeriCasuali);

        List<Integer> listaUnita = esercizio2.invertiEUnisci(numeriCasuali);
        System.out.println("Lista unita con l'inversione: " + listaUnita);

        esercizio2.stampaElementi(listaUnita, true);
        esercizio2.stampaElementi(listaUnita, false);
    }
}
