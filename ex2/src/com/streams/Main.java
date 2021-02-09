package com.streams;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    List<Integer> list = Arrays.asList(0,1,2,3,4,5,6,7,8,9);

	    list.stream()
                .filter(e -> e % 2 == 0)
                .skip(2)
                .limit(2)
                .map(e -> e * 2)
                .forEach(e -> System.out.print(e + " "));
    }
}
