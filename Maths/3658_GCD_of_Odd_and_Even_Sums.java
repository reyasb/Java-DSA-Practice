# 3658. GCD of Odd and Even Sums

## Problem

Given an integer `n`, consider the first `2 × n` positive integers.

- Calculate the sum of all odd numbers.
- Calculate the sum of all even numbers.
- Return the Greatest Common Divisor (GCD) of these two sums.

---

## Example

**Input:**

```text
n = 4
```

**Output:**

```text
4
```

**Explanation:**

```text
Odd numbers  : 1, 3, 5, 7
Odd sum      : 16

Even numbers : 2, 4, 6, 8
Even sum     : 20

GCD(16, 20) = 4
```

---

## Approach

- Create an array of size `2 × n`.
- Traverse from `1` to `2 × n`.
- Add odd numbers to the odd sum and even numbers to the even sum.
- Find the smaller of the two sums.
- Check every number from `1` to the smaller sum.
- If a number divides both sums, update the maximum common divisor.
- Return the maximum common divisor.

---

## Java Solution

```java
class Solution {
    public int gcdOfOddEvenSums(int n) {
        int[] arr = new int[n * 2];
        int odd = 0;
        int even = 0;

        for (int i = 1; i <= arr.length; i++) {
            if (i % 2 == 0) {
                even += i;
            } else {
                odd += i;
            }
        }

        int small;
        if (odd < even) {
            small = odd;
        } else {
            small = even;
        }

        int max = 0;

        for (int i = 1; i <= small; i++) {
            if (odd % i == 0 && even % i == 0) {
                max = i;
            }
        }

        return max;
    }
}
```

## Concepts Used

- Arrays
- Loops
- Conditional Statements
- Odd and Even Numbers
- Greatest Common Divisor (GCD)
- Mathematical Computation
