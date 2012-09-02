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

    /**
     * @return the terrain
     */
    private String getTerrain() {
        return terrain;
    }

    /**
     * @param terrain the terrain to set
     */
    private void setTerrain(String terrain) {
        this.terrain = terrain;
    }

    /**
     * @return the season
     */
    private String getSeason() {
        return season;
    }

    /**
     * @param season the season to set
     */
    public void setSeason(String season) {
        this.season = season;
    }

    /**
     * @return the worldSize
     */
    private String getWorldSize() {
        return worldSize;
    }

    /**
     * @param worldSize the worldSize to set
     */
    private void setWorldSize(String worldSize) {
        this.worldSize = worldSize;
    }

    /**
     * @return the containsDungeons
     */
    private boolean isContainsDungeons() {
        return containsDungeons;
    }

    /**
     * @param containsDungeons the containsDungeons to set
     */
    private void setContainsDungeons(boolean containsDungeons) {
        this.containsDungeons = containsDungeons;
    }

    /**
     * @return the containsEnemyBases
     */
    private boolean isContainsEnemyBases() {
        return containsEnemyBases;
    }

    /**
     * @param containsEnemyBases the containsEnemyBases to set
     */
    private void setContainsEnemyBases(boolean containsEnemyBases) {
        this.containsEnemyBases = containsEnemyBases;
    }
    
    //Public method which calls all private helper methods.
    public void generateWorld() {
        getTerrain();
        getSeason();
        isContainsDungeons();
        isContainsEnemyBases();
}
}
