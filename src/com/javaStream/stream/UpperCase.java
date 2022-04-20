package com.javaStream.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class UpperCase {


    public static void main(String[] args) {

    }

    public static Collection<String> mapToUppercase(String... names) {
        //(String...names) == array, if you want to call them, you can use mapToUppercase("a","b","c"....)

        //1. Bos bir Array olusturduk
        Collection<String> uppercaseNames = new ArrayList<>();
        //2. For loop ile icini doldurduk
        for(String name : names) {
            uppercaseNames.add(name.toUpperCase());
        }
        //3. geri donduk
        return uppercaseNames;
    }

    // change loop to stream

    //Array elemanlarinin tumunu al => stream()
    //buyuk harflara cevir  => map()
    //liste olarak geri don => collect()

    public static Collection<String> mapToUppercase2(String... names) {
        // return Arrays.asList(names).stream().map(name -> name.toUpperCase()).collect(Collectors.toList());

        //Gelen Arrayi stream e cevirdik, map arkilik herbir name ge tek tek uliship ishlem yaptik, ve bir stream collection lusturduk ve ahirida list haitida geri donduk
       return Arrays.stream(names).map(String::toUpperCase).collect(Collectors.toList());
    }

}
