# 167. Two Sum II - Input Array Is Sorted

## Problem

Given a **1-indexed** array of integers `numbers` that is sorted in **non-decreasing order**, find two numbers such that they add up to a specific `target`.

Return the indices of the two numbers (1-based indexing).

You may assume that each input has exactly one solution, and you may not use the same element twice.

## Example

*Input:*

```text
numbers = [2,7,11,15]
target = 9
```

*Output:*

```text
[1,2]
```

*Explanation:*

```text
numbers[0] + numbers[1] = 2 + 7 = 9

Return their 1-based indices:
[1,2]
```

---

## Approach

* Initialize two pointers:
  * `start` at the beginning of the array.
  * `end` at the end of the array.
* Calculate the sum of the elements at both pointers.
* If the sum equals the target, return their 1-based indices.
* If the sum is smaller than the target, move the `start` pointer to the right.
* If the sum is greater than the target, move the `end` pointer to the left.
* Continue until the pair is found.

---

## Java Solution

```java
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];

        int start = 0;
        int end = numbers.length - 1;

        while (start < end) {
            int sum = numbers[start] + numbers[end];

            if (sum == target) {
                ans[0] = start + 1;
                ans[1] = end + 1;
                break;
            } else if (sum < target) {
                start++;
            } else {
                end--;
            }
        }

        return ans;
    }
}
```

---
## Concepts Used

* Arrays
* Two Pointers
* Sorted Array
* Linear Traversal
