import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;

class VowelChecker implements StringChecker {
  public boolean checkString(String s) {
    ArrayList<String> storing = new ArrayList<>();
    storing.add("a");
    storing.add("A");
    storing.add("e");
    storing.add("E");
    storing.add("i");
    storing.add("I");
    storing.add("o");
    storing.add("O");
    storing.add("u");
    storing.add("U");
    if(storing.contains(s)) {
      return true;
    }
    else {
      return false;
    }
  }
}
  public class TestListExamples {
  // Write your grading tests here!
    @Test
    public void testFilter() {
        ArrayList<String> testing = new ArrayList<>();
        testing.add("a");
        testing.add("b");
        testing.add("c");
        VowelChecker sc = new VowelChecker();
        List<String> result = ListExamples.filter(testing, sc);
        List<String> expected = new ArrayList<>();
        assertEquals(expected, result);
  }

    @Test
    public void testFilterEmpty() {
        List<String> input = new ArrayList<>();
        StringChecker sc= new MyChecker();
        assertEquals(input, ListExamples.filter(input, sc));
  }

    @Test
    public void testMerge() {
        List<String> arr1 = new ArrayList<>();
        List<String> arr2 = new ArrayList<>();

        arr1.add("a");
        arr1.add("c");
        arr2.add("b");
        arr2.add("d");

        List<String> expected = Arrays.asList("a", "b", "c", "d");

        assertEquals(expected, ListExamples.merge(arr1, arr2));
  }

    @Test
    public void testMergeOneEmpty() {
        List<String> arr1 = new ArrayList<>();
        List<String> arr2 = new ArrayList<>();

        arr1.add("a");
        arr1.add("c");

        assertEquals(arr1, ListExamples.merge(arr1, arr2));


  }
}