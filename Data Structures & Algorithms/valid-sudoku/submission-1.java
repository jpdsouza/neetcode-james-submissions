class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> rows = new HashMap<>();
        Map<Integer, Set<Character>> cols = new HashMap<>();
        Map<Integer, Set<Character>> box = new HashMap<>();

        for (int r=0; r < 9 ; r++) {
            for (int c=0; c < 9; c++) {
                char cell = board[r][c];
                if (cell == '.') continue;

                int boxIndex = (r/3) * 3 + (c / 3);

                if (rows.getOrDefault(r, new HashSet<>()).contains(cell) ||
                cols.getOrDefault(c, new HashSet<>()).contains(cell) ||
                box.getOrDefault(boxIndex, new HashSet<>()).contains(cell)
                ){
                    return false;
                }

                rows.computeIfAbsent(r, k-> new HashSet<>()).add(cell);
                cols.computeIfAbsent(c, k-> new HashSet<>()).add(cell);
                box.computeIfAbsent(boxIndex, k-> new HashSet<>()).add(cell);
            }
        }
        return true;
    }
}
