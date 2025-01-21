# Gioco delle Sedie - Progetto Java

## Descrizione
Questo progetto implementa una simulazione del **Gioco delle Sedie** in Java. 
Il gioco coinvolge un numero di partecipanti che competono per occupare posti disponibili. 
Il progetto include concetti di concorrenza e gestione dei thread per simulare la dinamica del gioco.

---

## Struttura del Progetto

- **`Posto.java`**  
  Gestisce lo stato di un singolo posto (libero o occupato). Implementa metodi `synchronized` per garantire la sicurezza nei thread.

- **`Partecipante.java`**  
  Simula i partecipanti al gioco, rappresentati come thread che cercano di occupare un posto.

- **`Display.java`**  
  Visualizza in tempo reale lo stato dei posti (occupati o liberi) durante il gioco.

- **`Scrittore.java`**  
  Scrive informazioni su file, ad esempio i risultati del gioco.

- **`TestGiocoSedie.java`**  
  Classe principale che avvia il gioco, inizializza i partecipanti, i posti e il display.

- **`CHANGELOG.md`**  
  Registro delle modifiche effettuate durante lo sviluppo del progetto.

- **`UML`**  
  Contiene il diagramma UML che rappresenta la struttura e le relazioni tra le classi.

- **`Domande`**  
  File di testo con domande date dalla professoressa utili sul progetto tutte ovviamente risposte con anche in alcuni casi dei riferimenti al codice.

---
