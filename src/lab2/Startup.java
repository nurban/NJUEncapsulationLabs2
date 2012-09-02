/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author nurban
 */
public class Startup {
    
    public static void main(String[] args) {
        
        //Create new Game obbject
        Game g = new Game();
        
        //Call method which calls other classes' methods to generate the game. 
        g.startGame();
    }
}
