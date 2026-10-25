package fundamentals.day02;

public class LoginChecker {
    public static void main(String[] args) {
        int loginCode = 1234;
        int passwordCode = 5678;
        if(loginCode == 1234 && passwordCode == 5678) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }

    }
}
