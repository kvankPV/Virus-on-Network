import java.util.Random;

/**
 *
 * 
 * @author Domink Nýč 
 * @version 03.12.2022
 */
public class Gulicka {
    
    private Elipsa gulicka;
    private Random random;
    
    
    public Gulicka () {
        this.random = new Random ();
        
        int x = this.random.nextInt(760);
        int y = this.random.nextInt(560);
        
        this.gulicka = new Elipsa (x, y);
        
        this.gulicka.zmenOsi(30, 30);
        this.gulicka.zobraz();
    }
    
    public int getVelkostX() {
        return this.gulicka.getLavyHornyX();
    }
    
    public int getVelkostY() {
        return this.gulicka.getLavyHornyY();
    }
    
    public void nastavVelkostOsi (int x, int y) {
        this.gulicka.zmenOsi(x, y);
    }
    
    public void zobraz () {
        this.gulicka.zobraz();
    }
    
    public void zmaz () {
        this.gulicka.skry();
    }
    
    public void farbaModra () {
        this.gulicka.zmenFarbu("blue");
    }
        
    public void farbaCervena () {
        this.gulicka.zmenFarbu("red");
    }
    
    public void farbaSiva () {
        this.gulicka.zmenFarbu("grey");
        // Bohužiaľ, sivá farba nie je :/ 
    }
    
    public void posunSaY(int y) {
        if (this.gulicka.getLavyHornyY() + y <= 560 ) {
            this.gulicka.posunZvisle(y);
        }
    }
   
    public void posunSaX(int x) {
        if (this.gulicka.getLavyHornyX() + x <= 760) {
            this.gulicka.posunVodorovne(x);
        }
    }
}