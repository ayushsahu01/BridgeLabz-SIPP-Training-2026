interface TextModeration {

    void checkOffensiveContent(String post);

    default void displayModerationPolicy() {
        System.out.println("Policy: Offensive content is not allowed.");
    }

    static boolean containsRestrictedWords(String post) {
        String text = post.toLowerCase();
        return text.contains("hate") || text.contains("abuse") || text.contains("bad");
    }
}

interface SpamDetection {

    void checkSpam(String post);

    default void displayModerationPolicy() {
        System.out.println("Policy: Spam messages are not allowed.");
    }
}

class ContentModerator implements TextModeration, SpamDetection {

    @Override
    public void checkOffensiveContent(String post) {
        if (TextModeration.containsRestrictedWords(post)) {
            System.out.println("Offensive Post: " + post);
        }
    }

    @Override
    public void checkSpam(String post) {
        if (post.toLowerCase().contains("buy now") ||
            post.toLowerCase().contains("click here")) {
            System.out.println("Spam Post: " + post);
        }
    }

    @Override
    public void displayModerationPolicy() {
        TextModeration.super.displayModerationPolicy();
        SpamDetection.super.displayModerationPolicy();
    }
}

public class AIBasedContent {
    public static void main(String[] args) {

        String[] posts = {
            "Buy now and get 50% discount!",
            "I hate this product.",
            "Have a nice day everyone!",
            "Click here to win prizes!",
            "This is a bad service."
        };

        ContentModerator moderator = new ContentModerator();

        moderator.displayModerationPolicy();
        System.out.println();

        for (String post : posts) {

            if (post.toLowerCase().contains("buy now") ||
                post.toLowerCase().contains("click here")) {

                moderator.checkSpam(post);

            } else if (TextModeration.containsRestrictedWords(post)) {

                moderator.checkOffensiveContent(post);

            } else {

                System.out.println("Valid Post: " + post);
            }
        }
    }
}