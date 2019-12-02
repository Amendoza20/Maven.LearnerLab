package io.zipcoder.interfaces;
import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    @Test
    public void nullConstructTest(){
        Person person = new Person();

        Long expected = Long.MIN_VALUE;
        String expectedName = "";

        Assert.assertEquals(expected,person.getId());
        Assert.assertEquals(expectedName, person.getName());

    }
    @Test
    public void constructorTest(){
        Long expected = 101010L;
        String expectedName = "Blue";
        Person person = new Person(expected,expectedName);

        Long actual = person.getId();
        String actualName = person.getName();

        Assert.assertEquals(expected,actual);
        Assert.assertEquals(expectedName,actualName);

    }
    @Test
    public void setNameTest(){
        Person person = new Person();
        String setName = "Moon";

        person.setName(setName);
        String actual = person.getName();

        Assert.assertEquals(setName, actual);
    }

}
