import static org.junit.Assert.*;

import org.junit.Test;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class ArrayUtilsTest {

    /**
     * Test reverseArray() 
     */
    @Test
    public void testReverseArray() {
        String[] array1 = {"AA", "BB", "CC", "DD", "EE"};
        String[] expected = {"EE", "DD", "CC", "BB", "AA"};
        Object[] res = ArrayUtils.reverseArray(array1);
        assertTrue(expected.length == res.length);
        
        for (int i = 0; i < res.length; i++) {
            assertEquals(res[i],expected[i]);
        }
    }

    @Test
    public void testConcatArrays() {
        String[] array1 = {"AA", "BB", "CC"};
        String[] array2 = {"DD", "EE", "FF"};
        String[] expected = {"AA", "BB", "CC", "DD", "EE", "FF"};
        Object[] res = ArrayUtils.concatArrays(array1, array2);
        assertTrue(expected.length == res.length);
        
        for (int i = 0; i < res.length; i++) {
            assertEquals(res[i], expected[i]);
        }
    }

    @Test
    public void testSearchArrayForAnObject() {
        String[] anArray = {"AA", "BB", "CC", "DD", "EE"};
        String objectToSearch = "CC";
        int expectedIndex = 2;
        int resultIndex = ArrayUtils.searchArrayForAnObject(anArray, objectToSearch);
        
        assertEquals(expectedIndex, resultIndex);
    }
}
