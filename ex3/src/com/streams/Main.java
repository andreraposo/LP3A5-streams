package com.streams;

import java.util.*;

public class Main {

    static Random random = new Random();

    public static void main(String[] args) {
        List<Integer> listCem = new ArrayList<>();
        List<Integer> listDez = new ArrayList<>();
        int limit = 500;

        for(int i = 0; i < 100; i++){
            if(i < 10)
                listDez.add(random.nextInt(limit));
            listCem.add(random.nextInt(limit));
        }
        System.out.println("Lista de Cem numeros");
        listCem.stream()
                .forEach(e -> System.out.print(e + " "));

        System.out.println("\n\nLista de Dez numeros");
        listDez.stream()
                .forEach(e -> System.out.print(e + " "));

        System.out.println("\n\nMaior numero da lista de Dez");
        Optional<Integer> max = listDez.stream()
                .max(Comparator.naturalOrder());
        System.out.println(max.get());

        System.out.println("\nMenor numero da lista de Dez");
        Optional<Integer> min = listDez.stream()
                .min(Comparator.naturalOrder());
        System.out.println(min.get());

        System.out.println("\nQuantidade de numeros da lista");
        Long qtd = listDez.stream().count();
        System.out.println(qtd);
    }
}
