# 326. Power of Three

## Problem

Given an integer `n`, return `true` if it is a power of **3**. Otherwise, return `false`.

An integer `n` is a power of three if there exists an integer `x` such that:

```text
n = 3^x
```

---

## Example

**Input:**

```text
n = 27
```

**Output:**

```text
true
```


## Java Solution

```java
class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }

        for (int i = 0; Math.pow(3, i) <= n; i++) {
            if (Math.pow(3, i) == n) {
                return true;
            }
        }

        return false;
    }
}
```


## Concepts Used

- Mathematics
- Loops
- `Math.pow()`
- Conditional Statements
- Number Theory
