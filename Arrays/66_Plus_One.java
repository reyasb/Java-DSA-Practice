# 66. Plus One

## Problem

You are given a **large integer** represented as an integer array `digits`, where each `digits[i]` is a single digit. The digits are ordered from most significant to least significant.

Increment the integer by one and return the resulting array of digits.

---

## Example

**Input:**

```text
digits = [1,2,3]
```

**Output:**

```text
[1,2,4]
```

---

## Java Solution

```java
class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] = digits[i] + 1;
                return digits;
            }
            digits[i] = 0;
        }

        int[] ans = new int[digits.length + 1];
        ans[0] = 1;
        return ans;
    }
}
```


## Concepts Used

- Arrays
- Reverse Traversal
- Carry Handling
- Simulation
- Edge Case Handling
