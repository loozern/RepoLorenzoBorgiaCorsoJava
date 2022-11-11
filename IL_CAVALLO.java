
class IL_CAVALLO {
    public static void main(String[] args) {

        double PrimaVariabile = 0;
        double SecondaVariabile = 0;
        double TerzaVariabile = 0;
        char LetteraB = 'b';
        boolean PrimoBool;
        boolean SecondoBool;
        double primoOutput = 0;

        // VALORIZZAZIONI

        PrimaVariabile = LetteraB;
        SecondaVariabile = 123.34;
        TerzaVariabile = 1;
        PrimoBool = true;
        SecondoBool = false;
       
        // stampatori di controllo valorizzazione

        System.out.println();
        System.out.println("Controllo valorizzazione");
        System.out.println(PrimaVariabile);
        System.out.println(SecondaVariabile);
        System.out.println(TerzaVariabile);
        System.out.println();

        // SOMMA DI TUTTI E DIVISIONE PER TRE

        primoOutput += PrimaVariabile;
        primoOutput += SecondaVariabile;
        primoOutput += TerzaVariabile;
        primoOutput /= 3;

        // stampa somma totale e divisione
        
        System.out.println("Somma e divisione per tre");
        System.out.println(primoOutput);
        System.out.println();

        // CONTROLLO UGAGLIANZA TRA DUE BOOL E STAMPA
        
        System.out.println("Controllo uguaglianza Bool+Evviva+div");
        //if (PrimoBool||SecondoBool) {System.out.println("EVVIVA! " + primoOutput);}      //Funziona ma non è semplice!
        System.out.println((PrimoBool||SecondoBool) + " Evviva! " + primoOutput);
        System.out.println();

    }   //fine di main                                                                                                                                                                     
}  // fine della classe IL_CAVALLO                                                                                                                