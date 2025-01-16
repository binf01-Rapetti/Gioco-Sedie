
package GiocoSedieRapetti;

class Display extends Thread {
    private Posto sedie[];
    private boolean endgame;

    // Costruttore che prende l'array delle sedie
    public Display(Posto sedie[]) {
        this.sedie = new Posto[sedie.length];
        for (int s = 0; s < sedie.length; s++)
            this.sedie[s] = sedie[s];
    }

    /**
     * Metodo che visualizza lo stato attuale delle sedie e termina quando tutte le sedie sono occupate.
     */
    public void run() {
        try {
            while (!endgame) {
                int count = 0; // Conta il numero di sedie occupate

                // Ritardo casuale tra le visualizzazioni
                sleep((int) (Math.random() * 250));

                for (int i = 0; i < sedie.length; i++) {
                    if (sedie[i].libero()) {
                        System.out.print("0"); // La sedia è libera
                    } else {
                        count++;
                        System.out.print("*"); // La sedia è occupata
                    }
                }
                System.out.println();

                // Verifica se tutte le sedie sono occupate
                endgame = (count == sedie.length);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}


