public class Leetcode_2381_ShiftingLettersII {
    public String shiftingLetters(String s, int[][] shifts) {
        int n = s.length();
        int[] diff = new int[n + 1];

        // Apply the difference array technique
        for (int[] shift : shifts) {
            int start = shift[0];
            int end = shift[1];
            int direction = shift[2] == 0 ? -1 : 1;

            diff[start] += direction;
            if (end + 1 < n) {
                diff[end + 1] -= direction;
            }
        }

        // Compute the prefix sum to get the net shifts
        int netShift = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            netShift = (netShift + diff[i]) % 26;
            int newCharIndex = (s.charAt(i) - 'a' + netShift + 26) % 26;
            result.append((char) ('a' + newCharIndex));
        }

        return result.toString();
    }
}
