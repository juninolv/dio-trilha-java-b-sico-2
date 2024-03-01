public enum Message {
    INPUT_EXCEPTION("\nOnly integers are allowed!\nClosing..."),
    PARAMETERS_EXCEPTION("\nFirst number must be smaller than second!\nClosing...");

    private final String message;

    Message(String message) {
        this.message = message;
    }

    public String get() {
        return message;
    }
}
