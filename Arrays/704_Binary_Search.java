# 704. Binary Search

## Problem

Given an array of integers `nums` which is sorted in ascending order, and an integer `target`, return the index of `target` if it exists in the array.

If the target is not found, return `-1`.

You must write an algorithm with `O(log n)` runtime complexity.

---

## Example

**Input:**

```text
nums = [-1,0,3,5,9,12]
target = 9
```

**Output:**

```text
4
```

---

## Approach

- Initialize two pointers:
  - `st` points to the beginning of the array.
  - `end` points to the end of the array.
- Find the middle element using:

```java
mid = (st + end) / 2;
```

- Compare the middle element with the target:
  - If `nums[mid] == target`, return `mid`.
  - If `nums[mid] < target`, search the right half.
  - Otherwise, search the left half.
- If the loop ends without finding the target, return `-1`.

---

## Java Solution

```java
class Solution {
    public int search(int[] nums, int target) {

        int st = 0;
        int end = nums.length - 1;

        while (st <= end) {

            int mid = (st + end) / 2;

            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[mid] < target) {
                st = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        return -1;
    }
}
```

## Concepts Used

- Binary Search
- Arrays
- Two Pointers
- Divide and Conquer
- Searching Algorithm
