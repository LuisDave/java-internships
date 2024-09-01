package com.exercise.test.practice.map;

import java.util.HashMap;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PracticeMap {
	
    private static final Logger logger = LogManager.getLogger(PracticeMap.class);

    /**
     * Demonstrates the usage of the Map interface in Java by performing 
     * common operations such as adding, retrieving, checking, removing elements, 
     * and iterating over the entries. The method uses Integer as the key type 
     * and String as the value type.
     */
    public void demonstrateMapUsage() {
        // Create a HashMap with Integer keys and String values
        Map<Integer, String> userMap = new HashMap<>();

        // Add elements to the map using put(K key, V value)
        userMap.put(1, "Luis");
        userMap.put(2, "Pepe");
        userMap.put(3, "Rodolfo");

        // Retrieve a value using a key with get(Object key)
        String user1 = userMap.get(1);
        logger.info("User with ID 1: {}", user1);

        // Check if a key exists using containsKey(Object key)
        if (userMap.containsKey(2)) {
            logger.info("User with ID 2 is in the map.");
        }

        // Remove an entry with remove(Object key)
        userMap.remove(3);

        // Get the size of the map with size()
        logger.info("Size of the map: {}",userMap.size());

        // Iterate over the map using entrySet()
        for (Map.Entry<Integer, String> entry : userMap.entrySet()) {
            logger.info("User with ID {} is {} .",entry.getKey(),entry.getValue());
        }

        // Get all keys with keySet()
        logger.info("Keys: {}", userMap.keySet());

        // Get all values with values()
        logger.info("Values: {}", userMap.values());
    }
}
