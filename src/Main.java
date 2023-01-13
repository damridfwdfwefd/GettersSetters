public class Main {
    public static void main(String[] args) {

/*        User tim = new User()
        {tim setFirstN ("tim")
tim.setLastName("Towler")
        System.out.printlin(tim.getFullname());//Tim Towler
            User*/

        User user = new User();
        user.setFirstName("John");
        user.setLastName("Smith");
        System.out.println(user.getFullName());

    }
}