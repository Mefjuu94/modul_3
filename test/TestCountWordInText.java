import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class TestCountWordInText {

    CountWordsInText countWordsInText = new CountWordsInText();
    String testString = "test text is a test text, nothing can Happen. This should pass.";

    @Test
    public void testCountWorldInText() {

        HashMap<String, Integer> testMap = new HashMap<>();
        testMap.put("a", 1);
        testMap.put("can", 1);
        testMap.put("happen", 1);
        testMap.put("test", 2);
        testMap.put("pass", 1);
        testMap.put("nothing", 1);
        testMap.put("this", 1);
        testMap.put("should", 1);
        testMap.put("is", 1);
        testMap.put("text", 2);

        Assertions.assertEquals(testMap, countWordsInText.countWords(testString));
    }

    @Test
    public void testCountWorldInTextWrong() {

        HashMap<String, Integer> testMap = new HashMap<>();
        testMap.put("a", 1);
        testMap.put("can", 1);
        testMap.put("happen", 1);
        testMap.put("test", 2);
        testMap.put("pass", 1);
        testMap.put("nothing", 2);
        testMap.put("this", 1);
        testMap.put("should", 1);
        testMap.put("is", 3);
        testMap.put("text", 2);

        Assertions.assertNotEquals(testMap, countWordsInText.countWords(testString));
    }
}
