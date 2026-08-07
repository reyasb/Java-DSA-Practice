# 922. Sort Array By Parity II

## Problem

Given an integer array `nums`, where half of the integers are even and half are odd, rearrange the array so that:

- Every even index contains an even number.
- Every odd index contains an odd number.

Return the rearranged array.

---

## Example

**Input:**

```text
nums = [4,2,5,7]
```

**Output:**

```text
[4,5,2,7]
```

**Explanation:**

- Even indices (0, 2) contain even numbers: `4`, `2`
- Odd indices (1, 3) contain odd numbers: `5`, `7`

The output satisfies the required condition.

---


## Java Solution

```java
class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] ans = new int[nums.length];
        int even = 0;
        int odd = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                ans[even] = nums[i];
                even += 2;
            } else {
                ans[odd] = nums[i];
                odd += 2;
            }
        }

        return ans;
    }
}
```

---


## Concepts Used

- Arrays
- Array Traversal
- Two Pointers
- Conditional Statements
- Index Manipulation
