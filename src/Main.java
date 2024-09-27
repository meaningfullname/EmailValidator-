//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        User user =new User("Alice","adfa@gmail.com");
        EmailValidator emailValidator =new EmailValidator();
        if(emailValidator.isValid(user.getEmail())){
            System.out.println(user.getName()+"'s email is valid");
        }else {
            System.out.println(user.getName()+"'s email is invalid");
        }
    }
}