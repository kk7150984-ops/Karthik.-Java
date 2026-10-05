import java.util.*;

public class AnagramGroups {
    public static void main(String[] args) {

        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};

        HashMap<String, Integer> groups = new HashMap<>();

        for (String word : words) {

            // Convert word to character array
            char[] chars = word.toCharArray();

            // Sort characters
            Arrays.sort(chars);

            // Use sorted word as the key
            String key = new String(chars);

            groups.put(key, groups.getOrDefault(key, 0) + 1);
        }

        System.out.println("Number of anagram groups: " + groups.size());
    }
              }
