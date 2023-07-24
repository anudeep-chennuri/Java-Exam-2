package rocks.zipcode.assessment2.collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {
    private Map<String, Integer> inventoryMap;
    /**
     * @param strings list of strings to add / remove / fetch from
     */
    public Inventory(List<String> strings) {
        inventoryMap = new HashMap<>();
        for (String s : strings) {
            inventoryMap.put(s,0);
        }

    }

    /**
     * nullary constructor initializes a new list
     */
    public Inventory() {
    }

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {
//        if (inventoryMap.containsKey(item)) {
//            inventoryMap.put(item, inventoryMap.get(item) + 1);
//        } else {
//            inventoryMap.put(item, 1);
//        }
//        {
//            if (inventoryMap.containsKey(item)) {
//                inventoryMap.put(item, inventoryMap.get(item) + 1);
//            } else {
//                inventoryMap.put(item, 1);
//            }
//        }
        return;
    }


    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {
        return;
    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {
        return null;
    }
}
