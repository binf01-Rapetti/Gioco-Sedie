package GiocoSedieRapetti;

class Posto {
    private boolean occupato;

    // Costruttore che inizializza lo stato del posto come libero.
    public Posto() {
        occupato = false; // All'inizio il posto è libero.
    }

    /**
     * Verifica se il posto è libero.
     * @return true se il posto è libero, false se è occupato.
     */
    public synchronized boolean libero() {
        return (!occupato); // Restituisce lo stato di occupazione del posto.
    }

    /**
     * Occupa il posto se non è già occupato.
     * @return true se l'occupazione è riuscita, false se il posto è già occupato.
     */
    public synchronized boolean occupa() {
        if (occupato)
            return false; // Se il posto è già occupato, non è possibile occuparlo.
        else
            return occupato = true; // Altrimenti, occupa il posto e ritorna true.
    }
}
