// logic -> extraction of digit 
class revernumberr {
    public int reverseNumber(int n) {
        if (n == 0)
            return 0;

        n = Math.abs(n);
        int reverse = 0;

        while (n > 0) {// till n becames 0 
            int lastdigit = n % 10;
            reverse = reverse * 10 + lastdigit;
            n/=10; // now the n is n.10 becaouse the last digit is removed now , like 234 ->23,4 , now -> 23 then ittration will start on this . 
        }
        return reverse;
    }

    public static void main(String[] args) {
        revernumberr solution = new revernumberr();
    System.out.println(solution.reverseNumber(234));
    }
}