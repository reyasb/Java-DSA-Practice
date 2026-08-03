# 50. Pow(x, n)

## Problem

Implement the function `pow(x, n)`, which calculates **x raised to the power n** (`xⁿ`).

---

## Example

**Input:**

```text
x = 2.00000, n = 10
```

**Output:**

```text
1024.00000
```

**Explanation:**

* (2^{10} = 1024)
* Therefore, the output is `1024.00000`.

---


## Java Solution

```java
class Solution {
    public double myPow(double x, int n) {
        double ans = Math.pow(x, n);
        return ans;
    }
}
```
---


## Concepts Used

* Mathematics
* Exponents
* Built-in Functions
* `Math.pow()`
