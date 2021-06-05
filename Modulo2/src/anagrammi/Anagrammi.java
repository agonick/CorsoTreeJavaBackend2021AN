package anagrammi;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Anagrammi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string a:");
        String a = sc.nextLine();
        System.out.print("Enter string b:");
        String b = sc.nextLine();
        anagrams(a, b);
    }

    static void anagrams(String a, String b) {
        int count = 0;
        int i=0;
        while(i<a.length()) {
            for (int j = 0; j < b.length(); j++) {
                if (a.charAt(i) == b.charAt(j)) {
                    count++;
                    break;
                }
            }
            i++;
        }
        if (count == a.length())
            System.out.println("anagramma");
        else
            System.out.println("non anagramma");

    }
}