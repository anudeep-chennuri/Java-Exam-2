package rocks.zipcode.assessment2.arrays;

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

        int len = endingIndex - startingIndex;
       String[] newArray = new String[len];


        System.arraycopy(arrayToBeSpliced, startingIndex, newArray, endingIndex - 1, len);
        return newArray;


    }



    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) {

        int len = arrayToBeSpliced.length - startingIndex;
        String[] newArray = new String[len];


      System.arraycopy(arrayToBeSpliced, startingIndex, newArray, startingIndex, len);

      return newArray;



    }
}
