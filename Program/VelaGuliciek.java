import java.util.ArrayList;

/**
 * Write a description of class VelaGuliciek here.
 * 
 * @author Dominik Nýč
 * @version 03.12.2022
 */
public class VelaGuliciek {
    
    private ArrayList <Gulicka> gulo;
    
    public VelaGuliciek () {
        this.gulo = new ArrayList <Gulicka> ();
    }
    
    public void spawnGuliciek (int pocet) {
        
        for (int j = 0; j < pocet; j++) {
            this.gulo.add(new Gulicka ());
        }
          
    }
    
    public int getMnozstvoGuliciek () {
        return this.gulo.size();
    }
   
    public int getSuradnicuXVybranejGulicky (int cisloGulicky) {
        return this.gulo.get(cisloGulicky).getVelkostX();
    }
    
    public int getSuradnicuYVybranejGulicky (int cisloGulicky) {
        return this.gulo.get(cisloGulicky).getVelkostY();
    }
    
    public void vymazVsetkyGulicky () {
        if (this.gulo.size() >= 0) {
            for (Gulicka h : this.gulo) {
                h.zmaz();
            }
            
            this.gulo.clear();
        }
        
    }
}