package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/*
Напишите программу, которая использует Stream API для обработки списка чисел.
Программа должна вывести на экран среднее значение всех четных чисел в списке.
*/
public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,6,4,9,7,8);
        List<Double> oddNumber = Collections.singletonList(numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.averagingInt(Integer::intValue)));
        System.out.println(oddNumber);
    }
}