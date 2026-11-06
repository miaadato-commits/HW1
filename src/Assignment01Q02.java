public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;
        int total = Integer.parseInt(args[0]);
        boolean isPlus = true;
        int toDivide = 1;
        for(int i=1; i <=total; i++) {
            if (isPlus) {
                approxPi += 1.0/(toDivide);
                isPlus = false;
            }
            else {
                 approxPi -= 1.0/(toDivide);
                 isPlus = true;
            }
            toDivide += 2;
        }
        approxPi = approxPi * 4;
        System.out.println(approxPi + " " + actualPi);
    }
}
