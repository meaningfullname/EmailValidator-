//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1:");
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        User user =new User("Alice","adfa@gmail.com");
        EmailValidator emailValidator =new EmailValidator();
        if(emailValidator.isValid(user.getEmail())){
            System.out.println(user.getName()+"'s email is valid");
        }else {
            System.out.println(user.getName()+"'s email is invalid");
        }
        System.out.println("Task 2:");

        Shape rectangle = new Rectangle(5, 3);
        Shape circle = new Circle(4);

        System.out.println("Rectangle area: " + rectangle.area());
        System.out.println("Circle area: " + circle.area());

        System.out.println("Task 3:");
        Bird sparrow = new Sparrow();
        if (sparrow instanceof Flyable) {
            ((Flyable) sparrow).fly();
        }

        Bird penguin = new Penguins();
        penguin.eat();

        System.out.println("Task 4:");
        Workable humanWorker = new HumanWorker();
        Workable robotWorker = new RobotWorker();

        humanWorker.work();
        ((Eatable) humanWorker).eat();

        robotWorker.work();

        System.out.println("Task 5:");

        Switchable light = new Light();
        Button button = new Button(light);

        // Press the button to turn the light ON
        button.press();  // Output: "Light is ON."

        // Press the button again to turn the light OFF
        button.press();  // Output: "Light is OFF."

    }
    }
