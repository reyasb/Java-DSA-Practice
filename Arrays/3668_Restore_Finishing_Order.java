# 3668. Restore Finishing Order

## Problem

You are given an integer array `order` representing the order in which participants finish a race, and an integer array `friends` containing the IDs of your friends.

Return an array containing the friends in the same order as they appear in `order`.

---

## Example

**Input:**

```text
order = [3, 1, 2, 5, 4]
friends = [1, 4, 3]
```

**Output:**

```text
[3, 1, 4]
```

**Explanation:**

The friends are `1`, `4`, and `3`.

Their order in the `order` array is:

```text
3 → 1 → 4
```

Therefore, the answer is:

```text
[3, 1, 4]
```

---

## Java Solution

```java
class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] ans = new int[friends.length];
        int cnt = 0;

        for (int i = 0; i < order.length; i++) {
            for (int j = 0; j < friends.length; j++) {
                if (order[i] == friends[j]) {
                    ans[cnt] = order[i];
                    cnt++;
                }
            }
        }

        return ans;
    }
}
```

---

## Concepts Used

- Arrays
- Nested Loops
- Array Traversal
- Searching
- Comparing Elements
- Maintaining an Index
