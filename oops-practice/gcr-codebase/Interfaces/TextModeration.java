interface TextModeration {

    // Abstract method
    boolean isOffensive(String post);

    // Default method
    default void displayModerationPolicy() {
        System.out.println("Policy: Offensive content is prohibited.");
    }

    // Static method
    static boolean containsRestrictedWords(String post) {
        String lower = post.toLowerCase();
        return lower.contains("hate") || lower.contains("abuse") || lower.contains("violence");
    }
}

interface SpamDetection {

    // Abstract method
    boolean isSpam(String post);

    // Default method
    default void displayModerationPolicy() {
        System.out.println("Policy: Spam content is prohibited.");
    }
}

class ContentModerator implements TextModeration, SpamDetection {

    @Override
    public boolean isOffensive(String post) {
        return TextModeration.containsRestrictedWords(post);
    }

    @Override
    public boolean isSpam(String post) {
        String lower = post.toLowerCase();
        return lower.contains("buy now") ||
               lower.contains("click here") ||
               lower.contains("free money");
    }

    // Resolve default method conflict
    @Override
    public void displayModerationPolicy() {
        TextModeration.super.displayModerationPolicy();
        SpamDetection.super.displayModerationPolicy();
    }
}

