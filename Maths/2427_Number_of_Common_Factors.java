# 2427. Number of Common Factors

## Problem

Given two positive integers `a` and `b`, return the number of **common factors** of `a` and `b`.

A number is a common factor if it divides both `a` and `b` without leaving a remainder.

---

## Example

**Input:**

```text
a = 12
b = 6
```

**Output:**

```text
4
```

**Explanation:**

The common factors of `12` and `6` are:

```text
1, 2, 3, 6
```

Therefore, the answer is `4`.

---

## Java Solution

```java
class Solution {
    public int commonFactors(int a, int b) {
        int mn = Math.min(a, b);
        int count = 0;

        for (int i = 1; i <= mn; i++) {
            if (a % i == 0 && b % i == 0) {
                count++;
            }
        }

        return count;
    }
}
```

---
  
## Concepts Used

- Mathematics
- Factors
- Modulo Operator `%`
- Loops
- `Math.min()`
- Conditional Statements
- Counting
