public class File2 {
    public static void main(String[] args) {
        int num1 = 9;
        int num2 = 5;
        int sum = num1 + num2;
        int diff = num1 - num2;
        int prod = num1 * num2;
        int quot = num1 / num2;
        int rem = num1 % num2;

        System.out.println(sum);
        System.out.println(diff);
        System.out.println(prod);
        System.out.println(quot);
        System.out.println(rem);

        boolean result1 = num1 > num2;
        boolean result2 = num1 < num2;
        
        System.out.println(result1);
        System.out.println(result2);

        boolean result3 = num1 > num2 && num1 > 0;
        boolean result4 = num1 < num2 || num1 < 0;
        
        System.out.println(result3);
        System.out.println(result4);

        boolean result5 = !(num1>0);
        System.out.println(result5);
        
    }
}
