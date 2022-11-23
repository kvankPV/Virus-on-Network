import java.util.Random;


/**
 * Write a description of class Gulicky here.
 * 
 * @author Dominik Nýč 
 * @version (a version number or a date)
 */
public class Gulicky {
    private Random random;
    
    private Elipsa gulicka;
    private int velkostGulicky;
    
    
    private int randomX;
    private int randomY;
    

    public Gulicky (int velkostGulicky) {
        
        this.gulicka = new Elipsa ();
        this.gulicka.zmenOsi(velkostGulicky, velkostGulicky);
        
        this.random = new Random();
        this.randomX = random.nextInt(400);
        this.randomY = random.nextInt(400);
        
    }
    
   
    public Gulicky () {
        
        this.gulicka = new Elipsa();
        
        this.gulicka.zmenOsi(15, 15);
        
        nahodnyPosun();
        
        
    }
    
    
    public Elipsa getGulicka () {
        
        return this.gulicka;
    }
    
    public void zobrazGulicku () {
        
        this.gulicka.posunVodorovne(random.nextInt(50));
        this.gulicka.posunZvisle(random.nextInt(50));
        this.gulicka.zobraz();
        
        
    }
    
    public boolean zmenVelkostGulicky (int novaVelkost) {
        
        if (novaVelkost >= 1) {
            
            this.gulicka.zmenOsi(novaVelkost, novaVelkost);
            return true;
        }
        
        return false;
    }
    
    public void skryGulicku () {
        
        this.gulicka.skry();
    }
    
    public void nahodnyPosun () {
        
        
        if (this.gulicka.getLavyHornyX()<= 280 && this.gulicka.getLavyHornyY() <= 280) {
            
        this.gulicka.posunVodorovne(this.randomX);
        this.gulicka.posunZvisle(this.randomY);
       }

   }
   
   
}