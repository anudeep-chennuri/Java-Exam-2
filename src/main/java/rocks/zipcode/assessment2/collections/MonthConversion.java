package rocks.zipcode.assessment2.collections;
import java.text.DateFormatSymbols;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Use a map to solve
 */
public class MonthConversion {
    /**
     * @param monthNumber - ordinal of month in the year; i.e. January = 1, February = 2
     * @param monthName - name of month
     */
    HashMap<Integer, String> monthMap = new HashMap<>();
//        Map.Entry(1, "January")
//        Map.Entry(2, "February")
//        Map.Entry(3, "March")
//       Map.Entry(4, "April")
//        Map.Entry(5, "May")
//        Map.Entry(6, "June")
//       Map.Entry(7, "July")
//        Map.Entry(8, "August")
//        Map.Entry(9, "September")
//        Map.Entry(10, "October")
//       Map.Entry(11, "November")
//       Map.Entry(12, "December")





    public void add(Integer monthNumber, String monthName) {
        monthMap.put(1, "January");
        monthMap.put(2, "February");
        monthMap.put(3, "March");
        monthMap.put(4, "April");
        monthMap.put(5, "May");
        monthMap.put(6, "June");
        monthMap.put(7, "July");
        monthMap.put(8, "August");
        monthMap.put(9, "September");
        monthMap.put(10, "October");
        monthMap.put(11, "November");
        monthMap.put(12, "December");

        monthMap.put(monthNumber, monthName);

    }

    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    public String getName(Integer monthNumber) {
        throw new NullPointerException();
    }

    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    public int getNumber(String monthName) {
        return (Integer)null;
    }

    /**
     * @param monthNumber
     * @return true if the monthNumber is in the keySet
     */
    public Boolean isValidNumber(Integer monthNumber) {
        return null;
    }

    /**
     * @param monthName
     * @return true if the monthName is in the valueSet
     */
    public Boolean isValidMonth(String monthName) {
        return null;
    }

    /**
     * @return number of entries in this mapping
     */
    public Integer size() {
        return -1;
    }

    /**
     * @param monthNumber - number of month in year
     * @param monthName - name of month
     */
    public void update(Integer monthNumber, String monthName) {

    }
}
