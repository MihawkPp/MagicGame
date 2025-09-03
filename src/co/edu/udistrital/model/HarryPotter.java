package co.edu.udistrital.model;
import co.edu.udistrital.SpellBehavior.ExpectoPatronum;
/**
 *
 * @author Estudiantes
 */
public class HarryPotter extends Wizard{
    
    public HarryPotter() {
        super();
        name = "Harry Potter";
        actualSpell = "Expecto Patronum";
        spellBehavior = new ExpectoPatronum();
    }
            
}
