package GiocoSedieRapetti;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Partecipante extends Thread {
    private Posto sedie[];
    private static final String FILE_NAME = "Risultato.txt";

    public Partecipante(Posto sedie[]) {
        this.sedie = sedie;
    }

    @Override
    public void run() {
        try {
            sleep((int) (Math.random() * 1000)); // Attesa casuale prima di cercare un posto

            for (int i = 0; i < sedie.length; i++) {
                if (sedie[i].occupa()) {
                    String risultato = "Partecipante " + this.getName() + " si è seduto sul posto " + i + "\n";
                    salvaRisultato(risultato); // Salviamo il risultato nel file
                    System.out.print(risultato);
                    return;
                }
            }
            String risultato = "Partecipante " + this.getName() + " ha perso\n";
            salvaRisultato(risultato); // Salviamo il risultato nel file
            System.out.print(risultato);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    // Metodo per salvare il risultato in un file
    private synchronized void salvaRisultato(String risultato) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            writer.write(risultato);
        } catch (IOException e) {
            throw new RuntimeException("Errore durante la scrittura del file: " + FILE_NAME, e);
        }
    }
}
