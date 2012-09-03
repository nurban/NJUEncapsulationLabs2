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
    
    GameWorld w = new GameWorld();
    GUI g = new GUI();

    /**
     * @return the difficulty
     * public so that it can be set from the startup.
     */
    public int getDifficulty() {
        return difficulty;
    }

    /**
     * @param difficulty the difficulty to set
     */
    public void setDifficulty(int difficulty) {
        //Insert Parameter Valdiation Here.
        this.difficulty = difficulty;
    }

    /**
     * @return the isMultiplayer
     */
    public boolean isIsMultiplayer() {
        return isMultiplayer;
    }

    /**
     * @param isMultiplayer the isMultiplayer to set
     */
    public void setIsMultiplayer(boolean isMultiplayer) {
        //Insert Parameter Valdiation Here.
        this.isMultiplayer = isMultiplayer;
    }
    
    //private helper method which encapsulates the 2 other private helper methods. 
    private void establishSettings(int difficulty, boolean isMultiplayer) {
        setDifficulty(difficulty);
        setIsMultiplayer(isMultiplayer);
    }
    
    //public method which starts the game. (to be called by the Starup class to initialize the game.)
    public void startGame() {
        g.generateGUI();
        establishSettings(difficulty, isMultiplayer);
        w.generateWorld();  //calling generateWorld also calls the generateCharacter method.
        
    }
}
