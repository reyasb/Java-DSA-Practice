# 2255. Count Prefixes of a Given String

## Problem

Given a string `s` and an array of strings `words`, return the number of strings in `words` that are **prefixes** of `s`.

A string is a prefix of `s` if it appears at the beginning of `s`.

---

## Example

**Input:**

```text
words = ["a","b","c","ab","bc","abc"]
s = "abc"
```

**Output:**

```text
3
```

**Explanation:**

The prefixes of `"abc"` present in `words` are:

- `"a"`
- `"ab"`
- `"abc"`

Therefore, the answer is `3`.

---

## Java Solution

```java
class Solution {
    public int countPrefixes(String[] words, String s) {
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            if (s.startsWith(words[i])) {
                count++;
            }
        }

        return count;
    }
}
```

---

## Concepts Used

- Strings
- Arrays
- String Traversal
- `startsWith()` Method
- Prefix Matching
- Counting
