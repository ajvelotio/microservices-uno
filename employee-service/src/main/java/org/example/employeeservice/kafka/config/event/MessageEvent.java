package org.example.employeeservice.kafka.config.event;

public class MessageEvent {

    private String id;
    private String message;

    public MessageEvent() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
