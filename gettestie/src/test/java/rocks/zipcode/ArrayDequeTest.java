package rocks.zipcode;

//import gettestie.src.main.java.rocks.zipcode.Person;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeTest {

    @Test
    public void arrayDequeAddTest() {
        Deque<Person> familyLog = new ArrayDeque<>();

        //GIVEN
        Person Gene = new Person("Gene", 1962);
        Person Amanda = new Person("Amanda", 1965);
        Person Tome = new Person("Tom", 1992);
        Person Rachel = new Person("Rachel", 1999);
        Person Colton = new Person("Colton", 1995);
        Person Adrian = new Person("Adrian", 2001);
        Person Gariel = new Person("Gariel", 1932);

        //WHEN
        familyLog.addFirst(Gariel);
        familyLog.addLast(Tome);
        familyLog.add(Rachel);
        int expectedSize = 3;
        int actualSize = familyLog.size();

        //THEN
        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void arrayDequeGetTest() {
        Deque<Person> familyLog = new ArrayDeque<>();

        //GIVEN
        Person Adrian = new Person("Adrian", 2001);
        Person Colton = new Person("Colton", 1995);

        //WHEN
        familyLog.addFirst(Adrian);
        familyLog.addLast(Colton);
        Person expectedFirst = Adrian;
        Person expectedLast = Colton;
        Person actualLast = familyLog.getLast();
        Person actualFirst = familyLog.getFirst();

        //THEN
        Assert.assertEquals(expectedFirst, actualFirst);
        Assert.assertEquals(expectedLast, actualLast);


    }

    @Test
    public void arrayDequePeekTest() {

        //GIVEN
        Person Gene = new Person("Gene", 1962);
        Person Amanda = new Person("Amanda", 1965);
        Person Tome = new Person("Tom", 1992);
        Person Rachel = new Person("Rachel", 1999);
        Person Colton = new Person("Colton", 1995);
        Person Adrian = new Person("Adrian", 2001);
        Person Gariel = new Person("Gariel", 1932);

        //WHEN
        Deque<Person> familyLog = new ArrayDeque<>();
        familyLog.add(Gene);
        familyLog.add(Amanda);
        familyLog.add(Tome);
        familyLog.add(Rachel);
        familyLog.add(Colton);
        familyLog.add(Adrian);
        familyLog.add(Gariel);

        Person expectedFirstElement = Gene;
        Person actualFirstElement = familyLog.peek();

        //THEN
        Assert.assertEquals(expectedFirstElement, actualFirstElement);


    }

    @Test
    public void arrayDequeContainsTest() {

        //GIVEN
        Person Gene = new Person("Gene", 1962);
        Person Amanda = new Person("Amanda", 1965);
        Person Tome = new Person("Tom", 1992);
        Person Rachel = new Person("Rachel", 1999);
        Person Colton = new Person("Colton", 1995);
        Person Adrian = new Person("Adrian", 2001);
        Person Gariel = new Person("Gariel", 1932);

        //WHEN
        Deque<Person> familyLog = new ArrayDeque<>();
        familyLog.add(Gene);
        familyLog.add(Amanda);
        familyLog.add(Tome);
        familyLog.add(Rachel);
        familyLog.add(Colton);
        familyLog.add(Adrian);
        familyLog.add(Gariel);


        Boolean containsElement = familyLog.contains(Adrian);

        //THEN
        Assert.assertTrue(containsElement);

    }

    @Test
    public void arrayDequeClearTest() {

        //GIVEN
        Person Gene = new Person("Gene", 1962);
        Person Amanda = new Person("Amanda", 1965);
        Person Tome = new Person("Tom", 1992);
        Person Rachel = new Person("Rachel", 1999);
        Person Colton = new Person("Colton", 1995);
        Person Adrian = new Person("Adrian", 2001);
        Person Gariel = new Person("Gariel", 1932);

        //WHEN
        Deque<Person> familyLog = new ArrayDeque<>();
        familyLog.add(Gene);
        familyLog.add(Amanda);
        familyLog.add(Tome);
        familyLog.add(Rachel);
        familyLog.add(Colton);
        familyLog.add(Adrian);
        familyLog.add(Gariel);

        familyLog.clear();

        //THEN
        Assert.assertTrue(familyLog.isEmpty());


    }
}
