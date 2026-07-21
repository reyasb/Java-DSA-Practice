# 345. Reverse Vowels of a String

## Problem

Given a string `s`, reverse only all the vowels in the string and return the modified string.

The vowels are:

- `'a', 'e', 'i', 'o', 'u'`
- `'A', 'E', 'I', 'O', 'U'`

---

## Example

**Input:**

```text
s = "hello"
```

**Output:**

```text
"holle"
```
---

## Approach

- Convert the input string into a character array.
- Traverse the array and store all vowels in a separate character array.
- Start from the last stored vowel.
- Traverse the original array again.
- Whenever a vowel is found, replace it with the last stored vowel and move backwards.
- Convert the modified character array back into a string and return it.

---

## Java Solution

```java
class Solution {
    public String reverseVowels(String s) {
        char[] vow = new char[s.length()];
        char[] arr = s.toCharArray();
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'O' || arr[i] == 'I' || arr[i] == 'U' ||
                arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'o' || arr[i] == 'i' || arr[i] == 'u') {

                vow[j] = arr[i];
                j++;
            }
        }

        j--;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'O' || arr[i] == 'I' || arr[i] == 'U' ||
                arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'o' || arr[i] == 'i' || arr[i] == 'u') {

                arr[i] = vow[j];
                j--;
            }
        }

        return new String(arr);
    }
}
```

## Concepts Used

- Strings
- Character Arrays (`toCharArray()`)
- String Manipulation
- Array Traversal
- Conditional Statements
- Reverse Traversal
```
