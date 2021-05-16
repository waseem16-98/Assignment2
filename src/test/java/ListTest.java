import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class ListTest {

    public Collections list1;
    public Collections list2;
    public Collections list3;


    @org.junit.Before
    public void setUp() throws Exception {
        list1 = new Collections();
        list2 = new Collections();
        list3 = new Collections();
    }



    @Test
    public void testList(){

        list1.addListData("john");
        list1.addListData("sam");

        list2.addListData("john");
        list2.addListData("sam");


        ArrayList actual = list1.getList();
        ArrayList expected = list2.getList();


        //Test Equals
        Assert.assertEquals(expected, actual);
        Assert.assertArrayEquals(expected.toArray(), actual.toArray());


    }



    @Test
    public void testListDuplicates(){

        ArrayList myList = list3.getList();

        Assert.assertTrue(myList.add("text"));

        //LISTS allow duplicates
        Assert.assertTrue(myList.add("text"));

        System.out.println(myList.toString());

    }

}
