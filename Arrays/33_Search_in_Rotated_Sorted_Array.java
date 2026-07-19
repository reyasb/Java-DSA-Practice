# 33. Search in Rotated Sorted Array

## Problem

Given a rotated sorted array `nums` and an integer `target`, return the index of `target` if it exists in the array. Otherwise, return `-1`.

> **Note:** Although the expected solution uses binary search with **O(log n)** time complexity, this solution uses a simple linear search approach.

## Example

*Input:*

```text
nums = [4,5,6,7,0,1,2]
target = 0
```

*Output:*

```text
4
```
## Approach

* Traverse the array from the last element to the first.
* Compare each element with the target.
* If the target is found, return its index.
* If the loop finishes without finding the target, return `-1`.

---

## Java Solution

```java
class Solution {
    public int search(int[] nums, int target) {
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
```

## Concepts Used

* Arrays
* Linear Search
* Loops
* Conditional Statements
