package co.edu.udistrital.model;
import co.edu.udistrital.SpellBehavior.SpellBehavior;

/**
 *
 * @author Estudiantes
 */
public class Wizard {
    
    protected String name;
    protected String actualSpell;
    protected SpellBehavior spellBehavior; 
    
    public Wizard() {
        
    }
    
    public void display() {
        System.out.println("I'm " + name + " and I'm currently using " + actualSpell);
    }
    
    public void performSpell() {
        spellBehavior.castSpell();
    }
    
    public void setActualSpell(SpellBehavior sb, String spell) {
        this.actualSpell = spell;
        this.spellBehavior = sb;
    }
}
