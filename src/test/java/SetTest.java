import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.HashSet;

public class SetTest {

    private Collections list1;
    private Collections list2;
    private Collections list3;



    @Before
    public void setUp() throws Exception {
        list1 = new Collections();
        list2 = new Collections();
        list3 = new Collections();
    }



    @Test
    public void testSet(){
        list1.addSetData("set 1");
        list1.addSetData("set 2");
        list1.addSetData("set 3");

        list2.addSetData("set 1");
        list2.addSetData("set 2");
        list2.addSetData("set 3");


        HashSet expected = list1.getSet();
        HashSet actual = list2.getSet();


        //test equals
        Assert.assertEquals(expected, actual);
    }



    @Test
    public void testSetDuplicates(){

        HashSet mySet = list3.getSet();


        Assert.assertTrue(mySet.add("text"));

        //SETS do not allow duplicates...should return false
        Assert.assertFalse(mySet.add("text"));


        System.out.println(mySet.toString());
    }
}



