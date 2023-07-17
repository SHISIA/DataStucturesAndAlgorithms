# <b style="color:orange;font-size:40px;">LeetCode challenge</b>
## Valid Parenthesis (Stack (<b style="color:green">Leetcode Easy</b>) Challenge)

[![N|Solid](https://miro.medium.com/v2/resize:fit:1100/format:webp/1*bDaPkfSGUEqaJGYLVyDa4w.png)](https://nodesource.com/products/nsolid)

[Find the problem here]https://leetcode.com/problems/valid-parentheses/

[![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://travis-ci.org/joemccann/dillinger)


<b style="color:whitesmoke;font-size:15px">20. Valid Parentheses
:</b>
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', 
determine if the input string is valid.
## A string is valid if:
- Open brackets must be closed by the same type of brackets.
- Open brackets must be closed in the correct order.
- Every close bracket has a corresponding open bracket of the same type.

## Constraints
>1 <= s.length <= 10<sup>4</sup><br>
>s consists of parentheses only '()[]{}'.

## Example One
Input: s = "()"

Output: true

## Example Two
Input: s = "()[]{}"

Output: true

## Example Three
Input: s = "(]"

Output: false

## Hint
> - Use a stack of characters.
> - When you encounter an opening bracket, push it to the top of the stack.
> - When you encounter a closing bracket, check if the top of the stack was the opening for it. If yes, pop it from the stack. Otherwise, return false.