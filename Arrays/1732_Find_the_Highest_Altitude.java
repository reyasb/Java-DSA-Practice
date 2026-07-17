# 1732. Find the Highest Altitude

## Problem

There is a biker going on a road trip. The road trip consists of `n + 1` points at different altitudes.

You are given an integer array `gain` where `gain[i]` is the net gain in altitude between points `i` and `i + 1` for all `0 <= i < n`.

The biker starts the trip with an altitude of `0`.

Return the highest altitude of a point.

## Example

**Input:**

```text
gain = [-5,1,5,0,-7]
```

**Output:**

```text
1
```

**Explanation:**

```text
Altitude at point 0 = 0
Altitude at point 1 = 0 + (-5) = -5
Altitude at point 2 = -5 + 1 = -4
Altitude at point 3 = -4 + 5 = 1
Altitude at point 4 = 1 + 0 = 1
Altitude at point 5 = 1 + (-7) = -6

Highest altitude = 1
```

## Approach

* Create an array `op` to store the altitude at each point.
* Initialize the starting altitude as `0`.
* Calculate each new altitude by adding the previous altitude and the corresponding gain value.
* Traverse the altitude array to find the maximum altitude.
* Return the highest altitude.

## Java Solution

```java
class Solution {
    public int largestAltitude(int[] gain) {
        int ans = 0;
        int[] op = new int[gain.length + 1];

        for(int i = 0; i <= gain.length; i++) {
            if(i == 0) {
                op[i] = 0;
            }
            else if(i >= 1) {
                op[i] = op[i - 1] + gain[i - 1];
            }
        }

        int max = 0;
        for(int i = 0; i < op.length; i++) {
            if(op[i] > max) {
                max = op[i];
            }
        }

        return max;
    }
}
```

## Concepts Used

* Arrays
* Prefix Sum
* Array Traversal
* Loops
* Conditional Statements
* Maximum Element in Array
