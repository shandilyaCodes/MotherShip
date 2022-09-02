package trie;

public class TrieNode {
    TrieNode[] links = new TrieNode[26];
    boolean eow = false; // End of word

    public TrieNode() {}

    boolean containsKey(char ch) {
        return links[ch-'a'] != null;
    }

    TrieNode get(char ch) {
        return links[ch-'a'];
    }

    void put(char ch, TrieNode node) {
        links[ch-'a'] = node;
    }

    void setEnd() {
        eow = true;
    }

    boolean isLast() {
        return eow;
    }
}
