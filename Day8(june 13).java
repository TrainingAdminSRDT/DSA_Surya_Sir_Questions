//PROGRAM 1//
class Solution {
    public int countNodes(TreeNode root) {
        if(root == null) return 0;

        return 1+countNodes(root.left)+countNodes(root.right);
        
    }
}

//PROGRAM 2//
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null || root.val== val) return root ;

       return root.val > val ? searchBST(root.left, val) : searchBST(root.right, val);

    }
}

//PROGRAM 3//
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);

        if (val < root.val)
            root.left = insertIntoBST(root.left, val);
        else
            root.right = insertIntoBST(root.right, val);

        return root;
    }
}

//PROGRAM 4//
class Solution {
    public int findCenter(int[][] edges) {
        int a=edges[0][0], b=edges[0][1];
        int c=edges[1][0], d=edges[1][1];
        return a == c || a == d ? a:b;
    }
}

//PROGRAM 5//
class Solution {
    public int numIslands(char[][] grid) {
        int cnt = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    dfs(grid, i, j);
                    cnt++;
                }
            }
        }
        return cnt;
    }

    private void dfs(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length
                || grid[i][j] == '0')
            return;

        grid[i][j] = '0';

        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i, j - 1);
    }
}

//PROGRAM 6//
class Solution {
    public String smallestSubsequence(String s) {
        int[] cnt = new int[26];
        boolean[] vis = new boolean[26];

        for (char c : s.toCharArray()) cnt[c - 'a']++;

        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()) {
            cnt[c - 'a']--;

            if (vis[c - 'a']) continue;

            while (!st.isEmpty() && st.peek() > c &&
                   cnt[st.peek() - 'a'] > 0) {
                vis[st.pop() - 'a'] = false;
            }

            st.push(c);
            vis[c - 'a'] = true;
        }

        StringBuilder ans = new StringBuilder();
        for (char c : st) ans.append(c);

        return ans.toString();
    }
}