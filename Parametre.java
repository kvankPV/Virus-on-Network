

public class Parametre {
    private int pocetGuliciek;
    private int vzdialenostMedziG;
    private int pocInf;    
    private double sancaSirenia;
    private double zotavenie;
    private double odolnost;
    
    public Parametre(int pocetG,int vzdialenost, int infikovany, double sirenie, int kontr, double zotav, double odol) {  
           if((pocetG < 0) || (pocetG > 50)){
            System.out.println("Zadali ste chybnú hodnotu guličiek.");
        }else{
            this.pocetGuliciek = pocetG;
        }
        
         if((vzdialenost < 0) || (vzdialenost > 49)){
            System.out.println("Zadali ste chybnú hodnotu vzdialenosti.");
        }else{
            this.vzdialenostMedziG = vzdialenost; 
        }
        
        if((infikovany < 0) || ( infikovany > 50)){
            System.out.println("Zadali ste chybnú hodnotu infikovaných.");
        }else{
            this.pocInf = infikovany; 
        }
        
        if((sirenie < 0 ) || (sirenie > 10)) {
            System.out.println("Zadali ste chýbnú hodnotu šírenia.");
        }else {
            this.sancaSirenia = sirenie;
        }

        if((zotav < 0 ) || (zotav > 10 )) {
            System.out.println("Zadali ste chýbnú hodnotu zotavenia.");
        }else {
            this.zotavenie = zotav;
        }
        
        if((odol < 0 ) || (odol > 100 )) {
            System.out.println("Zadali ste chýbnú hodnotu odolnosti.");
        }else {
            this.odolnost = odol;
        }
   }
   
   public int getPocetGuliciek() {
       return this.pocetGuliciek;
   }
   
   public int getVzdialMedziGulic() {
       return this.vzdialenostMedziG;
   }
   
   public int getPocetInfik() {
       return this.pocInf;
   }
   
   public double getSancaSirenia() {
       return this.sancaSirenia;
   }
   
   public double getZotavenie() {
       return this.zotavenie;
   }
   
   public double getOdolnost() {
       return this.odolnost;
    }
}
    
   