/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author nurban
 */
public class GUI {
    private boolean InputIsKeyboardAndMouse; //True = keyboard and mouse; false = controller.
    private String resolution;  //ex. "1024 x 758".
    private int fontSize;

    /**
     * @return the InputIsKeyboardAndMouse
     */
    private boolean isInputIsKeyboardAndMouse() {
        return InputIsKeyboardAndMouse;
    }

    /**
     * @param InputIsKeyboardAndMouse the InputIsKeyboardAndMouse to set
     */
    private void setInputIsKeyboardAndMouse(boolean InputIsKeyboardAndMouse) {
        //Insert Parameter Valdiation Here.
        this.InputIsKeyboardAndMouse = InputIsKeyboardAndMouse;
    }
    
    /**
     * @return the resolution
     */
    private String getResolution() {
        return resolution;
    }

    /**
     * @param resolution the resolution to set
     */
    private void setResolution(String resolution) {
        //Insert Parameter Valdiation Here.
        this.resolution = resolution;
    }

    /**
     * @return the fontSize
     */
    private int getFontSize() {
        return fontSize;
    }

    /**
     * @param fontSize the fontSize to set
     */
    private void setFontSize(int fontSize) {
        //Insert Parameter Valdiation Here.
        this.fontSize = fontSize;
    }
    
    //public method which calls other private helper methods
    public void generateGUI() {
        isInputIsKeyboardAndMouse();
        getResolution();
        getFontSize();
        
    }
}

