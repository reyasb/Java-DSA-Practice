# 2778. Sum of Squares of Special Elements

## Problem

Given an integer array `nums`, calculate the **sum of squares of all special elements**.

An element `nums[i]` is called **special** if its index `i + 1` divides the length of the array.

Return the sum of the squares of all special elements.

---

## Example

**Input:**

```text
nums = [1,2,3,4]

```Output:

21

```Explanation:

The length of the array is 4.
Indices that divide 4 are:

1, 2, 4

Corresponding elements are:

1, 2, 4

Sum of squares:
1² + 2² + 4²
= 1 + 4 + 16
= 21

---

#Java Solution

```java
class Solution {
    public int sumOfSquares(int[] nums) {
        int ss = 0;

        for (int i = 1; i <= nums.length; i++) {
            if (nums.length % i == 0) {
                ss = ss + (nums[i - 1] * nums[i - 1]);
            }
        }

        return ss;
    }
}
```

---

##Concepts Used
*Arrays
*Array Indexing
*Modulo Operator
*Loops
*Conditional Statements
*Mathematical Operations
Squaring Elements
