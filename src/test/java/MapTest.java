import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

public class MapTest {

    private Collections list1;
    private Collections list2;
    private Collections list3;
    private Collections list4;

    @Before
    public void setUp() throws Exception {
        list1 = new Collections();
        list2 = new Collections();
        list3 = new Collections();
        list4 = new Collections();
    }



    @Test
    public void testMap(){

        list1.addMapData(1, "num1");
        list1.addMapData(2, "num2");
        list1.addMapData(3, "num2");

        list2.addMapData(1, "num1");
        list2.addMapData(2, "num2");
        list2.addMapData(3, "num2");


        HashMap expected = list1.getMap();
        HashMap actual = list2.getMap();

        //test equals
        Assert.assertEquals(expected, actual);
    }



    @Test
    public void testMapDuplicates(){

        list3.addMapData(1,"num1");
        list3.addMapData(1,"num1");
        list3.addMapData(2,"num1");

        list4.addMapData(1,"num1");
        list4.addMapData(2,"num1");



        HashMap expected = list3.getMap();
        HashMap actual = list4.getMap();


        //MAPS allow values to be the same but the key have to be unique
        //test equal
        Assert.assertEquals(expected, actual);



    }
}