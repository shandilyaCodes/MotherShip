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

    /*
    * Search TC is O(length of word)
    * Have reference tracking node init to root node
    * For all the characters in the word, find if the node contains the character at index i or not
    * If it doesn't contain, it means there is no such word present return false
    * If present move reference to the next trie node and check for the same
    * In last return the status of the node being the last node, if it's last node and false wasn't returned so far
    * it means the word has been found in the trie, if not there is no false returned so far and the node as well is
    * not last, then it means there is something else to probe in that chain and it means the exact word hasn't been 
    * found out
     */
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

    /*
    * Starts with time complexity is O(n)
    * The process is almost same as the findword method
    * However, if we exhaust all the characters in the word without returning false in the process, return true in the last
    * It means that till now all the characters in the word have matched (found a path) in the trie, even though if the current
    * node isn't the last node, there is certainly a prefix here thereyby telling that there is a word which starts with the prefix
    * in the given trie
     */
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
