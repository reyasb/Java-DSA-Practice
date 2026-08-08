# 1688. Count of Matches in Tournament

## Problem

Given an integer `n` representing the number of teams in a tournament, calculate the total number of matches played until there is only **one team remaining**.

- If the number of teams is even, every team is paired.
- If the number of teams is odd, one team advances automatically and the remaining teams are paired.

Return the total number of matches played.

---

## Example

**Input:**

```text
n = 7
```

**Output:**

```text
6
```

**Explanation:**

```text
7 teams → 3 matches → 4 teams
4 teams → 2 matches → 2 teams
2 teams → 1 match  → 1 team
```

Total matches:

```text
3 + 2 + 1 = 6
```

---

## Java Solution

```java
class Solution {
    public int numberOfMatches(int n) {
        int team = n;
        int match = 0;
        int res = 0;

        while (team > 1) {
            if (team % 2 == 0) {
                match = team / 2;
                team = team / 2;
            } else {
                match = (team - 1) / 2;
                team = ((team - 1) / 2) + 1;
            }

            res = res + match;
        }

        return res;
    }
}
```

---

## Concepts Used

- Mathematics
- Loops
- Conditional Statements
- Simulation
- Even and Odd Numbers
- Variable Tracking
