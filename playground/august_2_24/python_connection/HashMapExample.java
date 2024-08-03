package august_2_24.python_connection;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Creating a new HashMap
        // and creating key-value pairs
        Map<String, String> myDict = new HashMap<>();
        myDict.put("key1", "value1");
        myDict.put("key2", "value2");
        myDict.put("key3", "value3");

        System.out.println(String.format("myDict: %s", myDict));
        System.out.println();
        
        // Reading HashMap values
        String value1 = myDict.get("key1");
        System.out.println("Value for 'key1': " + value1);
        System.out.println();

        // Updating value for a key already in the hash map
        myDict.put("key1", "value4");
        String value4 = myDict.get("key1");
        System.out.println(String.format("myDict[%s] = %s", "key1", value4));
        System.out.println();

        // Deleting key from hash map
        // No error when you attempt to remove a key that does not exist
        myDict.remove("key4");
        System.out.println(String.format("myDict after removing key4: %s", myDict));

        myDict.remove("key3");
        System.out.println(String.format("myDict after removing key3: %s", myDict));
        System.out.println();

        // Attempt to retrieve key that does not exist anymore
        System.out.println(String.format("myDict.get(\"key3\") = %s", myDict.get("key3")));

        myDict.put("key3", "value5");
        System.out.println(String.format("myDict.entrySet() = %s", myDict.entrySet()));
        System.out.println();

        // Iterate through hash map
        for (Map.Entry<String, String> entry : myDict.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        

    }
}
