/** 
 * Course:      Data Structures and Algorithms for Computational Linguistics I WS23/24
 * Assignment:  lab 07
 * Author:      Yifei Chen
 * Description: Dynamic array for strings.
 *
 * Honour Code:  I pledge that this program represents my own work.
 *  I received help from no one in designing and debugging my program.
 */


public class StringList {

    private static final int INITIAL_SIZE = 3;    // initial size if none is given in constructor
    private int numElements;                      // number of elements currently in list
    protected static String[] list;        // array instance variable
    
    /**
     * Set default constructor to initialize an empty StringList with an initial capacity.
     */
    public StringList(){
        numElements = 0;
        list = new String[INITIAL_SIZE];
    }
    
    /**
     * An empty StringList initialised by constructor with a specified initial capacity.
     * 
     * @param initialSize The initial capacity of the StringList.
     */
    public StringList(int initialSize){
        numElements = 0;
        list = new String[initialSize];
    }
    
    /**
     * Add a new string to the end of the StringList. 
     * If array is full, resized to store more elements.
     *
     * @param item The string to be added to the StringList.
     */
    public void add(String item){
        // transfer list to a larger array when full
        if (numElements == list.length){
            String[] tmp = new String[numElements + INITIAL_SIZE];
            for (int i = 0; i < numElements; i++){
                tmp[i] = list[i];
            }
            list = tmp;
        }
        
        // add item
        list[numElements] = item;
        numElements++;
    }
    
    /**
     * Check if the StringList contains a specific string.
     *
     * @param item The string to be checked.
     * @return True if the string is found, false otherwise.
     */
    public boolean contains(String item){
        boolean found = false;
        for (int i = 0; (i < numElements) && !found; i++){
            if (list[i].equalsIgnoreCase(item)){
                found = true;
            }           
        }
        return found;
    }

    /**
     * Retrieves the string at the specified index in the StringList.
     *
     * @param index The index of the string.
     * @return The string at the specified index, or null if index out of bounds.
     */
    public String get(int index){
        String result = null;
        if ((index >= 0) && (index < numElements)){
            result = list[index];
        }

        return result;
    }
    
    /**
     * Inserts a string at the specified index in the StringList.
     *
     * @param index The index at which to insert the string.
     * @param item  The string to be inserted.
     * @throws IndexOutOfBoundsException if the index is out of bounds.
     */
    public void insertAt(int index, String item){
        // Insert String item at position index.
        if (index < 0 || index > numElements){
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        // transfer list to a larger array when full
        if (numElements == list.length){
            String[] tmp = new String[numElements + INITIAL_SIZE];
            for(int i = 0; i < numElements; i++){
                tmp[i] = list[i];
            }
            list = tmp;
        }
        // shift elements to make space for new item
        for (int i = numElements; i > index; i--){
            list[i] = list[i - 1];
        }
        // inset the new item
        list[index] = item;
        numElements++;
    }

    /**
     * Removes the first occurrence of a specific string from the StringList.
     *
     * @param item The string to be removed.
     * @return True if the string was successfully removed, false otherwise.
     */
    public boolean remove(String item){
        // Remove String item from the list. 
        // Returns true when item was successfully removed and false otherwise.
        int index = -1;
        for (int i = 0; i < numElements; i++){
            if (list[i].equalsIgnoreCase(item)){
                index = 1;
                break;
            }
        }
        if (index != -1){
            // shift elements to fill the gap left by the removed item
            for (int i = index; i < numElements - 1; i++){
                list[i] = list[i + 1];
            }
            // set the last element to null and decrement the count
            list[numElements - 1] = null;
            numElements--;
            return true;
        }
        return false;
    }

    /**
     * Returns the content of the StringList as an array of Strings.
     * (Copy every non-null element in list into an array)
     *
     * @return An array containing the strings in the StringList.
     */
    public String[] toArray(){
        // Returns the content as an array of Strings. 
        // (Copy every non-null element in list into an array)
        String[] result = new String[numElements];
        for (int i = 0; i < numElements; i++) {
            result[i] = list[i];
        }
        return result;
    }
}
