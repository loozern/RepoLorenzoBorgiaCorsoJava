
import java.util.Arrays;
import java.util.Scanner;   //Importo la funzionalità scanner dalla libreria di Java util (Scanner è una classe!)

class ArrayEsercizio {
    public static void main(String[] args) {
        
        // Inizializzazione
        
        boolean MenuGenerale = true;
        boolean MenuArrayNumeri = true;
        boolean MenuArrayNomi = true;
        boolean z = true;
        
        int CicloGenerale = 0;
        int CicloNumeri = 0;
        int CicloNomi = 0;
        int iPROVA3 = 0;

        //int ControlloArrayNumeri = 0;

        double[] ArrayNumeri = {0, 0, 0};
        String[] ArrayNomi = {"", "", ""};
        
        //Creazione Scanner

        Scanner scannerStringa = new Scanner(System.in);
        Scanner scannerDouble = new Scanner(System.in);

        // Inizio Cicli

        do {        // Inizio Do WHILE Generale
            if (MenuGenerale == true){       // Inizio Menu Generale
                

                // Reset Cicli
                MenuGenerale = true;
                CicloGenerale = 0;
                MenuArrayNumeri = true;
                CicloNumeri = 0;
                MenuArrayNomi = true;
                CicloNomi = 0;

                System.out.println();
                System.out.println("--- --- ---");
                System.out.println("Menu Generale");
                System.out.println("Scegli in quale Array aggiungere dati");
                System.out.println("--- --- ---");
                System.out.println();
                System.out.println("1.Numeri - 2.Stringhe - 3.Esci");
                System.out.println();
                String inputScelta = scannerStringa.nextLine();     // Legge l'input dell'utente

                if (inputScelta.equals("1")) {      // Inizio IF NUMERI

                    System.out.println("-> Entro in Array Numeri!");

                    do {
                        if (MenuArrayNumeri == true) {       //Inizio

                            System.out.println();
                            System.out.println("--- --- ---");
                            System.out.println("Quale numero vuoi inserire?");
                            System.out.println("--- --- ---");
                            System.out.println();
                            double inputNumero = scannerDouble.nextDouble();    // Legge l'input numerico dell'utente

                            /* ----->>>> if (ControlloArrayNumeri < ) {
                                
                            } else {
                                
                            }*/

                            /*do {      // -> Grazie Nives!  :) <-    Controllo di non uscire dalla dimensione del mio Array
                                if (ArrayNumeri[ControlloArrayNumeri] == 0) {
                                    
                                    System.out.println();
                                    System.out.println("--- --- ---");
                                    System.out.println("Quale numero vuoi inserire?");
                                    System.out.println("--- --- ---");
                                    System.out.println();

                                    double inputNumero = scannerDouble.nextDouble();    // Legge l'input numerico dell'utente
                                    ArrayNumeri[ControlloArrayNumeri] = inputNumero;

                                    System.out.println(Arrays.toString(ArrayNumeri));   //Stampo l'Array!

                                } else {
                                    
                                    ControlloArrayNumeri++;

                                }

                            } while (ControlloArrayNumeri < 3); */
        
                        }       // Chiusura IF MENU 

                    } while (CicloNumeri < 5);      // Chiusura While Numeri
                    
                } else if (inputScelta.equals("2")) {       // Inizio IF NOMI
                    //
                } else if (inputScelta.equals("3")) {       // Inizio IF USCITA
                    
                    System.out.println("-> Esco. Grazie. Segui il Coniglio Bianco.");
                    System.out.println();
                    MenuGenerale = false;
                    CicloGenerale = 10;

                } else {        // Errore inserimento menu generale

                    System.out.println("ERRORE");
                    System.out.println("Controlla la tua scelta!");

                }

            }

        } while (CicloGenerale < 5);        // Chiusura DO WHILE Generale

        /*        
        // ARRAY

        String[] cani = {"Bau","Bau2","FRANK","Madlin"};
        System.out.println();
        System.out.println(cani[0]);
        System.out.println();
        
        // ARRAY 2

        String[] cani2 = {"Bau","Bau2","FRANK","Madlin"};
        System.out.println();
        System.out.println(cani2[0]);
        System.out.println();
        
        // ?????length
        
        // APPUNTI
        
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        Valore iniziale | Valore di paragone | Valore per "rompersi"       
        for (int i = 0; i <= cars.length; i++) {      // i pari a zero, i minore della lunghezza dell'array cars, ogni volta che viene eseguito aumenta una volta 
            System.out.println(cars[i]);
        }

        OPPURE

        for i = 0;
        for ( i <= cars.length) {
            System.out.println(cars[i]);
            i++;
        }

        // break

        // continue

        */ 
    }   // Chiusura MAIN
}   // Chiusura ArrayEsercizio
