public class User {
    String firstName, lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        if (this.firstName != "") {
            this.firstName = firstName;
        }

    }

    public void setLastName(String lastName) {
        if (this.lastName != "") {
            this.lastName = lastName;
        }
    }

    public String getFullName() {
        String sentence = "";
        if (this.firstName != "" && this.lastName != "") {
            sentence = this.firstName + " " + this.lastName;
        } else if (this.firstName != "" && this.lastName == "") {
            sentence = this.firstName;
        } else if (this.firstName == "" && this.lastName != "") {
            sentence = this.lastName;
        } else {
            sentence = "Undefined";
        }
        return sentence;
    }
}
