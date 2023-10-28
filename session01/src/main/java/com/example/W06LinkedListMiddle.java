package com.example;

import static com.example.W05LinkedList.LinkedList;
import java.util.HashMap;
import java.util.Map;
import com.example.W05LinkedList.LinkedList;

public class W06LinkedListMiddle {
    private W06LinkedListMiddle() {}

    public static <T> T middle(LinkedList<T>.Node head) {
        LinkedList<T>.Node byOne = head;
        LinkedList<T>.Node byTwo = head;
        // byTwo will reach the end of the list when byOne is at the middle
        while (byTwo != null && byTwo.next != null) {
            // byOne moves one node at a time
            byOne = byOne.next;
            // byTwo moves two nodes at a time
            byTwo = byTwo.next.next;
        }
        if (byOne == null) {
            // list is empty
            return null;
        }
        return byOne.data;
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> cache = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (cache.containsKey(nums[i])) {
                return new int[] {cache.get(nums[i]), i};
            }
            cache.put(target - nums[i], i);
        }
        return new int[] {-1, -1};
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        assert middle(list.head) == null;
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        assert middle(list.head) == 3;
        list.add(6);
        assert middle(list.head) == 4;


        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        assert result[0] == 0;
        assert result[1] == 1;

        nums = new int[] {3, 2, 4};
        target = 6;
        result = twoSum(nums, target);
        assert result[0] == 1;
        assert result[1] == 2;

        nums = new int[] {3, 3};
        target = 6;
        result = twoSum(nums, target);
        assert result[0] == 0;
        assert result[1] == 1;

        System.out.println("All tests passed");
    }

}
