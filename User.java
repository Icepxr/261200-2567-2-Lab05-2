import java.time.LocalDate;
public class User {
    protected String name = null;
    protected LocalDate dob;
    public User(){
        this.name = null;
        this.dob = LocalDate.now();
    }
    public User(String name,int  year,int month,int date){
        this.name = name;
        this.dob = LocalDate.of(year,month,date);
    }
    protected void displayInfo(){
        System.out.println(name + " was born on "+dob );
    }
    public boolean isBirthday(){
        return this.dob.getDayOfMonth() == LocalDate.now().getDayOfMonth() && this.dob.getMonth() == LocalDate.now().getMonth();
    }
    public void displayHappyBirthday() {
        if(isBirthday())
            System.out.println("Happy birthday " + this.name + "!");
    }
}
