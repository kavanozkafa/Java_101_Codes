/* Maps
A map cannot contain duplicate keys;and each key can map to at most one value
Map is an interface so you need to instantiate a concrete implementation of that interface in order to use it.
some implementations; java.util.HashMap,java.util.TreeMap


 */


import java.lang.reflect.Array;
import java.util.*;

public class mapExample {

    public static void main(String [] args){


        //some iterating implementations//

        //1. Implementation using Iterator with Map.Entry

        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        Iterator<Map.Entry<Integer,Integer>> it = map.entrySet().iterator();
        int sum = 0;
        while(it.hasNext()){
            Map.Entry<Integer,Integer> pair = it.next();
            sum = pair.getKey() + pair.getValue();
        }




        //2. Implementation using for with Map.Entry
        for (Map.Entry<Integer,Integer> pair :map.entrySet()){
            sum +=pair.getKey() + pair.getValue();
        }


        //3. implementation using Map.forEach
        Integer[] summary = new Integer[7];
        map.forEach((k,v) -> summary[0] +=k +v);




        //----------------------------------------


        //Usage of HashMap
        //HashMap is an implementation of the Map interface that provides a Data Structure to store data in Key-Value pairs.
        Map<String,Integer> mapHash = new HashMap<String, Integer>();

        //add values
        mapHash.put("aksaray",68);
        mapHash.put("eskisehir",26);
        mapHash.put("ankara",6);
        System.out.println(mapHash.put("aksaray",88)); // aksaray --> 68
        mapHash.put("aksaray",88); //will override its value and return old value.
        System.out.println(mapHash.put("aksaray",86)); // aksaray --> 88


        //adding key and values with inner classes.but this is not efficient and can lead
        //to memory leaks so use with static
        Map<String,Integer> mapHash2 = new HashMap<>(){{


            put("aksaray",68);
            put("eskisehir",26);
            put("ankara",6);


        }};


        //get values
        mapHash.get("aksaray");

        //check the key
        mapHash.containsKey("aksaray"); //true

        //Default methods
        mapHash.get("amasya");//null
        mapHash.getOrDefault("amasya",99); //returns 99 .



        //forEach
        mapHash.forEach((key,value) -> System.out.println("Key:" + key+"::Value"+value));


        //replace all
        mapHash.replaceAll((key,value)->value+10); //eskisehir ->36 etc

        //put value if there is none
        mapHash.putIfAbsent("konya",42);

        //remove
        mapHash.remove("konya",45); //false
        mapHash.remove("konya",42); //true



        //replace the value
        mapHash.replace("konya",44);

        //generate value if condition not exists
        mapHash.computeIfAbsent("antalya",k->mapHash.get("ankara")+1); //antalya -> 7
        mapHash.computeIfAbsent("konya",k->mapHash.get("ankara")+1); //konya -> 44 not 45. because konya exists in the map


        //generate value if condition exists
        mapHash.computeIfPresent("konya",(k,v)->v-2);//konya->42

        //just compute
        mapHash.compute("aksaray",(k,v)->v-20); //aksaray->68


        //merge
        //adds the key-value pair to the map ,if key is not present or value for the key is null
        mapHash.merge("bursa",16,(k,v)->mapHash.get("ankara")+10);



        //Iterating

        //keys
        for (String key:mapHash.keySet()){
            System.out.println(key);
        }

        //values
        for (Integer value:mapHash.values()){
            System.out.println(value);
        }

        //together
        for (Map.Entry<String,Integer> entry : mapHash.entrySet()){
            System.out.println("Key :" +entry.getKey() + "\tValue:"+ entry.getValue());
        }




        //------------------------------------------------------//

        //LinkedHashMap
        //it is same as hashmap instead maintains insertion order.
        //methods-> clear(),containsKey(),get(),removeEldestEntry()

        LinkedHashMap<String,String> hashmaplinked = new LinkedHashMap<>();

        hashmaplinked.put("TR","Turkey");
        hashmaplinked.put("FR","France");
        hashmaplinked.put("EN","England");
        System.out.println(hashmaplinked.entrySet());



        //------------------------------------------------------//
        //TreeMap is just like TreeSet.mutable,ordered

        TreeMap<Integer,String> mapTree = new TreeMap<>();
        mapTree.put(1,"Ronaldo");
        mapTree.put(2,"Messi");
        System.out.println(mapTree.entrySet());

        //methods
        System.out.println(mapTree.size());
        System.out.println(mapTree.get(1));
        System.out.println(mapTree.lastEntry());
        System.out.println(mapTree.firstEntry());






    }
}
