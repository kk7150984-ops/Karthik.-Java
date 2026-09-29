public class Main {

    // Recursive method for Fibonacci
    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {

        // Split and rebuild a sentence
        String sentence = "Java is a programming language";

        String[] words = sentence.split(" ");

        System.out.println("Words:");
        for (String word : words) {
            System.out.println(word);
        }

        System.out.println("\nNew format:");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }

        // Fibonacci series
        int n = 10;

        System.out.println("\n\nFibonacci Series:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
