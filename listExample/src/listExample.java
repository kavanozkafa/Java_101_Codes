//List is an ordered collection of values. Lists are part of the Java Collections Framework
//Lists implement the java.util.List interface which extends java.util.Collection


import java.util.*;
import java.util.stream.Collectors;

public class listExample {
    public static void main(String [] args){


        List<Integer> myList = new List<Integer>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Integer> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] ts) {
                return null;
            }

            @Override
            public boolean add(Integer integer) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> collection) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Integer> collection) {
                return false;
            }

            @Override
            public boolean addAll(int i, Collection<? extends Integer> collection) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> collection) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> collection) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Integer get(int i) {
                return null;
            }

            @Override
            public Integer set(int i, Integer integer) {
                return null;
            }

            @Override
            public void add(int i, Integer integer) {

            }

            @Override
            public Integer remove(int i) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Integer> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Integer> listIterator(int i) {
                return null;
            }

            @Override
            public List<Integer> subList(int i, int i1) {
                return null;
            }
        };




        //-------------------------------------------
        //convert a list of integers to a list of strings
        List<Integer> nums = Arrays.asList(1,2,3);
        List<String> numbers = nums.stream()
                .map(Object::toString)
                .collect(Collectors.toList());





        //ArrayList
        //This is a dynamic array . It extends AbstractList class and implements List interface.
        //ArrayList class is non-synchronized .Manipulation is slow.
        //be careful when handling concurrency with ArrayList.

        List<Integer> myArrayList = new ArrayList<>();
        myArrayList.add(2);
        Integer [] numbers2 = new Integer[2];
        numbers2[0]=45;
        myArrayList.add(numbers2[0]);
        myArrayList.remove(1);
        System.out.println(myArrayList);









    }
}
