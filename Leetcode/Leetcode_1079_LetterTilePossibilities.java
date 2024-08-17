import java.util.HashSet;
import java.util.Set;

public class Leetcode_1079_LetterTilePossibilities {
    private static void generateSequences(String tiles, String current, boolean[] used, Set<String> result) {
        if (!current.isEmpty()) {
            result.add(current);  // Add non-empty sequence to the result set
        }

        for (int i = 0; i < tiles.length(); i++) {
            if (used[i]) continue;  // Skip already used characters
            used[i] = true;
            generateSequences(tiles, current + tiles.charAt(i), used, result);
            used[i] = false;  // Backtrack to try another possibility
        }
    }

    public int numTilePossibilities(String tiles) {
        Set<String> result = new HashSet<>();
        boolean[] used = new boolean[tiles.length()];
        generateSequences(tiles, "", used, result);
        return result.size();
    }
}
