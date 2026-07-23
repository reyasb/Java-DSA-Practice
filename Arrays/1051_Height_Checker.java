# 1051. Height Checker

## Problem

A school is trying to take an annual photo of all the students. Students are expected to stand in **non-decreasing order of height**.

Given an integer array `heights` representing the current order of students, return the **number of indices** where the students are not standing in the expected sorted order.

---

## Example

**Input:**

```text
heights = [1,1,4,2,1,3]
```

**Output:**

```text
3
```

**Explanation:**

```text
Expected order: [1,1,1,2,3,4]

Comparison:
Current :  [1,1,4,2,1,3]
Expected:  [1,1,1,2,3,4]
                  ↑   ↑ ↑

There are 3 positions where the heights differ.
```

---

## Approach

- Create a copy of the original `heights` array using `clone()`.
- Sort the copied array using `Arrays.sort()`.
- Compare each element of the original array with the sorted array.
- Count the number of positions where the elements are different.
- Return the count.

---

## Java Solution

```java
import java.util.*;

class Solution {
    public int heightChecker(int[] heights) {
        int[] srt = heights.clone();
        Arrays.sort(srt);

        int count = 0;

        for (int i = 0; i < heights.length; i++) {
            if (srt[i] != heights[i]) {
                count++;
            }
        }

        return count;
    }
}
```

## Concepts Used

- Arrays
- Array Cloning (`clone()`)
- Sorting (`Arrays.sort()`)
- Array Traversal
- Comparison
- Counting
```
