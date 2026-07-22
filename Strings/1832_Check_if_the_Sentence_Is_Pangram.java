# 1832. Check if the Sentence Is Pangram

## Problem

A **pangram** is a sentence where every letter of the English alphabet appears at least once.

Given a string `sentence` containing only lowercase English letters, return `true` if the sentence is a pangram. Otherwise, return `false`.

---

## Example

**Input:**

```text
sentence = "thequickbrownfoxjumpsoverthelazydog"
```

**Output:**

```text
true
```

## Approach

- Convert the string into a character array.
- Sort the character array using `Arrays.sort()`.
- Create another character array to store only the unique characters.
- Traverse the sorted array and store each new unique character.
- Count the number of unique characters stored.
- If the count is **26**, the sentence is a pangram; otherwise, it is not.

---

## Java Solution

```java
import java.util.Arrays;

class Solution {
    public boolean checkIfPangram(String sentence) {
        char[] arr = sentence.toCharArray();
        Arrays.sort(arr);

        char[] ans = new char[26];
        int j = 1;
        ans[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                ans[j] = arr[i];
                j++;
            }
        }

        return j == 26;
    }
}
```

## Concepts Used

- Strings
- Character Arrays (`toCharArray()`)
- Sorting (`Arrays.sort()`)
- Array Traversal
- Counting Unique Characters
- Conditional Statements
```
