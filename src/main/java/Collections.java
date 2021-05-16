import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;


public class Collections {
    private ArrayList<String> listData;
    private HashSet<String> setData;
    private HashMap<Integer, String> mapData;



    public Collections() {
        listData = new ArrayList<String>();
        setData = new HashSet<String>();
        mapData = new HashMap<Integer, String>();
    }




    public void addListData(String in) {
        listData.add(in);
    }

    public void addSetData(String in) {
        setData.add(in);
    }

    public void addMapData(Integer num, String val) {
        mapData.put(num ,val);
    }




    public ArrayList getList() {
        return listData;
    }

    public HashSet getSet() {
        return setData;
    }

    public HashMap getMap() {
        return mapData;
    }

}