/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author nurban
 */
public class GameWorld {
    private String terrain; //Snow, Mountain, Hills, Island, etc...
    private String season; //Summer, Winter, Spring, or Fall
    private String worldSize; //Small, Medium, Large
    private boolean containsDungeons; //true if world contains explorable dungeouns; false if not.
    private boolean containsEnemyBases; //true if world contains armed enemy bases; false if not.
    
    //GameCharacter object, used in calling generatedCharacter method as part of the generateWorld method.
    //(occurs after world has been generated)
    GameCharacter character = new GameCharacter();
    
    /**
     * @return the terrain
     */
    public String getTerrain() {
        return terrain;
    }

    /**
     * @param terrain the terrain to set
     */
    public void setTerrain(String terrain) {
        //Insert Parameter Valdiation Here.
        this.terrain = terrain;
    }

    /**
     * @return the season
     */
    public String getSeason() {
        return season;
    }

    /**
     * @param season the season to set
     */
    public void setSeason(String season) {
        //Insert Parameter Valdiation Here.
        this.season = season;
    }

    /**
     * @return the worldSize
     */
    public String getWorldSize() {
        return worldSize;
    }

    /**
     * @param worldSize the worldSize to set
     */
    public void setWorldSize(String worldSize) {
        //Insert Parameter Valdiation Here.
        this.worldSize = worldSize;
    }

    /**
     * @return the containsDungeons
     */
    public boolean isContainsDungeons() {
        return containsDungeons;
    }

    /**
     * @param containsDungeons the containsDungeons to set
     */
    public void setContainsDungeons(boolean containsDungeons) {
        //Insert Parameter Valdiation Here.
        this.containsDungeons = containsDungeons;
    }

    /**
     * @return the containsEnemyBases
     */
    public boolean isContainsEnemyBases() {
        return containsEnemyBases;
    }

    /**
     * @param containsEnemyBases the containsEnemyBases to set
     */
    private void setContainsEnemyBases(boolean containsEnemyBases) {
        //Insert Parameter Valdiation Here.
        this.containsEnemyBases = containsEnemyBases;
    }
    
    //Public method which calls all private helper methods.
    public void generateWorld() {
        getTerrain();
        getSeason();
        isContainsDungeons();
        isContainsEnemyBases();
        character.generateCharacter();  //includes character generation,
                                        //which occurs after the game world has been generated.
}
}
