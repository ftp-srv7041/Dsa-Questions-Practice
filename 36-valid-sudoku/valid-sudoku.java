import java.util.HashSet;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        // 9 rows, 9 columns, 9 boxes ke liye hash set bana lo
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];

        // Initialize hash sets
        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        // Board iterate karo
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (c == '.') continue;

                // Box index calculate karo
                int boxIndex = (i / 3) * 3 + (j / 3);

                // Check duplicates
                if (rows[i].contains(c) || cols[j].contains(c) || boxes[boxIndex].contains(c)) {
                    return false;  // duplicate mil gaya
                }

                // Add karo sets me
                rows[i].add(c);
                cols[j].add(c);
                boxes[boxIndex].add(c);
            }
        }
        return true;
    }
}
