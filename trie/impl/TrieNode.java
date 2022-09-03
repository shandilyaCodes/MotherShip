package trie;

public class TrieNode {
    // Assuming that our trie is going to contain words only made of small case English alphabets, we have an array of 26 Trie Nodes in each Trie Node
    TrieNode[] links = new TrieNode[26];
    
    // To begin with for a Trie Node End Of Word is false
    boolean eow = false; // End of word

    public TrieNode() {}

    // Since we have defined space for 26 alphabets, at 0 we'll have a, at 1 we'll have b, at 2 we'll have c, so on and so forth
    // With the same logic, if we wish to find if a character is present in the Trie Node or not, we can check if the link at the index has something or is null
    boolean containsKey(char ch) {
        return links[ch-'a'] != null;
    }
    
    // With the logical similar to containsKey() we can get the for the given character
    TrieNode get(char ch) {
        return links[ch-'a'];
    }

    // Similar logic as containsKey or get with key difference being here we are placing the TrieNode reference on the desired spot in links array
    void put(char ch, TrieNode node) {
        links[ch-'a'] = node;
    }

    // Mark the current node as the end of the word
    void setEnd() {
        eow = true;
    }

    // If the eow is true, it means the given node is the last node in the character sequence
    boolean isLast() {
        return eow;
    }
}
