package com.morez.dp.chainofresponsibility.medium;

import org.junit.Test;

import java.util.*;
import java.util.function.Function;

public class BillTest {

    @Test
    public void shouldPassValues() {

        Discount discount = new Discount();
        GoldenDiscountHandler goldenDiscount = new GoldenDiscountHandler();
        AweOffersDiscountHandler aweDiscount = new AweOffersDiscountHandler();

        discount.setSuccessor(goldenDiscount);
        goldenDiscount.setSuccessor(aweDiscount);

        Bill bill = new Bill(1, 100);
        System.out.println("Your discount value is Rs:"+ discount.applyDiscount(bill));
        System.out.println("Happy Shopping! Your Total Amount is: Rs:" +(100 - (discount.applyDiscount(bill))));

        Bill bill2 = new Bill(2, 1000);
        System.out.println("Your discount value is Rs:"+ discount.applyDiscount(bill2));
        System.out.println("Happy Shopping! Your Total Amount is: Rs:" +(1000 - (discount.applyDiscount(bill2))));
    }

    @Test
    public void test() {
//        List<String> fruits = Arrays.asList("Apple", "Banana", "Apple", "Dragon", "Apple");
//        System.out.println(fruits.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
//        int dataSize = 1024 * 1024;
//        Runtime r = Runtime.getRuntime();
//        System.out.println(r.freeMemory()/dataSize + " MB");
//        System.out.println(r.totalMemory()/dataSize + " MB");
//        System.out.println(r.maxMemory()/dataSize + " MB");
//        System.out.println(r.availableProcessors());
//
//        String[] mem = new String[10000];
//        for (int i = 0; i < 10000; i++) {
//            mem[i] = new String("Hello " + i);
//        }
//
//        System.out.println(r.freeMemory()/dataSize + " MB");
//        System.out.println(r.totalMemory()/dataSize + " MB");
//        System.out.println(r.maxMemory()/dataSize + " MB");

        Function<Integer, Integer> s = a -> a * a;
        System.out.println(s.apply(5));

        List<String> a = new ArrayList<>();
        a.add("10");
        a.add("20");
        a.add("30");
        System.out.println(a);

        List<String> ab = new ArrayList<>(Arrays.asList("10", "20", "30"));
        List<String> abc = new ArrayList<>(Arrays.asList("10", new String("20"), "30"));
        System.out.println(a.equals(ab));
        System.out.println(a.equals(abc));

        Set<Integer> st = new HashSet<>();
        st.add(50);
        st.add(10);
        st.add(100);
        st.add(null);
        st.add(null);
        System.out.println(st);

        Map<Integer, String> map = new HashMap<>();
        map.put(null, "Rohit");
        System.out.println(map.size());
        map.put(null, "Deepak");
        System.out.println(map.size());

        List<String> str = Arrays.asList("0", "2", "10", "abc");
        Collections.sort(str);
        System.out.println(str);

//        str.forEach(d -> {
//            if(d.equals("2"))
//                str.remove(d);
//        });

//        Iterator<String> iterator = str.iterator();
//        while(iterator.hasNext()) {
//            if(iterator.next().equals("2"))
//                str.remove("2");
//        }
//
//        System.out.println(str);

        List<String> strings = Arrays.asList("2", "3");
        strings.add("hello");
        System.out.println(strings);
    }

//    public static void main(String[] args) {
//        int count = 0;
//        if(count < 3)
//            count ++;
//        else
//            System.out.println("Count " + count);
//        main(null);
//    }

    //forlopp and remove

}