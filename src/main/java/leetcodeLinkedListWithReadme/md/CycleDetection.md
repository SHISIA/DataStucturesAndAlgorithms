# <b style="color:orange;font-size:40px;">LeetCode challenge</b>
## 141. Linked List Cycle (LinkedList (<b style="color:green">Leetcode Easy</b>) Challenge)

[![N|Solid](https://miro.medium.com/v2/resize:fit:1100/format:webp/1*bDaPkfSGUEqaJGYLVyDa4w.png)](https://nodesource.com/products/nsolid)

[Find the problem here]https://leetcode.com/problems/linked-list-cycle/

[![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://travis-ci.org/joemccann/dillinger)

<b style="color:whitesmoke;font-size:15px">141. Linked List Cycle
:</b>
Given head, the head of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.

Return true if there is a cycle in the linked list. Otherwise, return false.

## Constraints
> - The number of nodes in the list is in the range [0, 300].
> - -100 <= Node.val <= 100
> - The list is guaranteed to be sorted in ascending order.

## Example One
<img src="https://assets.leetcode.com/uploads/2018/12/07/circularlinkedlist.png"/>


Input: head = [3,2,0,-4], pos = 1

Output: true

Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).

## Example Two
<img src="https://assets.leetcode.com/uploads/2018/12/07/circularlinkedlist_test2.png"/>


Input: head = [1,2], pos = 0

Output: true

Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.

## Example Three
<img src="https://assets.leetcode.com/uploads/2018/12/07/circularlinkedlist_test3.png"/>

Input: head = [1], pos = -1

Output: false

Explanation: There is no cycle in the linked list.

## Solution:
- Intuition: we use the first and slow pointer method;
 > if we are moving through a linkedlist that has a cycle in it, that means at a certain point, the tow pointers will point to the same node.
The intuition here , for example, if i and my friend are running around a circle and I am running at twice the speed of my friend i.e myFriendSpeed=X and mySpeed = 2x, 
 that means that at a certain time at a certain point, I will overtake my friend.But before I overtake him, I will reach his position where we will be equal in position before I pass him. Same intuition is 
 what I mean by slow and fast pointer. My friend am the slow pointer and I am the fast pointer;
- The slow pointer method is where one if the pointers moves normally as
we traverse the linkedlist, one by one, i.e 
 > Node slow = head; slow=slow.next;
- The fast pointer moves two steps per move as it traverses the linkedlist. i.e
 > Node fast = head; fast=fast.next.next;