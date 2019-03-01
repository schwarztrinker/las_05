import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {

    @org.junit.jupiter.api.Test
    void executeSQL01() {
        Application tester = new Application(); // tested class
        tester.loadRecords();
        // assert statements
        assertEquals(Long.valueOf(1000000), Long.valueOf(tester.executeSQL01()));
    }

    @org.junit.jupiter.api.Test
    void executeSQL02() {
        Application tester = new Application(); // tested class
        tester.loadRecords();
        // assert statements
        assertEquals(Long.valueOf(20752), Long.valueOf(tester.executeSQL02()));


    }

    @org.junit.jupiter.api.Test
    void executeSQL03() {
        Application tester = new Application(); // tested class
        tester.loadRecords();
        // assert statements
        assertEquals(Long.valueOf(2246), Long.valueOf(tester.executeSQL03()));
    }

    @org.junit.jupiter.api.Test
    void executeSQL04() {
        Application tester = new Application(); // tested class
        tester.loadRecords();
        // assert statements
        assertEquals(Long.valueOf(3013), Long.valueOf(tester.executeSQL04()));
    }

    @org.junit.jupiter.api.Test
    void executeSQL05() {
        Application tester = new Application(); // tested class
        tester.loadRecords();
        // assert statements
        assertEquals(Long.valueOf(65719), Long.valueOf(tester.executeSQL05()));
    }

    @org.junit.jupiter.api.Test
    void executeSQL06() {
        Application tester = new Application(); // tested class
        tester.loadRecords();
        // assert statements
        assertEquals(Long.valueOf(5), Long.valueOf(tester.executeSQL06()));
    }

    @org.junit.jupiter.api.Test
    void executeSQL07() {
        Application tester = new Application(); // tested class
        tester.loadRecords();
        // assert statements
        List<Long> expectedValues = new ArrayList<>();
        expectedValues.add(8L);
        expectedValues.add(9L);
        expectedValues.add(8L);
        assertEquals(expectedValues, tester.executeSQL07());
    }

    @org.junit.jupiter.api.Test
    void executeSQL08() {
        Application tester = new Application(); // tested class
        tester.loadRecords();
        // assert statements
        List<Long> expectedValues = new ArrayList<>();
        expectedValues.add(12L);
        expectedValues.add(12L);
        expectedValues.add(9L);
        expectedValues.add(9L);
        expectedValues.add(8L);
        expectedValues.add(5L);
        expectedValues.add(5L);
        expectedValues.add(3L);
        expectedValues.add(3L);

        assertEquals(expectedValues, tester.executeSQL08());
    }

    @org.junit.jupiter.api.Test
    void executeSQL09() {
        Application tester = new Application(); // tested class
        tester.loadRecords();
        // assert statements
        Map<String, Long> expectedValues = new HashMap<>();
        expectedValues.put("mon", 142951L);
        expectedValues.put("tue", 142639L);
        expectedValues.put("sun", 143036L);
        expectedValues.put("wed", 143300L);
        expectedValues.put("sat", 142677L);
        expectedValues.put("fri", 142658L);
        expectedValues.put("thu", 142739L);

        assertEquals(expectedValues, tester.executeSQL09());
    }

    @org.junit.jupiter.api.Test
    void executeSQL10() {
        Application tester = new Application(); // tested class
        tester.loadRecords();
        // assert statements
        Map<String, Long> expectedValues = new HashMap<>();
        expectedValues.put("h", 1546L);
        expectedValues.put("f", 1534L);
        expectedValues.put("a", 1536L);
        expectedValues.put("g", 1550L);
        expectedValues.put("b", 1536L);
        expectedValues.put("d", 1586L);
        expectedValues.put("e", 1547L);
        expectedValues.put("c", 1533L);
        assertEquals(expectedValues, tester.executeSQL10());
    }

    @org.junit.jupiter.api.Test
    void executeSQL11() {
        Application tester = new Application(); // tested class
        tester.loadRecords();
        // assert statements
        Map<String, Long> expectedValues = new HashMap<>();
        expectedValues.put("mon", 2201L);
        expectedValues.put("sat", 2206L);
        expectedValues.put("thu", 2232L);
        expectedValues.put("sun", 2251L);
        expectedValues.put("wed", 2262L);
        expectedValues.put("fri", 2284L);
        expectedValues.put("tue", 2229L);
        assertEquals(expectedValues, tester.executeSQL11());


    }

    @org.junit.jupiter.api.Test
    void executeSQL12() {
        Application tester = new Application(); // tested class
        tester.loadRecords();
        // assert statements
        Map<String, Long> expectedValues = new HashMap<>();
        expectedValues.put("r", 5565L);
        expectedValues.put("m", 5503L);
        expectedValues.put("s", 5546L);
        expectedValues.put("w", 5639L);
        assertEquals(expectedValues, tester.executeSQL12());
    }

    @org.junit.jupiter.api.Test
    void executeSQL13() {
        Application tester = new Application(); // tested class
        tester.loadRecords();
        // assert statements
        Map<Integer, Long> expectedValues = new HashMap<>();
        expectedValues.put(2, 304900L);
        expectedValues.put(6, 312325L);
        expectedValues.put(3, 317270L);
        expectedValues.put(10, 319520L);
        expectedValues.put(11, 297555L);
        expectedValues.put(12, 299935L);
        expectedValues.put(9, 301245L);
        expectedValues.put(4, 318455L);
        expectedValues.put(8, 312695L);
        expectedValues.put(7, 290420L);
        expectedValues.put(5, 309630L);
        expectedValues.put(1, 313465L);
        assertEquals(expectedValues, tester.executeSQL13());
    }

    @org.junit.jupiter.api.Test
    void executeSQL14() {
        Application tester = new Application(); // tested class
        tester.loadRecords();
        // assert statements
        Map<Integer, Integer> expectedValues = new HashMap<>();
        expectedValues.put(4, 5);
        expectedValues.put(1, 5);

        assertEquals(expectedValues, tester.executeSQL14());
    }
}