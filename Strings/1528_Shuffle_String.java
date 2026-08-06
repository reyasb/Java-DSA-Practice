# 1528. Shuffle String

## Problem

You are given a string `s` and an integer array `indices` of the same length.

The array `indices` represents the target position of each character in `s`. Rearrange the characters and return the restored string.

---

## Example

**Input:**

```text
s = "codeleet"
indices = [4,5,6,7,0,2,1,3]
```

**Output:**

```text
"leetcode"
```

**Explanation:**

* Place each character from `s` at the position specified by `indices`.
* After rearranging all characters, the restored string is `"leetcode"`.

---

## Java Solution

```java
class Solution {
    public String restoreString(String s, int[] indices) {
        char[] ch = s.toCharArray();
        char[] ans = new char[indices.length];
        String res = "";

        for (int i = 0; i < indices.length; i++) {
            ans[indices[i]] = ch[i];
        }

        for (int j = 0; j < indices.length; j++) {
            res = res + ans[j];
        }

        return res;
    }
}
```

---

## Concepts Used

* Strings
* Character Arrays
* Array Index Mapping
* String Manipulation
* Traversal
