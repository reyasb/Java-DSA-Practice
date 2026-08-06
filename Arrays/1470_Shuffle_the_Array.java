# 1470. Shuffle the Array

## Problem

You are given an array `nums` consisting of `2n` elements in the form:

```text
[x1, x2, ..., xn, y1, y2, ..., yn]
```

Return the array in the following form:

```text
[x1, y1, x2, y2, ..., xn, yn]
```

---

## Example

**Input:**

```text
nums = [2,5,1,3,4,7]
n = 3
```

**Output:**

```text
[2,3,5,4,1,7]
```

**Explanation:**

* First half: `[2,5,1]`
* Second half: `[3,4,7]`
* Alternate elements from both halves to form the shuffled array.

---


## Java Solution

```java
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        int j = n;
        int k = 0;

        for (int i = 0; i < nums.length; i += 2) {
            arr[i] = nums[k];
            arr[i + 1] = nums[j];
            j++;
            k++;
        }

        return arr;
    }
}
```

---


## Concepts Used

* Arrays
* Two Pointers
* Array Traversal
* Index Manipulation
* Simulation
