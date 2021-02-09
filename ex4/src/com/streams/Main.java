package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Paulo", "Camila", "Ana Maria", "Patrick", "Ana Clara", "Pedro", "Alfredo");
        System.out.println(nomes);

        System.out.println("\nNomes que começam com a letra P");
        List<String> nomesComP = nomes.stream()
                .filter(e -> e.charAt(0) == 'P' || e.charAt(0) == 'p')
                .collect(Collectors.toList());
        System.out.println(nomesComP);

        System.out.println("\nEsse nome começa com a letra A?");
        Map<Boolean, List<String>> nomesSeparados = nomes.stream()
                .collect(Collectors.groupingBy(e -> e.charAt(0) == 'A' || e.charAt(0) == 'a'));
        System.out.println(nomesSeparados);
    }
}
