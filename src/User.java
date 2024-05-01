public class User {
    String username = "Kelechi";
    String password = "Password";
    String login() {
        if (username.equals("Kelechi") && password.equals("Password")) {
            return "Logged in";
        } else{
            return "Failed";
        }
    }
    public static void main(String[]args) {
        User Jane = new User();
        System.out.println(Jane.login());
    }
}