package Recursion;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @author BigD
 * @Create 2021-03-28 18:56
 */
public class _78_subsets {

    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> track = new ArrayList<>();
        backtrack(nums, 0, track);
        return res;
    }

    private void backtrack(int[] nums, int start, List<Integer> track) {
//        no terminator
        res.add(track);
        for (int i = start; i < nums.length; i++) {
            track.add(nums[i]);
            backtrack(nums, start + 1, track);
            track.remove(track.size() - 1);
        }
    }

    public List<List<Integer>> subsets2(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Deque<Integer> track = new ArrayDeque<>();
        dfs(nums, nums.length, 0, res, track);
        return res;
    }

    private void dfs(int[] nums, int length, int level, List<List<Integer>> res, Deque<Integer> track) {
        if (level == length) {
            res.add(new ArrayList<>(track));
            return;
        }
        dfs(nums, length, level + 1, res, track);
        track.addLast(nums[level]);
        dfs(nums, length, level + 1, res, track);
        track.removeLast();

    }


    public static void main(String[] args) {
        _78_subsets subset = new _78_subsets();
        System.out.println(subset.subsets2(new int[]{1,2,3}));
    }
}
