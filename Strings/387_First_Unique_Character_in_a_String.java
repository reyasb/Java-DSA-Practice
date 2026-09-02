# 387. First Unique Character in a String

## Problem

Given a string `s`, find the **first non-repeating character** and return its index.

If there is no unique character, return `-1`.

---

## Example

**Input:**

```text
s = "leetcode"
```

**Output:**

```text
0
```

**Explanation:**

- `'l'` appears only once.
- It is the first unique character.
- Its index is `0`.

---


## Java Solution

```java
class Solution {
    public int firstUniqChar(String s) {
        int ans = -1;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (s.indexOf(ch) == s.lastIndexOf(ch)) {
                ans = i;
                return ans;
            }
        }

        return ans;
    }
}
```

---

## Concepts Used

- Strings
- Character Traversal
- `charAt()`
- `indexOf()`
- `lastIndexOf()`
- Finding Unique Elements
