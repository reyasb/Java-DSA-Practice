# 2413. Smallest Even Multiple

## Problem

Given a positive integer `n`, return the **smallest positive integer** that is divisible by both `2` and `n`.

---

## Example

**Input:**

```text
n = 5
```

**Output:**

```text
10
```

**Explanation:**

* Multiples of `5` are: `5, 10, 15, ...`
* Even numbers are divisible by `2`.
* The smallest number divisible by both `2` and `5` is `10`.

---

## Java Solution

```java
class Solution {
    public int smallestEvenMultiple(int n) {
        if (n % 2 == 0) {
            return n;
        } else {
            return n * 2;
        }
    }
}
```


* No extra space is used.

---

## Concepts Used

* Mathematics
* Modulo Operator (`%`)
* Conditional Statements
* Even and Odd Numbers
* Least Common Multiple (LCM)
