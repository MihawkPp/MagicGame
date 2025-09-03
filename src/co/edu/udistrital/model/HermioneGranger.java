/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.model;

import co.edu.udistrital.SpellBehavior.WingardiumLeviosa;

/**
 *
 * @author Estudiantes
 */
public class HermioneGranger extends Wizard{
    
    public HermioneGranger() {
        super();
        name = "Hermione Granger";
        actualSpell = "Wingardium Leviosa";
        spellBehavior = new WingardiumLeviosa();
    }
}
