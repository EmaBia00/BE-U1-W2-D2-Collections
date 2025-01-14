import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Esercizio2 {
    public List<Integer> generaNumeriCasuali(int n) {
        List<Integer> numeri = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            numeri.add(random.nextInt(101));
        }

        Collections.sort(numeri);
        return numeri;
    }

    public List<Integer> invertiEUnisci(List<Integer> lista) {
        List<Integer> invertita = new ArrayList<>(lista);
        Collections.reverse(invertita);
        List<Integer> unita = new ArrayList<>(lista);
        unita.addAll(invertita);
        return unita;
    }

    public void stampaElementi(List<Integer> lista, boolean pari) {
        System.out.println(pari ? "Elementi in posizioni pari:" : "Elementi in posizioni dispari:");
        for (int i = 0; i < lista.size(); i++) {
            if ((i % 2 == 0 && pari) || (i % 2 != 0 && !pari)) {
                System.out.print(lista.get(i) + " ");
            }
        }
        System.out.println();
    }
}
