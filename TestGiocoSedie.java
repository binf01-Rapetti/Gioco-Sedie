package GiocoSedieRapetti;

import java.util.Scanner;
import java.util.logging.Logger;

public class TestGiocoSedie {
    private static Logger logger = Logger.getLogger("GiocoSedie.TestGiocoSedie");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Chiediamo all'utente di inserire il numero di sedie e partecipanti
        System.out.print("Inserisci il numero di sedie: ");
        int numSedie = scanner.nextInt(); // Numero di sedie
        System.out.print("Inserisci il numero di partecipanti: ");
        int numPartecipanti = scanner.nextInt(); // Numero di partecipanti

        Posto sedie[] = new Posto[numSedie]; // Array di sedie

        // Inizializziamo ogni sedia come libera
        for (int k = 0; k < sedie.length; k++) {
            sedie[k] = new Posto();
        }

        Display display = new Display(sedie);
        logger.info("Sto facendo partire il Display.\n");
        display.start(); // Avviamo il thread che mostra lo stato delle sedie

        // Creiamo i thread partecipanti
        Partecipante partecipanti[] = new Partecipante[numPartecipanti];
        for (int i = 0; i < numPartecipanti; i++) {
            partecipanti[i] = new Partecipante(sedie);
            partecipanti[i].start(); // Avviamo ogni thread partecipante
        }
    }
}
