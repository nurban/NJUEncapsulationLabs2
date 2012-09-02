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
    private String gender; //M or F
    
    //Setter for firstName
    private void setFirstName(String first) {
        this.firstName = first;
    }
    
    //Setter for lastName
    private void setLastName(String last) {
        this.lastName = last;
    }
    
    //Setter for species
    private void setSpecies(String species) {
        this.species = species;
    }
    
    //Setter for planet
    private void setPlanet(String planet) {
        this.planet = planet;
    }
    
    //Setter for gender
    private void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the firstName
     */
    private String getFirstName() {
        return firstName;
    }

    /**
     * @return the lastName
     */
    private String getLastName() {
        return lastName;
    }

    /**
     * @return the species
     */
    private String getSpecies() {
        return species;
    }

    /**
     * @return the planet
     */
    private String getPlanet() {
        return planet;
    }

    /**
     * @return the gender
     */
    private String getGender() {
        return gender;
    }
    
    //Public method which calls private helper methods.
    public void generateCharacter() {
        getFirstName();
        getLastName();
        getSpecies();
        getPlanet();
        getGender();
    }
}