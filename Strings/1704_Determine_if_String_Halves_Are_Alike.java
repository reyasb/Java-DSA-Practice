# 1704. Determine if String Halves Are Alike

## Problem

Given a string `s` of even length, split it into two equal halves.

A string is considered **alike** if both halves contain the **same number of vowels** (`a`, `e`, `i`, `o`, `u`, and their uppercase forms).

Return `true` if both halves are alike; otherwise, return `false`.

---

## Example

**Input:**

```text
s = "book"
```

**Output:**

```text
true
```


## Approach

- Convert the string into a character array.
- Traverse the first half of the array and count the vowels.
- Traverse the second half of the array and count the vowels.
- Compare the vowel counts of both halves.
- Return `true` if the counts are equal; otherwise, return `false`.

---

## Java Solution

```java
class Solution {
    public boolean halvesAreAlike(String s) {
        char[] str = new char[s.length()];
        str = s.toCharArray();

        int fhalf = 0;
        int lhalf = 0;

        for (int i = 0; i < str.length / 2; i++) {
            if (str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || str[i] == 'o' || str[i] == 'u' ||
                str[i] == 'A' || str[i] == 'E' || str[i] == 'I' || str[i] == 'O' || str[i] == 'U') {
                fhalf++;
            }
        }

        for (int i = str.length / 2; i < str.length; i++) {
            if (str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || str[i] == 'o' || str[i] == 'u' ||
                str[i] == 'A' || str[i] == 'E' || str[i] == 'I' || str[i] == 'O' || str[i] == 'U') {
                lhalf++;
            }
        }

        if (fhalf == lhalf) {
            return true;
        }

        return false;
    }
}
```


## Concepts Used

- Strings
- Character Arrays
- String Traversal
- Conditional Statements
- Vowel Counting
- Simulation
