# 3959. Check Good Integer

## Problem

Given an integer `n`, determine whether it is a **good integer** based on the difference between:

- The sum of its digits.
- The sum of the squares of its digits.

Return:

- `true` if `square - digit >= 50`
- `false` otherwise.

---

## Example

**Input:**

```text
n = 123
```

**Calculation:**

```text
Sum of digits = 1 + 2 + 3 = 6

Sum of squares = 1² + 2² + 3²
               = 1 + 4 + 9
               = 14

14 - 6 = 8
```

Since `8 < 50`, the output is:

```text
false
```

---


## Java Solution

```java
class Solution {
    public boolean checkGoodInteger(int n) {
        int digit = 0;
        int square = 0;

        while (n != 0) {
            int lastnum = n % 10;

            digit = digit + lastnum;
            square = square + (lastnum * lastnum);

            n = n / 10;
        }

        int val = square - digit;

        if (val >= 50) {
            return true;
        }

        return false;
    }
}
```

---

## Concepts Used

- Mathematics
- Digit Extraction
- `%` Modulus Operator
- Integer Division
- `while` Loop
- Conditional Statements
- Basic Arithmetic
