package emailapp;

class Email {
    private String firtsName;
    private String lastName;
    private String password;
    private String department;
    private String alternateString;

    private int mailboxCapacity;

    public Email(String firstName, String lastName) {
        this.firtsName = firstName;
        this.lastName = lastName;

        System.out.println("EMAIL CREATED :: " + this.firtsName + " " + this.lastName);
    }

    // --- We will ask for department

    // --- generate radnom password

    // --- set mailbox capacity

    // --- set alternate email / change the password
}
