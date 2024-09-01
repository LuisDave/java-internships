package com.exercise.test.practice.logic;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.exercise.test.util.NumberUtil;

public class EqualityVsIdentity {

    private static final Logger logger = LogManager.getLogger(EqualityVsIdentity.class);

    /**
     * Demonstrates the equality and identity comparison with Strings.
     * 
     * This method compares two different String objects with the same content using
     * the equals() method and the == operator. It shows that while equals() returns
     * true for equal content, == returns false for different objects. It also
     * demonstrates that == returns true when both references point to the same object.
     */
    public void checkStringEqualityAndIdentity() {
        String str1 = new String("hello");
        String str2 = new String("hello");

        logger.info("String Equality (equals): {}", str1.equals(str2)); // true
        logger.info("String Identity (==): {}", str1 == str2); // false

        String str3 = str1;
        logger.info("String Identity (==): {}", str1 == str3); // true
    }

    /**
     * Demonstrates the equality and identity comparison with Integer objects.
     * 
     * This method compares Integer objects using both equals() and the ==
     * operator. It highlights the behavior of Integer objects within and outside the
     * range of -128 to 127, where Integer caching affects the identity comparison.
     */
    public void checkIntegerEqualityAndIdentity() {
        Integer num1 = 100;
        Integer num2 = 100;

        logger.info("Integer Equality (equals): {}", num1.equals(num2)); // true
        logger.info("Integer Identity (==): {}", num1 == num2); // true (within -128 to 127 range)

        Integer num3 = 200;
        Integer num4 = 200;

        logger.info("Integer Equality (equals): {}", num3.equals(num4)); // true
        logger.info("Integer Identity (==): {}", num3 == num4); // false (outside -128 to 127 range)
    }

    /**
     * Demonstrates the equality and identity comparison with primitive int values.
     * 
     * This method compares primitive int values using a custom equals method and
     * the == operator. It shows that both methods return true when the values are
     * equal, as primitive types are compared by value.
     */
    public void checkPrimitiveIntEqualityAndIdentity() {
        int prim1 = 100;
        int prim2 = 100;

        logger.info("Primitive int Equality (equals): {}", NumberUtil.equals(prim1, prim2)); // true
        logger.info("Primitive int Equality/Identity (==): {}", prim1 == prim2); // true

        int prim3 = 200;
        int prim4 = 200;

        logger.info("Primitive int Equality (equals): {}", NumberUtil.equals(prim3, prim4)); // true
        logger.info("Primitive int Equality/Identity (==): {}", prim3 == prim4); // true
    }
}
