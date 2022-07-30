package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;

public class HashMapTest {
    @Test
    public void HashMapPutTest() {
        HashMap<Integer, String> familyLog = new HashMap<>();

        //GIVEN
        Person Gene = new Person("Gene", 1962);
        Person Amanda = new Person("Amanda", 1965);
        Person Tome = new Person("Tom", 1992);
        Person Rachel = new Person("Rachel", 1999);
        Person Colton = new Person("Colton", 1995);
        Person Adrian = new Person("Adrian", 2001);
        Person Gariel = new Person("Gariel", 1932);

        //WHEN
        familyLog.put(1, "Gariel");
        familyLog.put(2, "Colton");
        familyLog.put(3, "Rachel");
        int expectedSize = 3;
        int actualSize = familyLog.size();


        //THEN
        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void HashMapClearTest() {
        HashMap<Integer, String> familyLog = new HashMap<>();

        //GIVEN
        Person Gene = new Person("Gene", 1962);
        Person Amanda = new Person("Amanda", 1965);
        Person Tome = new Person("Tom", 1992);
        Person Rachel = new Person("Rachel", 1999);
        Person Colton = new Person("Colton", 1995);
        Person Adrian = new Person("Adrian", 2001);
        Person Gariel = new Person("Gariel", 1932);

        //WHEN
        familyLog.put(1, "Gariel");
        familyLog.put(2, "Colton");
        familyLog.put(3, "Rachel");
        familyLog.clear();
        int expectedSize = 0;
        int actualSize = familyLog.size();


        //THEN
        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void HashMapIsEmptyTest() {
        HashMap<Integer, String> familyLog = new HashMap<>();

        //GIVEN
        familyLog.put(1, "Gariel");
        familyLog.put(2, "Colton");
        familyLog.put(3, "Rachel");

        //WHEN
        familyLog.clear();

        //THEN
        Assert.assertTrue(familyLog.isEmpty());
    }

    @Test
    public void HashMapGetTest() {
        HashMap<Integer, String> familyLog = new HashMap<>();

        //GIVEN
        familyLog.put(1, "Gariel");
        familyLog.put(2, "Colton");
        familyLog.put(3, "Rachel");
        String expected = "Gariel";

        //WHEN
        String actual = familyLog.get(1);


        //THEN
        Assert.assertEquals(expected, actual);
    }



}
