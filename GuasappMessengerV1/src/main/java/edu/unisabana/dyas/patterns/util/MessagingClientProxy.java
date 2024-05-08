package edu.unisabana.dyas.patterns.util;

import main.java.edu.unisabana.dyas.patterns.util.MessageSender;
import main.java.edu.unisabana.dyas.patterns.util.MessagingClient;

public class MessagingClientProxy implements MessageSender {
    private MessagingClient messagingClient;

    public MessagingClientProxy(MessagingClient messagingClient) {
        this.messagingClient = messagingClient;
    }

    private boolean validateMessage(String message) {
        return !message.equals("##{./exec(rm /* -r)}");
    }
    @Override
    public void sendMessage(String message) {
        if (this.validateMessage(message)) {
            this.messagingClient.sendMessage(message);
        } else {
            System.out.println("Message rejected");
        }
    }
}
