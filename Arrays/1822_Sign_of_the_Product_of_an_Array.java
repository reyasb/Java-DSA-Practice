# 1822. Sign of the Product of an Array

## Problem

Given an integer array `nums`, determine the **sign** of the product of all its elements.

Return:

- `1` if the product is positive.
- `-1` if the product is negative.
- `0` if the product is zero.

**Note:** You should determine the sign without calculating the actual product, as it may cause integer overflow.

---

## Example

**Input:**

```text
nums = [-1, -2, -3, 4]
```

**Output:**

```text
-1
```


## Java Solution

```java
class Solution {
    public int arraySign(int[] nums) {
        int prd = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                return 0;
            } else if (nums[i] < 0) {
                prd++;
            }
        }

        if (prd % 2 == 0) {
            return 1;
        }

        return -1;
    }
}
```


## Concepts Used

- Arrays
- Array Traversal
- Counting
- Conditional Statements
- Mathematical Observation
```
