# 1295. Find Numbers with Even Number of Digits

## Problem

Given an integer array `nums`, return **how many of them contain an even number of digits**.

---

## Example

**Input:**

```text
nums = [12,345,2,6,7896]
```

**Output:**

```text
2
```

## Java Solution

```java
class Solution {
    public int findNumbers(int[] nums) {
        int res = 0;

        for (int i : nums) {
            int count = 0;

            while (i > 0) {
                i = i / 10;
                count++;
            }

            if (count % 2 == 0) {
                res++;
            }
        }

        return res;
    }
}
```

## Concepts Used

- Arrays
- Loops
- Digit Counting
- Integer Division
- Conditional Statements
