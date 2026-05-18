# Nodes at Odd Levels | Practice | GeeksforGeeks

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen)

---

## Topics

- Tree
- Data Structures

---

## Problem Link

https://www.geeksforgeeks.org/problems/nodes-at-odd-levels/1

---

## Problem Statement

Given a binary tree, find all the nodes at odd levels. Return in sorted order. The root is considered at level 1.

Examples:

Input: root = [1, 2, 3, 4, 5, N, 6, N, N, 7, 8, 9]
          1
       /     \
      2       3
    /   \       \
   4     5       6
        /  \     /
       7    8   9
Output:  [1, 4, 5, 6]
Explanation: The odd levels are 1 and 3 and thier node are 1 and 4 5 6 respectively. 
Input: root = [1, 2, 3, 4, 5, N, 6, N, N, 7, 8, 9]
          1
       /     \
     2        3
   /   \    /   \
  4     5  6     7 
Output: [1, 4, 5, 6, 7]
Explanation: The odd levels are 1 and 3 and thier node are 1 and 4 5 6 7 respectively. 
Input: root = [1, 2, 3, 4, 5, 8, 7]
          1
       /     \
     2        3
   /   \    /   \
  4     5  8     7
Output: [1, 4, 5, 7, 8]
Explanation: The odd levels are 1 and 3 and thier node are 1 and 4 5 8 7 respectively. 

Constraints:
1 <= number of nodes <= 103
1 <= node->data <= 103

---

## Language

java

---

Powered by SyncLeetX ⚡
