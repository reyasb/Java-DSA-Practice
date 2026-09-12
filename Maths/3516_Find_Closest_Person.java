# 3516. Find Closest Person

## Problem

You are given three integers `x`, `y`, and `z`.

- Person 1 is at position `x`.
- Person 2 is at position `y`.
- Person 3 is at position `z`.

Person 3 is stationary. Determine which person reaches Person 3 first.

Return:

- `1` if Person 1 is closer.
- `2` if Person 2 is closer.
- `0` if both are at the same distance.

---

## Example

**Input:**

```text
x = 2
y = 7
z = 5
```

**Output:**

```text
1
```

**Explanation:**

- Distance between `x` and `z` = `|2 - 5| = 3`
- Distance between `y` and `z` = `|7 - 5| = 2`

Person 2 is closer, so the answer is `2`.

---


## Java Solution

```java
class Solution {
    public int findClosest(int x, int y, int z) {
        int xc = Math.abs(x - z);
        int yc = Math.abs(y - z);

        if (xc == yc) {
            return 0;
        }
        else if (xc < yc) {
            return 1;
        }

        return 2;
    }
}
```

---

## Concepts Used

- Mathematics
- Absolute Difference
- `Math.abs()`
- Conditional Statements
- Comparison
