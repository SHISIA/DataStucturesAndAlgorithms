package List_Interface_In_Java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListClientExample {
    private List list;

    /**ListClientExample constructor**/
    public ListClientExample(){
        list= new ArrayList();
    }

    public List getList() {
        return list;
    }
    public static void main(String[] args) {
        ListClientExample listClientExample=new ListClientExample();
        List list1=listClientExample.getList();
        System.out.println(list1);
    }
}
