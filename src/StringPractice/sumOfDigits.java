package StringPractice;

public class sumOfDigits {
    public static void main(String[] args) {
        String s = "ab12cd3e4f";
        char[] a = s.toCharArray();
        int sum = 0;

        for(int i = 0; i < a.length - 1; ++i) {
            if (Character.isDigit(a[i])) {
                String sb = Character.toString(a[i]);
                int ab = Integer.parseInt(sb);
                sum += ab;
            }
        }

        System.out.println(sum);
    }
}
