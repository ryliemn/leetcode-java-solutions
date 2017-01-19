package solutions.islandperimeter;

/**
 * For any given piece of land on the island, if we examine the adjacent cells to the north, south, west, and east of
 * it, the number of cells it creates for the perimeter is equal to the number of water (0) neighbors, since we know
 * there can't be any bodies of water within the island.
 *
 * Considering that, it's a simple matter of looping through the whole array, and counting the neighbors for each
 * land cell. Some special care is needed to ensure we don't get invalid index exceptions, but otherwise, fairly
 * straightforward.
 *
 * The algorithm takes O(w * h), where w is width and h is height of the grid.
 */

public class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        for (int y = 0; y < grid.length; y++) {
            for (int x = 0; x < grid[y].length; x++) {
                if (grid[y][x] == 1) {
                    if (y - 1 < 0 || grid[y - 1][x] == 0) {
                        perimeter++;
                    }
                    if (x + 1 >= grid[y].length || grid[y][x + 1] == 0) {
                        perimeter++;
                    }
                    if (y + 1 >= grid.length || grid[y + 1][x] == 0) {
                        perimeter++;
                    }
                    if (x -1 < 0 || grid[y][x - 1] == 0) {
                        perimeter++;
                    }
                }
            }
        }
        return perimeter;
    }
}
