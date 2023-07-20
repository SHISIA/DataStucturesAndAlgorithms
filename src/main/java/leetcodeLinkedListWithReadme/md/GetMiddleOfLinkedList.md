# <b style="color:orange;font-size:40px;">LeetCode challenge</b>
## 141. Linked List Middle Element( LinkedList (<b style="color:green"> Leetcode Easy</b>) Challenge)

[![N|Solid](https://assets.leetcode.com/uploads/2021/07/23/lc-midlist1.jpg)](https://nodesource.com/products/nsolid)

[Find the problem here]https://leetcode.com/problems/middle-of-the-linked-list/

[![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://travis-ci.org/joemccann/dillinger)

<b style="color:whitesmoke;font-size:15px">876. Middle of the Linked List
:</b>
Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.

## Constraints
> - The number of nodes in the list is in the range [1, 100].
> - 1 <= Node.val <= 100


## Example One
<img src="https://assets.leetcode.com/uploads/2021/07/23/lc-midlist1.jpg"/>


- Input: head = [1,2,3,4,5]

- Output: [3,4,5]

- Explanation: The middle node of the list is node 3.

## Example Two
<img src="https://assets.leetcode.com/uploads/2021/07/23/lc-midlist2.jpg"/>


- Input: head = [1,2,3,4,5,6]

- Output: [4,5,6]

- Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.

## Solution:
- Intuition: we use the first and slow pointer method;
 > If the size is an even number, we divide by 2 and get the next of the value, i.e if size is 6, half will be 3 and since we are getting the middle node as 3, we traverse to the Node number 3. If the size is an ODD number , we round off to the next whole number , traverse to the current number and get the next node. i.e if then number of size is 7, 7/2 = 3.5 will be rounded off to 4.0 so we just get the fourth node.
