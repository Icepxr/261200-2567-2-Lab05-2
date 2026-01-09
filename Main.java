
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    User John = new User("John",1964,2,18);
    Admin Nicolas = new Admin("Nicolas",1964,1,7);
    Admin Dai = new Admin("Dai",2005,1,9);
    John.displayInfo();
    Nicolas.displayInfo();
    Dai.displayInfo();
    Nicolas.displayInfo(false);
    Dai.displayHappyBirthday();

}
