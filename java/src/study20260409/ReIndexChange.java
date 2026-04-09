package study20260409;
/*


 */
public class ReIndexChange {
    public static void main(String[] args) {
        String my_string = "hello";
        String result = "";
        char[] alphabet = my_string.toCharArray();
        int num1 = 1;
        int num2 = 2;
        char temp = alphabet[num1];
        alphabet[num1] = alphabet[num2];
        alphabet[num2] = temp;
        result = String.valueOf(alphabet);
        System.out.println(result);

    }
}
