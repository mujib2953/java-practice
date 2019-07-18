package emailapp;

public class EmailApp {
    public static void main(String... args) {

        Email em1 = new Email("John", "Doe");

        em1.setAlternateEmail("js@gmail.com");
        System.out.println("\nAlternate email :: " + em1.getAlternateEmail());

        System.out.println("\nMailbox capacity :: " + em1.getMailboxCapacity());
        em1.setMailboxCapacity(200);
        System.out.println("Mailbox capacity :: " + em1.getMailboxCapacity());

        em1.changePassword("Test123");
        System.out.println("\nNew password :: " + em1.getPassword());
    }
}
