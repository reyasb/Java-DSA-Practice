# 1952. Three Divisors

## Problem

Given an integer `n`, return `true` if `n` has **exactly three positive divisors**. Otherwise, return `false`.

---

## Example

**Input:**

```text
n = 4
```

**Output:**

```text
true
```

**Explanation:**

The positive divisors of `4` are:

```text
1, 2, 4
```

Since there are exactly **3** positive divisors, the answer is `true`.

---

## Java Solution

```java
class Solution {
    public boolean isThree(int n) {
        boolean ans = false;
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        if (count == 3) {
            ans = true;
            return ans;
        }

        return ans;
    }
}
```

---

## Concepts Used

* Mathematics
* Factors and Divisors
* Modulo Operator (`%`)
* Loops
* Conditional Statements
