package rocks.zipcode.assessment2.arrays;

import java.util.Arrays;

/**
 * @author leon on 28/11/2018.
 */
public class StringArrayUtils {
    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @param endingIndex - ending index of array
     * @return an array with all elements between `startingIndex` and `endingIndex`
     */
    public static String[] getSubArray(String[] arrayToBeSpliced, int startingIndex, int endingIndex) {

//        btw idk why this wouldnt work smh
//        int len = endingIndex - startingIndex;
//       String[] newArray = new String[len];
//
//
//        System.arraycopy(arrayToBeSpliced, startingIndex, newArray, endingIndex - 1, len);
//        return newArray;

        String [] newArray = new String[endingIndex - startingIndex];
        for (int i = 0; i < (endingIndex - startingIndex); i++){
            newArray[i] = arrayToBeSpliced[startingIndex + i];
        }
        return newArray;


    }



    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) {
        String [] newArray = new String[arrayToBeSpliced.length - startingIndex];
        for (int i = 0; i < (arrayToBeSpliced.length - startingIndex); i++){
            newArray[i] = arrayToBeSpliced[startingIndex + i];
        }
        return newArray;





    }
}
