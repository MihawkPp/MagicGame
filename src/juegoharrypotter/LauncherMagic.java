package juegoharrypotter;

import co.edu.udistrital.SpellBehavior.*;
import co.edu.udistrital.model.*;
import java.awt.SystemColor;
import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class LauncherMagic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Wizard wizard;
        int choice;
        int action;
        int spell;
        
        System.out.println("Select a wizard :O"
                            + "1. Harry Potter"
                            + "2. Hermione Granger"
                            + "3. Ron Weasley");
        
        choice = sc.nextInt();
        
        switch (choice) {
            case 1:
                wizard = new HarryPotter();
                break;
            case 2:
                wizard = new HermioneGranger();
                break;
            case 3:
                wizard = new RonWeasley();
                break;
            default:
                throw new AssertionError();
        }
        
        System.out.println("Select an action: "
                            + "1. display"
                            + "2. cast spell"
                            + "3. change spell"
                            + "0. Exit");
        
        action = -1;
        while(action != 0) {
            switch (action) {
                case 1:
                    wizard.display();
                    break;
                case 2:
                    wizard.performSpell();
                    break;
                case 3:
                    System.out.println("Select a new spell:"
                                        + "1. Wingardium Leviosa"
                                        + "2. Oculus Reparo"
                                        + "3. Expelliarmus"
                                        + "4. Expecto Patronum");
                    spell = sc.nextInt();
                    changeSpell(spell, wizard);
                    break;
                default:
                    throw new AssertionError();
            }
        }
        

        
        
        
        
        
    }
    
    public static void changeSpell(int spell, Wizard wizard) {
        switch (spell) {
            case 1:
                wizard.setActualSpell(new WingardiumLeviosa(), "Wingardium Leviosa");
                break;
            case 2:
                wizard.setActualSpell(new OculusReparo(), "Oculus Reparo");
                break;
            case 3:
                wizard.setActualSpell(new Expelliarmus(), "Expelliarmus");
                break;
            case 4:
                wizard.setActualSpell(new ExpectoPatronum(), "Expecto Patronum");
                break;
            default:
                throw new AssertionError();
        }
    }
    
}
