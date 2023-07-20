# <b style="color:orange;font-size:40px;">LeetCode challenge</b>
## 142. Linked List Cycle II (<b style="color:green">Leetcode </b> <b style="color:orange">Medium</b>) Challenge)

[//]: # ([![N|Solid]&#40;https://www.freecodecamp.org/news/content/images/size/w2000/2020/05/excel-1-1.jpg&#41;]&#40;https://nodesource.com/products/nsolid&#41;)
[![N|Solid](https://i.stack.imgur.com/TQoyH.png)](https://nodesource.com/products/nsolid)

[Find the problem here]https://leetcode.com/problems/linked-list-cycle-ii/

[![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://travis-ci.org/joemccann/dillinger)

<b style="color:whitesmoke;font-size:15px">142. Linked List Cycle II
:</b>
Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.
There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to (0-indexed). It is -1 if there is no cycle. Note that pos is not passed as a parameter.
Do not modify the linked list.

## Constraints
> - The number of the nodes in the list is in the range [0, 10<sup>4</sup>].
> - -10<sup>5</sup> <= Node.val <= 10<sup>5</sup>
> - pos is -1 or a valid index in the linked-list.

## Example One
- Input: head = [3,2,0,-4], pos = 1
- Output: tail connects to node index 1
- Explanation: There is a cycle in the linked list, 
where tail connects to the second node.

## Example Two
- Input: head = [1], pos = -1
- Output: no cycle
- Explanation: There is no cycle in the linked list.

## Example Three
- Input: head = [1,2], pos = 0
- Output: tail connects to node index 0
- Explanation: There is a cycle in the linked list, where tail connects to the first node.
## Intuition (Thought Process):
<!-- Describe your first thoughts on how to solve this problem. -->
- Each node will be revisited as soon as the tail is reached if indeed a cycle exists, 
- if not, we will reach the end of the linkedlist so we return null since no cycle exists

# Approach
<!-- Describe your approach to solving the problem. -->
> - If the linkedlist has a Cycle in it, that means an element will be revisited. For example , for [1,2,3,4,5]
if the cycle is at element 3 where the tail points to, then that means 3 will be the first element to be revisited before the others, so we do not need to visit the others, hence node with value 3 is our answer.
> - To do this , while we are moving we add the nodes to our Set of ListNodes and keep checking if a similar node exists, if it does, that is the beginning of our cycle.