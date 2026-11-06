public class Assignment01Q01 {
    public static void main(String[] args) {
        for (String str : args) {
            char ch = str.charAt(0);
            int ch_ascii = (int) ch;
            if (ch_ascii % 5 == 0) {
                System.out.println(ch);
            }
        }
    }
}
