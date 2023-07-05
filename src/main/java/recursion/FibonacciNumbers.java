package recursion;

/**0,1,1,2,3,5,8,13,21
 *Common Fibonacci Number Formulae = nth num = F(N-1) = F(N-2) + F(N-3)
 * To use recursion, try to break the problem into smaller solvable problems
 * Very Inefficient for large numbers like 50**/
public class FibonacciNumbers {

    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        System.out.println(fibo(50));
        System.out.println(System.currentTimeMillis());

    }

    static int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
