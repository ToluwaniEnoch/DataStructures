package com.data.dataStructures;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortOrders {
    public static void main(String[] args) {

    }

    public static List<String> sortOrders(List<String> orderList) {
        List<String> result = new ArrayList<>();
        if(orderList == null || orderList.isEmpty()){
            return result;
        }

        List<String> primeList = new ArrayList<>();
        List<String> nonPrimeList = new ArrayList<>();

        for(String order : orderList){
            String[] split = order.split(" ");
            if(Character.isLetter(split[1].charAt(0))){
                primeList.add(order);
            }else{
                nonPrimeList.add(order);
            }
        }

        primeList.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                StringBuilder o1Meta = new StringBuilder();
                StringBuilder o2Meta = new StringBuilder();

                String[] split1 = o1.split(" ");
                String[] split2 = o2.split(" ");
                for(int i=1; i<split1.length; i++){
                    o1Meta.append(split1[i]);
                    o1Meta.append(" ");
                }

                for(int i=1; i<split2.length; i++){
                    o2Meta.append(split2[i]);
                    o2Meta.append(" ");
                }
                int compare = o1Meta.compareTo(o2Meta);
                if(compare != 0) return compare;

                return split1[0].compareTo(split2[0]);
            }

        });

        primeList.addAll(nonPrimeList);
        return primeList;
    }
}
