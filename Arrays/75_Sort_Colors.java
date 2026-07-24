# 75. Sort Colors

## Problem

Given an array `nums` with `n` objects colored red, white, or blue, sort them **in-place** so that objects of the same color are adjacent, with the colors in the order:

```text
0 → Red
1 → White
2 → Blue
```

The solution must not use any built-in sorting function.

---

## Example

**Input:**

```text
nums = [2,0,2,1,1,0]
```

**Output:**

```text
[0,0,1,1,2,2]
```

**Explanation:**

The colors are arranged in ascending order:

```text
0s first → 1s next → 2s last
```

---

## Approach

- Use the **Bubble Sort** technique.
- Compare adjacent elements in the array.
- If the current element is greater than the next element, swap them.
- After each pass, the largest element moves to the end of the unsorted portion.
- Repeat until the array is sorted.

---

## Java Solution

```java
class Solution {
    public void sortColors(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {

            for (int j = 0; j < nums.length - 1 - i; j++) {

                if (nums[j] > nums[j + 1]) {

                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }
}
```

## Concepts Used

- Arrays
- Sorting Algorithms
- Bubble Sort
- Nested Loops
- Swapping Elements
- In-place Algorithm
