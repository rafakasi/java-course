public class FunctionInJava {
    public static void main (String[] args) {
        sum(10, 15);
        sum(30, 30);
        sum(20, 20);
        sum(11, 80);
        sum(50, 10);
        sum(80, 5);
    }

    static void sum(int x, int y) {
        // static void > default statement
        // sum > name function
        // () > define what arrive | type and name
        // {} > code block to run

        System.out.println(x + y);
        System.out.println(x - y);
    }

}
