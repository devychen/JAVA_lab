public class ArrayUtils {
    /**
     * Returns a new array with the reversed members of anArray.
     *
     * @param anArray The array to reverse.
     * @return An array with the reversed members of anArray.
     */
    public static Object[] reverseArray(Object[] anArray) {
        if (anArray == null) {
            throw new IllegalArgumentException("Input array must not be null");
        }

        Object[] reversedArray = new Object[anArray.length];
        for (int i = 0; i < anArray.length; i++) {
            reversedArray[i] = anArray[anArray.length - 1 - i];
        }
        return reversedArray; 
    }
    
    /**
     * Returns an array with the concatenation of array1 and array2
     * 
     * @param array1 First array.
     * @param array2 Second array.
     * @return The concatenation of array1 and array2.
     */
    public static Object[] concatArrays(Object[] array1, Object[] array2) {
        if (array1 == null || array2 == null) {
            throw new IllegalArgumentException("Input arrays must not be null");
        }

        Object[] resultArray = new Object[array1.length + array2.length];
        System.arraycopy(array1, 0, resultArray, 0, array1.length);
        System.arraycopy(array2, 0, resultArray, array1.length, array2.length);
        return resultArray;
    }

    /**
     * Returns the index of the (first) occurence of object aObject in array anArray or -1 when aObject is not contained in anArray
     * @param anArray The array to search.
     * @param aObject The object to search for.
     * @return Index in anArray or -1 when not found.
     */
    public static int searchArrayForAnObject(Object[] anArray, Object aObject) {
        if (anArray == null) {
            throw new IllegalArgumentException("Input array must not be null");
        }

        for (int i = 0; i < anArray.length; i++) {
            if (aObject.equals(anArray[i])) {
                return i; // Return the index if the object is found
            }
        }
        return -1;
    }
}

