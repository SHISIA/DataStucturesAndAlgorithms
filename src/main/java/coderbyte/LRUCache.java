package coderbyte;

/**
 *<b style="font-size:25;color:orange;">Question<br></b>
 * Have the function ArrayChallenge(strArr)
 * take the array of characters stored in strArr,
 * which will contain characters ranging from A to Z in some arbitrary order,
 * and determine what elements still remain in a virtual cache that can hold up to 5
 * elements with an LRU cache algorithm implemented.
 * For example: if strArr is ["A", "B", "C", "D", "A", "E", "D", "Z"],
 * then the following steps are taken:
 * <br><b>
 *  <br><br>(1) A does not exist in the cache, so access it and store it in the cache.
 *  <br><br>(2) B does not exist in the cache, so access it and store it in the cache as well.
 *  <br><br>So far the cache contains: ["A", "B"].
 *  <br><br>(3) Same goes for C, so the cache is now: ["A", "B", "C"].
 *  <br><br>(4) Same goes for D, so the cache is now: ["A", "B", "C", "D"].
 *  <br><br>(5) Now A is accessed again,
 *  <br><br>but it exists in the cache already so it is brought to the front: ["B", "C", "D", "A"].
 *  <br><br>(6) E does not exist in the cache, so access it and store it in the cache: ["B", "C", "D", "A", "E"].
 *  <br><br>(7) D is accessed again so it is brought to the front: ["B", "C", "A", "E", "D"].
 *  <br><br>(8) Z does not exist in the cache so add it to the front and
 *  <br><br>remove the least recently used element: ["C", "A", "E", "D", "Z"].<br>
 * </b>

 * Now the caching steps have been completed and your program should
 * return the order of the cache with the elements joined into a string,
 * separated by a hyphen. Therefore, for the example above your program should return C-A-E-D-Z.
 * <b style="font-size:30;color:orange;"><br>Array Challenge</b>
 * <br>
 * <b>This is a question I was asked from <b style="font-size:20;color:orange;">CoderByte</b> during an interview</b>
**<br>Once your function is working,
 *  take the final output string and concatenate
 *  it with your ChallengeToken, and then replace every third character with an X.
 Your ChallengeToken: t9edj70y31b**/
public class LRUCache {

}
