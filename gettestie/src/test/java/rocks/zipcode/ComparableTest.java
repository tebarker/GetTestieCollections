package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class ComparableTest {
    @Test
    public void TestComparable() {
        List<String> familyLog = new ArrayList<>();
        //GIVEN

        //WHEN

        familyLog.add("Gene");
        familyLog.add("Amanda");
        familyLog.add("Tome");
        familyLog.add("Rachel");
        familyLog.add("Colton");
        familyLog.add("Adrian");

        //THEN
        Collections.sort(familyLog);
        Assert.assertEquals("Adrian", familyLog.get(0));
        Assert.assertEquals("Amanda", familyLog.get(1));
        Assert.assertEquals("Colton", familyLog.get(2));
        Assert.assertEquals("Gene", familyLog.get(3));
        Assert.assertEquals("Rachel", familyLog.get(4));
        Assert.assertEquals("Tome", familyLog.get(5));

    }
}
