/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author nurban
 */

//This class is the data class, which is designed to manage the arrays for the
//
public class PartsData {
    
    //Arrays containing parts data.
    private String[] partNums = new String[10];
    private String[] partDescs = new String[10];
    private double[] partPrices = new double[10];
    private int emptyRow;
    
    /**
     * @return the partNums
     */
    public String[] getPartNums() {
        return partNums;
    }

    /**
     * @param partNums the partNums to set
     */
    public void setPartNums(String[] partNums) {
        //Insert Parameter Check here.
        this.partNums = partNums;
    }

    /**
     * @return the partDescs
     */
    public String[] getPartDescs() {
        return partDescs;
    }

    /**
     * @param partDescs the partDescs to set
     */
    public void setPartDescs(String[] partDescs) {
        //Insert Parameter Check here.
        this.partDescs = partDescs;
    }

    /**
     * @return the partPrices
     */
    public double[] getPartPrices() {
        return partPrices;
    }

    /**
     * @param partPrices the partPrices to set
     */
    public void setPartPrices(double[] partPrices) {
        //Insert Parameter Check here.
        this.partPrices = partPrices;
    }
    /**
     * @return the emptyRow
     */
    public int getEmptyRow() {
        return emptyRow;
    }

    /**
     * @param emptyRow the emptyRow to set
     */
    public void setEmptyRow(int emptyRow) {
        this.emptyRow = emptyRow;
    }
    
    public int incrementEmptyRow() {
        return emptyRow += 1;
    }
    // Only perform the sort if we have records
    public void sortData() {
        if(getEmptyRow() > 0) {
            // Bubble sort routine adapted from sample in text book...
            // Make sure the operations are peformed on all 3 arrays!
            for(int passNum = 1; passNum < getEmptyRow(); passNum++) {
                for(int i = 1; i <= getEmptyRow()-passNum; i++) {
                    String temp = "";
                    temp += getPartPrices()[i-1];
                    getPartPrices()[i-1] = getPartPrices()[i];
                    getPartPrices()[i] = Double.parseDouble(temp);

                    temp = getPartNums()[i-1];
                    getPartNums()[i-1] = getPartNums()[i];
                    getPartNums()[i] = temp;

                    temp = getPartDescs()[i-1];
                    getPartDescs()[i-1] = getPartDescs()[i];
                    getPartDescs()[i] = temp;
                }
            }
        }
    }

    
    
}
