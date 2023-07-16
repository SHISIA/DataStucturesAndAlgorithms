# <b style="color:orange;font-size:40px;">CoderByte challenge</b>
## LRU Chache (Array Challenge)

[![N|Solid](https://i0.wp.com/itdranik.com/wp-content/uploads/2020/03/caching-feature-image.png?fit=1200%2C469&ssl=1)](https://nodesource.com/products/nsolid)

[![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://travis-ci.org/joemccann/dillinger)

<b style="color:whitesmoke;font-size:15px">ArrayChallenge(strArr):</b> take the array of characters stored in strArr, which will contain characters ranging from A to Z in some arbitrary order, and determine what elements still remain in a virtual cache that can hold up to 5 elements with an LRU cache algorithm implemented. For example: if strArr is ["A", "B", "C", "D", "A", "E", "D", "Z"],
## Then the following steps are taken:
- A does not exist in the cache, so access it and store it in the cache.
- B does not exist in the cache, so access it and store it in the cache as well. So far the cache contains: ["A", "B"].
- Same goes for C, so the cache is now: ["A", "B", "C"].
- Same goes for D, so the cache is now: ["A", "B", "C", "D"].
- Now A is accessed again, but it exists in the cache already so it is brought to the front: ["B", "C", "D", "A"].
- E does not exist in the cache, so access it and store it in the cache: ["B", "C", "D", "A", "E"].
- D is accessed again so it is brought to the front: ["B", "C", "A", "E", "D"].
- Z does not exist in the cache so add it to the front and remove the least recently used element: ["C", "A", "E", "D", "Z"].

>Now the caching steps have been completed and your program should return the order of the cache with the elements joined into a string, separated by a hyphen. Therefore, for the example above your program should return C-A-E-D-Z.

Once your function is working, take the final output string and concatenate it with your ChallengeToken, and then replace every third character with an X.

Your ChallengeToken: t9edj70y31b

## Example One
Input: new String[] {"A", "B", "A", "C", "A", "B"}
Output: C-A-B
Final Output: C-X-BX9eXj7Xy3Xb
## Example Two
Input: new String[] {"A", "B", "C", "D", "E", "D", "Q", "Z", "C"}
Output: E-D-Q-Z-C
Final Output: E-X-QXZ-Xt9XdjX0yX1b