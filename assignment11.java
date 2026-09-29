public class CountVowels {
    public static void main(String[] args) {

        String text = "Hello World";
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' ||
                ch == 'O' || ch == 'U') {

                count++;
            }
        }

        System.out.println("Number of vowels: " + count);
    }
}
