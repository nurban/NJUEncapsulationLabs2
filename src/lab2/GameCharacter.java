/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author nurban
 */
public class GameCharacter {
    private String firstName;
    private String lastName;
    private String species;
    private String planet; //What planet your character is from
    private String gender; //Male or Female
    
    //Setter for firstName
    public void setFirstName(String first) {
        //Insert Parameter Valdiation Here.
        this.firstName = first;
    }
    
    //Setter for lastName
    public void setLastName(String last) {
        //Insert Parameter Valdiation Here.
        this.lastName = last;
    }
    
    //Setter for species
    public void setSpecies(String species) {
        //Insert Parameter Valdiation Here.
        this.species = species;
    }
    
    //Setter for planet
    public void setPlanet(String planet) {
        //Insert Parameter Valdiation Here.
        this.planet = planet;
    }
    
    //Setter for gender
    public void setGender(String gender) {
        //Insert Parameter Valdiation Here.
        this.gender = gender;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @return the species
     */
    public String getSpecies() {
        return species;
    }

    /**
     * @return the planet
     */
    public String getPlanet() {
        return planet;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }
    
    //Public method which calls private helper methods to generate character.
    public void generateCharacter() {
        getFirstName();
        getLastName();
        getSpecies();
        getPlanet();
        getGender();
    }
}