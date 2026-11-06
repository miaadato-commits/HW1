public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]); 
        System.out.println("The first " + x + " Fibonacci numbers are:");
        int first_fibo = 1;
        int second_fibo = 1;
        System.out.print(first_fibo);
        System.out.print(" "); // Make sure we don't print a trailing space
        System.out.print(second_fibo);
        System.out.print(" "); // Make sure we don't print a trailing space

        int numOdd = 2;
        for (int i = 2; i < x; i++) {
            int next_fibo = first_fibo + second_fibo;
            System.out.print(next_fibo);
            if (next_fibo % 2 == 1) {
                numOdd++;
            }
            first_fibo = second_fibo;
            second_fibo = next_fibo;
            if (i < x - 1) 
                System.out.print(" "); // Make sure we don't print a trailing space
        }
        System.out.println();
        
        ////////////////////////////////////////////////////////////////
        
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
