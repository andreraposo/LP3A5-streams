package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Insira um numero: ");
        int n = scan.nextInt();
        List<Integer> list = new ArrayList<>();
        list.add(n);

        for(int i = n; i >= 1; i--){
            if(i == 1){
                list.add(0, i);
                break;
            }
            list.add(0, i);
            list.add(0, i-1);
        }

        System.out.println("Lista completa");
        list.stream().forEach(e -> System.out.print(e + " "));

        System.out.println("\nLista sem repetiçao");
        list.stream()
                .distinct()
                .forEach(e -> System.out.print(e + " "));

        System.out.println("\nLista de impares");
        list.stream()
                .distinct()
                .filter(e -> e % 2 != 0)
                .forEach(e -> System.out.print(e + " "));

        System.out.println("\nLista de pares");
        list.stream()
                .distinct()
                .filter(e -> e % 2 == 0)
                .forEach(e -> System.out.print(e + " "));

        System.out.println("\nLista a partir do quinto");
        list.stream()
                .distinct()
                .skip(4)
                .forEach(e -> System.out.print(e + " "));

        System.out.println("\nLista de multiplicada por quatro");
        list.stream()
                .map(e -> e * 4)
                .forEach(e -> System.out.print(e + " "));
    }
}
