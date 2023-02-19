package com.example.databasepostgres.exceptions;


import java.util.List;
import java.util.Map;

public class AppException extends RuntimeException {
    private static final String GENERAL_MESSAGE = "An error occurred in processing your request. Please contact the system administrator.";
    private List<String> messages;
    private Map<String, String> messagesMap;

    public AppException() {
        super("An error occurred in processing your request. Please contact the system administrator.");
    }

    public AppException(String message) {
        super(message);
    }

    public AppException(String message, Throwable cause) {
        super(message, cause);
    }

    public AppException(List<String> messages) {
        this.messages = messages;
    }

    public AppException(Map<String, String> messagesMap) {
        this.messagesMap = messagesMap;
    }

    public List<String> getMessages() {
        return this.messages;
    }

    public Map<String, String> getMessagesMap() {
        return this.messagesMap;
    }

    public static String getGeneralMessage() {
        return "An error occurred in processing your request. Please contact the system administrator.";
    }
}
