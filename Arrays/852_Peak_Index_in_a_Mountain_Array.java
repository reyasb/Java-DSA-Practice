# 852. Peak Index in a Mountain Array

## Problem

A mountain array is an array where:

- The elements strictly increase up to a peak.
- The elements strictly decrease after the peak.

Return the **index** of the peak element.

---

## Example

**Input:**

```text
arr = [0,1,3,5,4,2]
```

**Output:**

```text
3
```

## Java Solution

```java
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int index = 0;

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                index = i;
                break;
            }
        }

        return index;
    }
}
```


## Concepts Used

- Array Traversal
- Conditional Statements
- Peak Element Detection
- Simulation
