# 3190. Find Minimum Operations to Make All Elements Divisible by Three

## Problem

You are given an integer array `nums`.

In one operation, you can either:

- Add `1` to an element.
- Subtract `1` from an element.

Return the **minimum number of operations** needed to make every element in `nums` divisible by `3`.

---

## Example

**Input:**

```text
nums = [1,2,3,4]
```

**Output:**

```text
3
```

**Explanation:**

- `1` → `0` → 1 operation
- `2` → `3` → 1 operation
- `3` → already divisible by 3
- `4` → `3` → 1 operation

Total:

```text
1 + 1 + 0 + 1 = 3
```

---

## Java Solution

```java
class Solution {
    public int minimumOperations(int[] nums) {
        int cnt = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 3 != 0) {
                cnt++;
            }
        }

        return cnt;
    }
}
```

---

## Concepts Used

- Arrays
- Array Traversal
- Modulo Operator `%`
- Counting
- Conditional Statements
- Mathematical Observation
