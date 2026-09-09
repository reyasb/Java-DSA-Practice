# 3921. Score Validator

## Problem

Given an array of strings `events`, calculate the final **score** and the number of `"W"` events.

The rules are:

- `"W"` → Increment the win counter by `1`.
- `"WD"` or `"NB"` → Add `1` to the score.
- A numeric string → Convert it to an integer and add it to the score.
- Stop processing when the number of `"W"` events reaches `10`.

Return an integer array containing:

```text
[score, number of W events]
```

---

## Example

**Input:**

```text
events = ["10", "W", "WD", "5", "W", "NB"]
```

**Output:**

```text
[17, 2]
```

**Explanation:**

- `"10"` → Score = `10`
- `"W"` → Wins = `1`
- `"WD"` → Score = `11`
- `"5"` → Score = `16`
- `"W"` → Wins = `2`
- `"NB"` → Score = `17`

Therefore:

```text
[17, 2]
```

---

## Java Solution

```java
class Solution {
    public int[] scoreValidator(String[] events) {
        int[] ans = new int[2];

        int score = 0;
        int counter = 0;

        for (int i = 0; i < events.length; i++) {

            if (events[i].equals("W")) {
                counter++;

                if (counter == 10) {
                    break;
                }
            }
            else if (events[i].equals("WD") || events[i].equals("NB")) {
                score++;
            }
            else {
                int val = Integer.parseInt(events[i]);
                score = score + val;
            }
        }

        ans[0] = score;
        ans[1] = counter;

        return ans;
    }
}
```

---

## Concepts Used

- Arrays
- Strings
- String Comparison
- `equals()` Method
- `Integer.parseInt()`
- Array Traversal
- Conditional Statements
- Counter
- Simulation
