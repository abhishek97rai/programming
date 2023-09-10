/*
 * Click `Run` to execute the snippet below!
 */

import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Solution {
  public static void main(String[] args) {
    ArrayList<String> strings = new ArrayList<String>();
    strings.add("Hello, World!");
    strings.add("Welcome to CoderPad.");
    strings.add("This pad is running Java " + Runtime.version().feature());

    for (String string : strings) {
      System.out.println(string);
    }

    Trie trie = new Trie();
    trie.insert("batman");
    trie.insert("supman");
    trie.insert("catman");
    System.out.println("Does supman exist: " + trie.search("supman"));
    System.out.println("Does suman exist: " + trie.search("suman"));
    System.out.println("Does supma exist: " + trie.search("supma"));
    System.out.println("Does catman exist: " + trie.search("catman"));
    System.out.println("Does any word start with supman: " + trie.startsWith("supman"));
    System.out.println("Does any word start with cat: " + trie.startsWith("cat"));
    System.out.println("Does any word start with batma: " + trie.startsWith("batma"));
    System.out.println("Does any word start with fart: " + trie.startsWith("fart"));
  }
}

class TrieNode {
  TrieNode[] children = new TrieNode[26];
  boolean isEndOfWord;

  TrieNode() {
    isEndOfWord = false;
    for (int i = 0; i < 26; i++) {
      children[i] = null;
    }
  }
}

class Trie {
  TrieNode root;

  Trie() {
    root = new TrieNode();
  }

  void insert(String word) {
    TrieNode node = root;
    for (int i = 0; i < word.length(); i++) {
      char ch = word.charAt(i);
      int index = ch - 'a';
      if (node.children[index] == null) {
        node.children[index] = new TrieNode();
      }
      node = node.children[index];
    }
    node.isEndOfWord = true;
  }

  boolean search(String word) {
    TrieNode node = root;
    for (int i = 0; i < word.length(); i++) {
      char ch = word.charAt(i);
      int index = ch - 'a';
      if (node.children[index] == null) {
        return false;
      } else {
        node = node.children[index];
      }
    }
    return node.isEndOfWord;
  }

  boolean startsWith(String word) {
    TrieNode node = root;
    for (int i = 0; i < word.length(); i++) {
      char ch = word.charAt(i);
      int index = ch - 'a';
      if (node.children[index] == null) {
        return false;
      } else {
        node = node.children[index];
      }
    }
    return true;
  }
}
