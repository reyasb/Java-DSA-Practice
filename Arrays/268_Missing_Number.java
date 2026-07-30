# 268. Missing Number

## Problem

Given an array `nums` containing `n` distinct numbers in the range `[0, n]`, return the **only number** in the range that is missing from the array.

---

## Example

**Input:**

```text
nums = [3, 0, 1]
```

**Output:**

```text
2
```

## Java Solution

```java
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);

        if (nums[0] != 0) {
            return 0;
        }

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1] + 1) {
                return nums[i - 1] + 1;
            }
        }

        return nums.length;
    }
}
```

## Concepts Used

- Arrays
- Sorting
- Array Traversal
- Gap Detection
- Edge Case Handling
