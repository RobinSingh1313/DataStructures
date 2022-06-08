package Hashings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class destination {
    public  static String destCity(List<List<String>> paths) {
        Map<String,String> hmap = new HashMap<>();
        int i=0;
        while(i<paths.size()){
            List<String> currentList = paths.get(i);
            hmap.put(currentList.get(0),currentList.get(1));
            i++;
        }
        String destination = paths.get(0).get(1);
        while(hmap.containsKey(destination)){
            destination = hmap.get(destination);
        }
        return destination;

    }

    public static void main(String[] args) {

        List<List<String>> lists=new ArrayList<>();

            List<String> list=new ArrayList<>();
         list.add("London");
         list.add("New York");
         lists.add(list);
        List<String> lst=new ArrayList<>();

            lst.add("New York");
            lst.add("Lima");
            lists.add(lst);
        List<String> lt=new ArrayList<>();

        lt.add("Lima");
            lt.add("Sao Paulo");
            lists.add(lt);

String ans=destCity(lists);
        System.out.println(ans);





    }
}
