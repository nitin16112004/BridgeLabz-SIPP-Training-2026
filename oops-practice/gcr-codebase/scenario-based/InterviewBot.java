class InterviewBot {
    // Instance variables
    String botName;
    String technology;

    // Constructor with same parameter names
    InterviewBot(String botName, String technology) {
        this.botName = botName;       // using this keyword
        this.technology = technology;
    }

    // Method to conduct interview
    void conductInterview() {
        System.out.println(botName +
                " is conducting an interview for " +
                technology + " technology.");
    }
}

