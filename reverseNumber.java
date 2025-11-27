// logic -> extraction of digit 
// time complexity = log10(n) -> if any division is hapen with log1,lo2,logn , then it will became logn(n)
import java.util.*;
class revernumberr {
    public int reverseNumber(int n) {
        if (n == 0)
            return 0;

        n = Math.abs(n);
        int reverse = 0;

        while (n > 0) {// till n becames 0 
            int lastdigit = n % 10;
        
            reverse = reverse * 10 + lastdigit; // this is concatination not addition 
            n/=10; // now the n is n.10 becaouse the last digit is removed now , like 234 ->23,4 , now -> 23 then ittration will start on this . 
        }
        return reverse;
    }

    public static void main(String[] args) {
        revernumberr solution = new revernumberr();
    System.out.println(solution.reverseNumber(234));
    }
}