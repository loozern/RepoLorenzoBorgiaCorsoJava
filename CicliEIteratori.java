
import java.util.Scanner;   //Importo la funzionalità scanner dalla libreria di Java util (Scanner è una classe!)

class CicliEIteratori {
    public static void main(String[] args) {
        
        // Inizializzazione

        double PrimaVariabile = 0;
        double SecondaVariabile = 0;
        double TerzaVariabile = 0;
        boolean a = true;
        boolean x = true;
        boolean y = true;
        boolean z = true;
        int iPROVA = 0;
        int iPROVA2 = 0;
        int iPROVA3 = 0;
        int iPROVA4 = 0;

        // Valorizzazione

        PrimaVariabile = 11;
        SecondaVariabile = 22;
        TerzaVariabile = 12.5;
        a = true;
        x = true;
        y = true;
        z = true;
        iPROVA = 0;
        iPROVA2 = 0;
        iPROVA3 = 0;
        iPROVA4 = 0;
        
        // Creazione scanner

        Scanner scannerStringa = new Scanner(System.in);
        Scanner scannerDouble = new Scanner(System.in);
        
        // Inizio Programma

        do {        // Inizio WHILE Generale
            if (a == true){     // Inizio MENU Generale

                // Reset Cicli
                x = true;
                iPROVA2 = 0;
                y = true;
                iPROVA3 = 0;
                z = true;
                iPROVA4 = 0;

                System.out.println();
                System.out.println("--- --- ---");
                System.out.println("Menu Generale");
                System.out.println("Scegli quale operazione eseguire");
                System.out.println("--- --- ---");
                System.out.println();
                System.out.println("Aggiungi - Sottrai - Stampa - Esci");
                System.out.println();
                String inputScelta = scannerStringa.nextLine();     // Legge l'input dell'utente
                    
                if (inputScelta.equals("Aggiungi")) {   // Inizio IF AGGIUNGI

                    System.out.println("-> Aggiungo!");

                    do {    // Inizio WHILE AGGIUNGI
                        if (x == true){      // Inizio MENU Aggiungi
            
                            System.out.println();
                            System.out.println("--- --- ---");
                            System.out.println("Scegli quale variabile aumentare:");
                            System.out.println("--- --- ---");
                            System.out.println();
                            System.out.println("(X = " + PrimaVariabile + ") - (Y = " + SecondaVariabile + ") - (Z = " + TerzaVariabile + ") - Esci");
                            System.out.println();
                            String inputSceltaVariabili = scannerStringa.nextLine();     // Legge l'input dell'utente
                                
                            if (inputSceltaVariabili.equals("X")) {     // Scelta X
            
                                System.out.println("-> Hai scelto X = " + PrimaVariabile + " <-");
                                System.out.println();
                                System.out.println("Inserisci il numero da sommare a X:");
                                System.out.println();
                                double inputSomma = scannerDouble.nextDouble();     // Legge l'input dell'utente

                                if (inputSomma < 0){      // Controllo sul numero inserito e se minore di zero, correggo
                                    inputSomma = -inputSomma;
                                }
                                
                                PrimaVariabile += inputSomma;

                                System.out.println("La somma è -> " + PrimaVariabile);
                                    
                            } else if (inputSceltaVariabili.equals("Y")) {      // Scelta Y
            
                                System.out.println("-> Hai scelto Y = " + SecondaVariabile + " <-");
                                System.out.println();
                                System.out.println("Inserisci il numero da sommare a Y:");
                                System.out.println();
                                double inputSomma = scannerDouble.nextDouble();     // Legge l'input dell'utente

                                if (inputSomma < 0){      // Controllo sul numero inserito e se minore di zero, correggo
                                    inputSomma = -inputSomma;
                                }
                                
                                SecondaVariabile += inputSomma;

                                System.out.println("La somma è -> " + SecondaVariabile);
                                    
                            } else if (inputSceltaVariabili.equals("Z")) {      // Scelta Z
            
                                System.out.println("-> Hai scelto Z = " + TerzaVariabile + " <-");
                                System.out.println();
                                System.out.println("Inserisci il numero da sommare a Z:");
                                System.out.println();
                                double inputSomma = scannerDouble.nextDouble();     // Legge l'input dell'utente

                                if (inputSomma < 0){      // Controllo sul numero inserito e se minore di zero, correggo
                                    inputSomma = -inputSomma;
                                }
                                
                                TerzaVariabile += inputSomma;

                                System.out.println("La somma è -> " + TerzaVariabile);
                                    
                            } else if (inputSceltaVariabili.equals("Esci")) {       // Scelta Esci
            
                                System.out.println("-> Esco. Torno al menu opzioni.");
                                x = false;
                                iPROVA2 = 10;
                                    
                            } else {        // Errore inserimento nel menu
            
                                System.out.println("-> Errore di inserimento, controlla le maiuscole <-");
            
                            }
                        }   // Chiusura IF MENU Aggiungi
                        
                    } while (iPROVA2 < 5);  // Chiusura WHILE AGGIUNGI
                        
                } else if (inputScelta.equals("Sottrai")) {     // INIZIO CICLO IF SOTTRAZIONE

                        System.out.println("-> Sottraggo!");

                        do {            // INIZIO DO WHILE SOTTRAZIONE
                            if (y == true){     // Inizio MENU Sottrai
                
                                System.out.println();
                                System.out.println("--- --- ---");
                                System.out.println("Scegli quale variabile diminuire (sii gentile, non renderla inferiore a 1):");
                                System.out.println("--- --- ---");
                                System.out.println();
                                System.out.println("(X = " + PrimaVariabile + ") - (Y = " + SecondaVariabile + ") - (Z = " + TerzaVariabile + ") - Esci");
                                System.out.println();
                                String inputSceltaVariabili = scannerStringa.nextLine();     //Legge l'input dell'utente
                                    
                                if (inputSceltaVariabili.equals("X")) {     // Scelta X
                
                                    System.out.println("-> Hai scelto X = " + PrimaVariabile + " <-");
                                    System.out.println();
                                    System.out.println("Inserisci il numero da sottrarre a X:");
                                    System.out.println();
                                    double inputSottrazione = scannerDouble.nextDouble();     //Legge l'input dell'utente
                                    
                                    if (inputSottrazione < 0){      // Controllo sul numero inserito e se minore di zero, correggo
                                        inputSottrazione = -inputSottrazione;
                                    }

                                    PrimaVariabile -= inputSottrazione;

                                    while (PrimaVariabile < 1) {       // Controllo che la sottrazione non porti la var sotto 1

                                        System.out.println("Non sei stato gentile! Non posso scendere sotto 1! :( ");
                                        PrimaVariabile += inputSottrazione;
                                        System.out.println();
                                        System.out.println("Torno al valore precedente!");
                                        System.out.println();

                                    };
    
                                    System.out.println("Il risultato è -> " + PrimaVariabile);
                                        
                                } else if (inputSceltaVariabili.equals("Y")) {      // Scelta Y
                
                                    System.out.println("-> Hai scelto Y = " + SecondaVariabile + " <-");
                                    System.out.println();
                                    System.out.println("Inserisci il numero da sottrarre a Y:");
                                    System.out.println();
                                    double inputSottrazione = scannerDouble.nextDouble();     //Legge l'input dell'utente
                                    
                                    if (inputSottrazione < 0){      // Controllo sul numero inserito e se minore di zero, correggo
                                        inputSottrazione = -inputSottrazione;
                                    }

                                    SecondaVariabile -= inputSottrazione;

                                    while (SecondaVariabile < 1) {       // Controllo che la sottrazione non porti la var sotto 1

                                        System.out.println("Non sei stato gentile! Non posso scendere sotto 1! :( ");
                                        SecondaVariabile += inputSottrazione;
                                        System.out.println();
                                        System.out.println("Torno al valore precedente!");
                                        System.out.println();

                                    };
    
                                    System.out.println("Il risultato è -> " + SecondaVariabile);
                                        
                                } else if (inputSceltaVariabili.equals("Z")) {      // Scelta Z
                
                                    System.out.println("-> Hai scelto Z = " + TerzaVariabile + " <-");
                                    System.out.println();
                                    System.out.println("Inserisci il numero da sottrarre a Z:");
                                    System.out.println();
                                    double inputSottrazione = scannerDouble.nextDouble();     //Legge l'input dell'utente
                                    
                                    if (inputSottrazione < 0){
                                        inputSottrazione = -inputSottrazione;
                                    }

                                    TerzaVariabile -= inputSottrazione;

                                    while (TerzaVariabile < 1) {       // Controllo che la sottrazione non porti la var sotto 1

                                        System.out.println("Non sei stato gentile! Non posso scendere sotto 1! :( ");
                                        TerzaVariabile += inputSottrazione;
                                        System.out.println();
                                        System.out.println("Torno al valore precedente!");
                                        System.out.println();

                                    };
    
                                    System.out.println("Il risultato è -> " + TerzaVariabile);
                                        
                                } else if (inputSceltaVariabili.equals("Esci")) {       // Scelta Esci
                
                                    System.out.println("-> Esco. Torno al menu opzioni.");
                                    y = false;
                                    iPROVA3 = 10;
                                        
                                } else {    // Errore inserimento nel menu
                
                                    System.out.println("-> Errore di inserimento, controlla le maiuscole  <-");
                
                                }
                            }       // Chiusura IF MENU Sottrai
                            
                        } while (iPROVA3 < 5);  //Chiusura while SOTTRAI
                        
                } else if (inputScelta.equals("Stampa")) {      // INIZIO CICLO IF STAMPA

                        System.out.println("-> Stampo!");

                        do {            // INIZIO DO WHILE SOTTRAZIONE
                            if (z == true){     // Inizio MENU Stampa
                
                                System.out.println();
                                System.out.println("--- --- ---");
                                System.out.println("Scegli quale variabile stampare:");
                                System.out.println("--- --- ---");
                                System.out.println();
                                System.out.println("(X = " + PrimaVariabile + ") - (Y = " + SecondaVariabile + ") - (Z = " + TerzaVariabile + ") - Tutte - Esci");
                                System.out.println();
                                String inputSceltaVariabili = scannerStringa.nextLine();     //Legge l'input dell'utente
                                    
                                if (inputSceltaVariabili.equals("X")) {     // Scelta X
                
                                    System.out.println("-> Hai scelto di stampare X:");
                                    System.out.println();
                                    
                                    System.out.println("La variabile X è -> " + PrimaVariabile);
                                        
                                } else if (inputSceltaVariabili.equals("Y")) {      // Scelta Y
                
                                    System.out.println("-> Hai scelto di stampare Y:");
                                    System.out.println();
                                    
                                    System.out.println("La variabile X è -> " + SecondaVariabile);
                                        
                                } else if (inputSceltaVariabili.equals("Z")) {      // Scelta Z
                
                                    System.out.println("-> Hai scelto di stampare Z:");
                                    System.out.println();
                                    
                                    System.out.println("La variabile X è -> " + TerzaVariabile);

                                } else if (inputSceltaVariabili.equals("Tutte")) {      // Scelta Tutte
                
                                    System.out.println("-> Hai scelto di stamparle tutte:");
                                    System.out.println();
                                    
                                    System.out.println("(X = " + PrimaVariabile + ") - (Y = " + SecondaVariabile + ") - (Z = " + TerzaVariabile + ")");    
                                        
                                } else if (inputSceltaVariabili.equals("Esci")) {       // Scelta Esci
                
                                    System.out.println("-> Esco. Torno al menu opzioni.");
                                    z = false;
                                    iPROVA4 = 10;
                                        
                                } else {        // Errore inserimento nel menu stampa
                
                                    System.out.println("-> Errore di inserimento, controlla le maiuscole <-");
                
                                }
                            }       // Chiusura IF MENU Stampa
                            
                        } while (iPROVA4 < 5);  //Chiusura while SOTTRAI
                        
                } else if (inputScelta.equals("Esci")) {        // Scelta uscita GENERALE e chiusura

                    System.out.println("-> Esco. Grazie. Segui il Coniglio Bianco.");
                    System.out.println();
                    a = false;
                    iPROVA = 10;
                        
                } else {        // Errore inserimento nel menu Generale

                    System.out.println();    
                    System.out.println("-> Errore di inserimento, controlla le maiuscole");

                }                
            }       // Chiusura IF MENU Generale
            
        } while (iPROVA < 5);  // Chiusura while Generale

    }   // Chiusura MAIN
}   // Chiusura CicliEIteratori

/* 
-> -> ->
    // ESEMPI DI CODICE

    int a= 2;
        
    while (!(a != 2) && a == 2) {
        //CODICE
    }

    int iPROVA = 0; // possiamo creare uno scanner, far si che venga scelto da un if
    while (iPROVA < 3) {
        System.out.println(iPROVA);
        iPROVA++;
    }

-> -> ->
    // ERRORI DA CORREGGERE

    // Addizione
    // -> Errore CRITICO 1. Se separo i numeri con un punto invece della virgola, ESPLODE
    // 

    // Sottrazione
    // -> Se inserisco un numero negativo quando viene chiesto un numero da sottrarre, viene sommato -> if (var <0) var = -var???? --- RISOLTO!
    // Errori sulle sottrazioni se agisco più volte sulla stessa variabile, tramite numeri con virgole

    // Stampa
    // 

*/