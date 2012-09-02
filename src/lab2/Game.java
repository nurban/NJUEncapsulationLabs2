/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author nurban
 */
public class Game {
    private int difficulty; // 1 is easy; 2 is medium; 3 is hard.
    private boolean isMultiplayer;  //true = multiplayer; false = single player.
    
    GameCharacter c = new GameCharacter();
    GameWorld w = new GameWorld();
    GUI g = new GUI();

    /**
     * @return the difficulty
     */
    private int getDifficulty() {
        return difficulty;
    }

    /**
     * @param difficulty the difficulty to set
     */
    private void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    /**
     * @return the isMultiplayer
     */
    private boolean isIsMultiplayer() {
        return isMultiplayer;
    }

    /**
     * @param isMultiplayer the isMultiplayer to set
     */
    private void setIsMultiplayer(boolean isMultiplayer) {
        this.isMultiplayer = isMultiplayer;
    }
    
    //private method which encapsulates the 2 other private helper methods. 
    private void establishSettings(int difficulty, boolean isMultiplayer) {
        setDifficulty(difficulty);
        setIsMultiplayer(isMultiplayer);
    }
    
    public void startGame() {
        g.generateGUI();
        establishSettings(difficulty, isMultiplayer);
        c.generateCharacter();
        w.generateWorld();
        
    }
}
