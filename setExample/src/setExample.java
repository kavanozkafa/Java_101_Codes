/* A Set is a Collection that cannot duplicate elements.
 * It is basically models the math set abstraction.
 * Set have various classes like HashSet,TreeSet,LinkedHashSet.
 *  Uniqueness is determined by the equals() and hashCode() methods.
 */


import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class setExample {

    public static void main(String [] args){

        // Set<T> set = new HashSet<T>();
        // T can be String, Integer, Object etc.
        Set<String> setString = new HashSet<>();


        TreeSet<Integer> sortedSet = new TreeSet<>();
        //TreeSet stores data in a sorted manner sacrificing some speed for basic operations which take O(log(n))


        LinkedHashSet<Integer> linkedhashset = new LinkedHashSet<>();
        //It is a linked list implementation of HashSet. Once can iterate over the items in the order they were added.




        //lets add some elements to sets
        System.out.println("lets add some elements to sets");
        setString.add("sammas");
        sortedSet.add(35);
        sortedSet.add(33);
        sortedSet.add(35);
        setString.add("samas");
        System.out.println(setString);
        System.out.println(sortedSet);


        //Delete all the elements of a Set
        System.out.println("Delete all the elements of a Set");
        setString.clear();
        sortedSet.clear();
        System.out.println(setString);
        System.out.println(sortedSet);



        //Check whether an element in the set or not.
        sortedSet.add(35);
        if (sortedSet.contains(35))
        {
            System.out.println("contains() method returns true if set contains the element.");

        }

        //some set methods
        System.out.println(sortedSet.isEmpty());
        System.out.println(sortedSet.size());




        //create a list from an existing Set
        List<Integer> listInt = new ArrayList<>(2);
        listInt.addAll(sortedSet);
        System.out.println(listInt);


        //same thing with Stream API
        listInt = sortedSet.stream().collect(Collectors.toList());
        System.out.println(listInt);


        //we can eliminates dublicates using set
        listInt.add(34);
        listInt.add(35);
        Set<Integer> noDuplicates = new HashSet<>(listInt);
        System.out.println(noDuplicates); //34,35


        //Declaring a HashSet with initial values

        Set<String> alphabet = new HashSet<>(){
            {
                add("a");
                add("b");
                add("1");

            }};
        System.out.println(alphabet);

        //with one line
        Set<String> alphabet2 = new HashSet<>(Arrays.asList("a","b","2"));
        System.out.println(alphabet2);

        //with streams
        Set<String> alphabet3 = Stream.of("a","b","3").collect(Collectors.toSet());
        System.out.println(alphabet3);






    }


}
