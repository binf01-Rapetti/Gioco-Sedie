# CHANGELOG


### Modifiche principali:
1. Interazione con l'utente:
   - Dopo l ultima modifica abbiamo aggiunto che l'utente può specificare il numero di sedie e di partecipanti al momento dell'esecuzione.
   - Viene utilizzata la classe Scanner per leggere i valori in input.

2. Salvataggio dei risultati:
   - I risultati del gioco vengono salvati nel nuovo file Risultato.txt.
   - Ogni partecipante registra il proprio risultato (posto occupato o sconfitta) nel file.

3. Sincronizzazione per la scrittura:
   - La scrittura nel file è sincronizzata per evitare conflitti tra i thread.

### File modificati:

- TestGiocoSedie.java: Aggiunta interazione per impostare numero di partecipanti e sedie.
- Partecipante.java: Aggiunto metodo per salvare i risultati in Risultato.txt.


### Risorse

Le risorse sono state prese da: Link e file caricati dalla prof ciuchetti su moodle come how to use Markdown, how to make a changelog... Ho usato anche alcuni siti per aiutarmi a rispondere ad alcune domande: per aiutarmi con la definzione di classe anonime e per capirne il fuznionamento https://docs.oracle.com/javase/tutorial/java/javaOO/anonymousclasses.html, per avere un ripasso della classe monitor e del suo funzionamento https://docs.oracle.com/javase/tutorial/java/javaOO/anonymousclasses.html

