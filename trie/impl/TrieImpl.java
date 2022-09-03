package trie;

public class TrieImpl {

    private static TrieNode root;

    public TrieImpl() {
        root = new TrieNode();
    }

    /*
    * O(length of the word) is the time complexity of insertion
    * Steps
    * Have a dummy node to track the node in consideration and init that with root node
    * For all the characters in the word, check if the character is present in the current node
    * If the character is present in the current node move to the next node, if not put the character
    * in the node at index i
    * Once all the characters in the word are analysed, in the end set the end for the node by setting it's end of word as true
     */
    public void insert(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            if (!node.containsKey(word.charAt(i))) {
                node.put(word.charAt(i), new TrieNode());
            }
            node = node.get(word.charAt(i));
        }
        node.setEnd();
    }

    public boolean findWord(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            if (!node.containsKey(word.charAt(i))) {
                return false;
            }
            node = node.get(word.charAt(i));
        }
        return node.isLast();
    }

    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for (int i = 0; i < prefix.length(); i++) {
            if (!node.containsKey(prefix.charAt(i))) {
                return false;
            }
            node = node.get(prefix.charAt(i));
        }
        return true;
    }
}
