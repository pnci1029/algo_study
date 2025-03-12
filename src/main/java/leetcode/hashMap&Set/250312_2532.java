class Solution {
    public int equalPairs(int[][] grid) {
        int result = 0;
        Map<String, Integer> rowFreq = new HashMap<>();
        
        for(int i = 0; i < grid.length; i++) {
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < grid[i].length; j++) {
                sb.append(grid[i][j]);
                if(j < grid[i].length - 1) {
                    sb.append(","); 
                }
            }
            String rowStr = sb.toString();
            rowFreq.put(rowStr, rowFreq.getOrDefault(rowStr, 0) + 1);
        }
        
        for(int j = 0; j < grid[0].length; j++) {
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < grid.length; i++) {
                sb.append(grid[i][j]);
                if(i < grid.length - 1) {
                    sb.append(",");
                }
            }
            String colStr = sb.toString();
            if(rowFreq.containsKey(colStr)) {
                result += rowFreq.get(colStr); 
            }
        }
        
        return result;
    }
}
