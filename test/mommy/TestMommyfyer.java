package mommy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by droman on 6/29/16.
 */
public class TestMommyfyer {

    private Mommyfyer mommy;

    @Before
    public void setUp(){
        mommy = new Mommyfyer();
    }

    @Test
    public void shouldTReturnEmptyStringWheNInputEmptyString(){

        String expectedResult = "";

        String actualResult = mommy.getMommyfyed("");

        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void shouldReturnYWhenInputY(){

        String expectedResult = "y";
        String actualResult = mommy.getMommyfyed("y");
        assertEquals(expectedResult, actualResult);
    }


    @Test
    public void shouldReturnMommyWhenInputSingleVowel(){
        String expectedResult = "mommy";

        assertEquals(expectedResult, mommy.getMommyfyed("a"));
        assertEquals(expectedResult, mommy.getMommyfyed("e"));
        assertEquals(expectedResult, mommy.getMommyfyed("i"));
        assertEquals(expectedResult, mommy.getMommyfyed("o"));
        assertEquals(expectedResult, mommy.getMommyfyed("u"));

    }

    @Test
    public void shouldReturnMommyWhenInputConsecutiveVowels(){
        String expectedResult = "mommy";


        assertEquals(expectedResult, mommy.getMommyfyed("aa"));
        assertEquals(expectedResult, mommy.getMommyfyed("eu"));
        assertEquals(expectedResult, mommy.getMommyfyed("aeiou"));
    }

    @Test
    public void shouldReturnHmommysWhenInputHis(){
        String expectedResult = "hmommys";


        assertEquals(expectedResult, mommy.getMommyfyed("his"));

    }

}
