package trie;

public class Runner {

    public static void main(String[] args) {
        TrieImpl trie = new TrieImpl();
        String[] strings = {"hello", "help", "help", "hel", "hel"};

        for (String s : strings)
            trie.insert(s);

        System.out.println(trie.findWord("hello"));
        System.out.println(trie.findWord("help"));
        System.out.println(trie.findWord("hel"));
        System.out.println(trie.findWord("lol"));

        System.out.println(trie.startsWith("he"));
        System.out.println(trie.startsWith("hel"));
        System.out.println(trie.startsWith("h"));
        System.out.println(trie.startsWith("xs"));
        System.out.println(trie.startsWith("x"));
    }
}
