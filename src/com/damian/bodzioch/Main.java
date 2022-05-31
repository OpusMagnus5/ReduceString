/*
Napisz funkcję która wykonuje redukcję stringa (metoda działająca rekurencyjnie). Wejściowy string zawiera
tylko litery a, b i c. Każda para ab może być zredukowana do c. Każda para ac może być zredukowana do b.
Każda para bc może być zredukowana do a. W skrócie: ab -> c, ac -> b, bc -> a. Program powinien wyświetlić
stringa którego nie da się już zredukować bardziej. Np. ababaccbc -> ccbac -> cab -> bb (wynik).
*/

package com.damian.bodzioch;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(reduceString("ababaccbc"));
    }

/*    public static void reduceString(String str){
        String str2 = "";
        boolean recursion = false;
        while (str.length() >= 2) {
            if (str.startsWith("ab") || str.startsWith("ba")) {
                str2 += "c";
                str = str.substring(2);
                recursion = true;
            } else if (str.startsWith("ac") || str.startsWith("ca")) {
                str2 += "b";
                str = str.substring(2);
                recursion = true;
            } else if (str.startsWith("bc") || str.startsWith("cb")) {
                str2 += "a";
                str = str.substring(2);
                recursion = true;
            }else {
                str2 = str.substring(0,1);
                str = str.substring(1);
            }
        }
        if (str.length() == 1){
            str2 += str;
        }
        if (recursion){
            reduceString(str2);
        }else {
            System.out.println(str2);
        }
    }*/

    public static String reduceString(String str){
        String str2 = str.replaceAll("ab", "c");
        str2 = str2.replaceAll("ba", "c");
        str2 = str2.replaceAll("ac", "b");
        str2 = str2.replaceAll("ca", "b");
        str2 = str2.replaceAll("bc", "a");
        str2 = str2.replaceAll("cb", "a");
        if (str.equals(str2)){
            return str2;
        }else {
            str = reduceString(str2);
        }
        return str;
    }
}
