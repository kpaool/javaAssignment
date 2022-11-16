import java.util.HashMap;

public class Enums {

    public static void login() {
        HashMap<String, Integer> subscriptionsTiers = new HashMap<>();
        subscriptionsTiers.put("STARTER", 6);
        subscriptionsTiers.put("GROWER", 12);
        System.out.println(subscriptionsTiers.get(Subscriptions.GROWER.toString()));
    }

    public static void main(String[] args) {
        login();
    }

    public enum Subscriptions {
        STARTER, GROWER
    }

}
