# 1. Two Sum

## Problem

Given an array of integers `nums` and an integer `target`, return the indices of the two numbers such that they add up to `target`.

You may assume that each input has exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

## Example

**Input:**

```text
nums = [2,7,11,15]
target = 9
```

**Output:**

```text
[0,1]
```

**Explanation:**

```text
nums[0] + nums[1] = 2 + 7 = 9
```

Therefore, the indices `0` and `1` are returned.

## Approach

* Create an array `ar` of size `2` to store the indices of the answer.
* Traverse the array using two nested loops.
* For each element `nums[i]`, check all elements after it using `nums[j]`.
* If `nums[i] + nums[j]` equals `target`, store the indices in `ar`.
* Return the resulting array.

## Java Solution

```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ar = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    ar[0] = i;
                    ar[1] = j;
                    break;
                }
            }
        }

        return ar;
    }
}
```

## Concepts Used

* Arrays
* Nested Loops
* Brute Force Approach
* Conditional Statements
* Array Traversal
