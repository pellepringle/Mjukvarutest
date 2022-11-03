package Uppgift;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class CounterTest {

    @Test
    public void lineCounterTest() {
        Counter count = new Counter();
        int actual = count.lineCount;
        int expected = 0;
        assertEquals(expected, actual);

    }

    @Test
    public void charCounterTest() {
        //Arrange
        Counter count = new Counter();
        int actual = count.charCount;
        int expected = 0;
        assertEquals(expected, actual);

    }

    @Test
    public void StopTest() {
        //Arrange
        Counter count = new Counter();
        //Act
        boolean actual = false;
        boolean expected = count.getStop();
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnStop() {
        //Arrange
        Counter count = new Counter();
        //Act
        count.checkStop("stop");
        //Assert
        assertEquals(true, count.getStop());
    }

    @Test
    public void charcountTest() {
        //Arrange
        Counter count = new Counter();
        //Act
        count.characterCount("hejsan jag heter pelle");
        //Assert
        assertEquals(19, count.getCharCount());
    }

    @Test
    public void lineCountTest() {
        //Arrange
        Counter count = new Counter();
        //Act
        count.characterCount("hejs");
        count.characterCount("hallå");
        count.characterCount("hallå");
        count.characterCount("hallå");
        count.characterCount("hallå");
        int expected = 5;
        int actual = count.getLineCount();
        //Assert
        assertEquals(expected, actual);
    }

}