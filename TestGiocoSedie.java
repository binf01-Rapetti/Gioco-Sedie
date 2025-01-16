package GiocoSedieRapetti;

import java.util.logging.Logger;

public class TestGiocoSedie {
    private final static int NUMSEDIE = 15; // Numero di sedie nel gioco
    private static Logger logger = Logger.getLogger("GiocoSedie.TestGiocoSedie");

    /**
     * Metodo principale che avvia il gioco.
     * @param args Gli argomenti da linea di comando (non utilizzati in questa applicazione).
     */
    public static void main(String[] args) {
        Posto sedie[] = new Posto[NUMSEDIE]; // Crea un array di sedie

        // Inizializza ogni posto come libero
        for (int k = 0; k < sedie.length; k++)
            sedie[k] = new Posto();

        Display display = new Display(sedie);
        logger.info("Sto facendo partire il Display.\n");
        display.start(); // Avvia il thread che gestisce la visualizzazione dello stato del gioco

        // Crea i partecipanti (thread)
        Partecipante array[] = new Partecipante[NUMSEDIE + 1]; // +1 perché ci sono più partecipanti che sedie
        for (int i = 0; i < NUMSEDIE + 1; i++) {
            array[i] = new Partecipante(sedie);
            logger.info("Sto facendo partire il thread id: " + array[i].getId() + " name: " + array[i].getName() + "\n");
            array[i].start(); // Avvia ogni thread partecipante
        }
    }
}

 
