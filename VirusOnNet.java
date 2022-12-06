import java.util.concurrent.TimeUnit;
/**
 * Write a description of class VirusOnNet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VirusOnNet {
    /**
     * Constructor for objects of class VirusOnNet
     */
    private Parametre parametre;
    private Siet siet;
    public VirusOnNet() {
        // initialise instance variables
    }

    public void start(int mnozstvoModul, int vzdiaModul, int pocetInfik, double sancaSirenia, double sancaZotavenia, double sancaOdolnosti) {
        Parametre inip = new Parametre(mnozstvoModul, vzdiaModul, pocetInfik, sancaSirenia, sancaZotavenia, sancaOdolnosti);
        // if parametre false tak start neprejde, musim urobit system out println
        //gettery parametrov
        Siet inig = new Siet(mnozstvoModul, vzdiaModul, pocetInfik, sancaSirenia, sancaZotavenia, sancaOdolnosti);
        while (inig.pocetSedych() <= 50) {
            //siet. a nejaky random sa musi urobit v tej triede
            Platno.dajPlatno().wait(40);
        }
    }
    
    public void vyhodnotenie() {
        //urobim system out println vsetkych hodnot ? // podla siete
    }
}
