

public class Parametre {
    private int pocetGuliciek;
    private int vzdialenostMedziG;
    private int pocInf;    
    private double sancaSirenia;
    private double zotavenie;
    private double odolnost;
    
    public Parametre(int pocetG,int vzdialenost, int infikovany, double sirenie, double zotav, double odol) {  
        this.pocetGuliciek = pocetG;
        this.vzdialenostMedziG = vzdialenost;
        this.pocInf = infikovany;
        this.sancaSirenia = sirenie;
        this.zotavenie = zotav;
        this.odolnost = odol;
    }

    public int pocetGuliciek() {
        if((this.pocetGuliciek > 0) && (this.pocetGuliciek <= 50)){
            return this.pocetGuliciek;
        }else{
            return 0;
        }
    }
    
    public int vzdialenostMedziG() {
        if((this.vzdialenostMedziG > 0) && (this.vzdialenostMedziG <= 49)){
            return this.vzdialenostMedziG;
        }else{
            return 0;
        }
    }
    
    public int pocInf() {
        if((this.pocInf > 0) && ( this.pocInf <= 50)){
            return this.pocInf;
        }else{
             return 0;
        }
    }
    
    public double sancaSirenia() {   
        if(( this.sancaSirenia > 0) && (this.sancaSirenia <= 10)) {
            return this.sancaSirenia;
        }else {
            return 0;
        }
    }  
    
    public double zotavenie() {
        if((this.zotavenie > 0 ) && (this.zotavenie <= 10 )) {
             return this.zotavenie;
        }else {
             return 0;
        }
    }
   
    public double odolnost() {
        if((this.odolnost > 0 ) && (this.odolnost <= 100)) {
            return this.odolnost;
        }else {
            return 0;
        }
    }
}
    
   