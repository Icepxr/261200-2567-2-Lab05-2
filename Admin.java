import java.time.LocalDate;
import java.time.LocalDateTime;

public class Admin extends User {
    public Admin(){
        super();
    }
    public Admin(String name, int year, int month, int date) {
        super(name, year, month, date);
    }
    @Override
    protected void displayInfo() {
        System.out.print("[User type: admin] ");
        super.displayInfo();
    }
    @Override
    public void displayHappyBirthday() {
        int age = LocalDateTime.now().getYear() - this.dob.getYear();
        if(isBirthday()) {
            System.out.println("Happy birthday " + this.name + "! You are " + age + "!");
        }
    }


    public void displayInfo(boolean full) {
        if(full) {
            this.displayInfo();
            System.out.println("Today's date: " + LocalDate.now());
        } else {
            System.out.println(name);
        }
    }
}
