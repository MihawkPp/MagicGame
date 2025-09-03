package co.edu.udistrital.model;

import co.edu.udistrital.SpellBehavior.Expelliarmus;

/**
 *
 * @author Estudiantes
 */
public class RonWeasley extends Wizard{
    
    public RonWeasley() {
        super();
        name = "Ron Weasley";
        actualSpell = "Expelliarmus";
        spellBehavior = new Expelliarmus();
    }
}
