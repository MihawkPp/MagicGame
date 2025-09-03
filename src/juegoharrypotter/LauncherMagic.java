package juegoharrypotter;

import co.edu.udistrital.SpellBehavior.*;
import co.edu.udistrital.model.*;
import java.awt.SystemColor;
import java.util.InputMismatchException;
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
        
        System.out.println("Select a wizard :O\n"
                            + "1. Harry Potter\n"
                            + "2. Hermione Granger\n"
                            + "3. Ron Weasley\n");
        
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
        
        
        
        action = -1;
        while(action != 0) {
            System.out.println("\nSelect an action: \n"
                            + "1. display\n"
                            + "2. cast spell\n"
                            + "3. change spell\n"
                            + "0. Exit\n");
            
            try {
                action = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\nInput valid data\n");
            }
            
            switch (action) {
                case 1:
                    wizard.display();
                    break;
                case 2:
                    wizard.performSpell();
                    break;
                case 3:
                    System.out.println("\nSelect a new spell:\n"
                                        + "1. Wingardium Leviosa\n"
                                        + "2. Oculus Reparo\n"
                                        + "3. Expelliarmus\n"
                                        + "4. Expecto Patronum\n");
                    spell = sc.nextInt();
                    changeSpell(spell, wizard);
                    break;
                case 0:
                    System.out.println("\nThanks for playinggggg :3\n");
                    action = 0;
                    break;
                default:
                    System.out.println("\npusiste datos erroneos, vete >:C\n");
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
