package bishi0813haoweilai;

import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        String ss1 = s1.substring(1, s1.length() - 1);
        String ss2 = s2.substring(1, s2.length() - 1);
        System.out.println(ss1);
        System.out.println(ss2);

    }
}

class Trie {
    int N = 100000;
    int[][] trie;
    int[] count;
    int index;

    public Trie() {
        trie = new int[N][26];
        count = new int[N];
        index = 0;
    }

    public void insert(String word) {
        int row = 0;
        for (int i = 0; i < word.length(); i++) {
            int column = word.charAt(i) - 'a';
            if (trie[row][column] == 0) {
                trie[row][column] = ++index;
            }
            row = trie[row][column];
        }
        count[row]++;
    }

    public boolean search(String word) {
        int row = 0;
        for (int i = 0; i < word.length(); i++) {
            int column = word.charAt(i) - 'a';
            if (trie[row][column] == 0) {
                return false;
            }
            row = trie[row][column];
        }
        return true;
    }

    public boolean fullSearch(String word) {
        int row = 0;
        for (int i = 0; i < word.length(); i++) {
            int column = word.charAt(i) - 'a';
            if (trie[row][column] == 0) {
                return false;
            }
            row = trie[row][column];
        }
        return count[row] != 0;
    }
}
