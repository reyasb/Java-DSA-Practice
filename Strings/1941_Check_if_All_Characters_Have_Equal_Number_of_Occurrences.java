# 1941. Check if All Characters Have Equal Number of Occurrences

## Problem

Given a string `s`, return `true` if **every character** in the string appears the **same number of times**. Otherwise, return `false`.

---

## Example

**Input:**

```text
s = "abacbc"
```

**Output:**

```text
true
```

**Explanation:**

* `'a'` appears `2` times.
* `'b'` appears `2` times.
* `'c'` appears `2` times.

Since all characters occur the same number of times, the answer is `true`.

---


## Java Solution

```java
class Solution {
    public boolean areOccurrencesEqual(String s) {
        boolean ans = true;
        char[] c = s.toCharArray();
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < c.length; i++) {
            int charc = 0;

            for (int j = 0; j < c.length; j++) {
                if (c[i] == c[j]) {
                    charc++;
                }
            }

            al.add(charc);
        }

        for (int i = 0; i < al.size(); i++) {
            for (int j = 0; j < al.size(); j++) {
                if (!al.get(i).equals(al.get(j))) {
                    ans = false;
                }
            }
        }

        return ans;
    }
}
```

---


## Concepts Used

* Strings
* Character Arrays
* Nested Loops
* Frequency Counting
* ArrayList
* Brute Force Approach
