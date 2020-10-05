package ru.geekbrains.Lesson;
import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word;
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        System.out.println(Arrays.toString(words));
        int n = (int)Math.floor(Math.random() * words.length);
        System.out.println("Попробуйте угадать загаданное слово!");
        word = sc.nextLine();
        String str = words[n];
        if (word.equals(words[n])) {
            System.out.println("Отлично!");
        } else {
            do {
                System.out.println("Загадано другое слово ");
                System.out.println("Буквы которые совпадают:");
                compareWords(word, str);
                word = sc.nextLine();
            } while (!word.equals(words[n]));
        }
        System.out.println("Вы угадали!");
    }
    public static void compareWords (String myWord, String guessWord) {
        for (int i = 0, j = 0; i < myWord.length() && j < guessWord.length(); i++, j++) {
            if (myWord.charAt(i) == guessWord.charAt(j)) {
                System.out.println(myWord.charAt(i));
            } else {
                System.out.println("#");
            }
        }
        System.out.println("#");
        System.out.println("#");
        System.out.println("#");
    }
}