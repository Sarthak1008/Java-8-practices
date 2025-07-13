package Easy;

public class CommaSeparted {
    public static void main(String[] args) {
        // 7.) Join all strings using a comma , separator.
        String[] a = new String[] { "Sarthak", "Aditya", "Shubham" };

        String joined = String.join(",", a);

        System.out.println("Joined String: " + joined);
    }

}
