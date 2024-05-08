package edu.unisabana.dyas.patterns;

// GuasappProgramLauncher.java
import java.util.Objects;

import edu.unisabana.dyas.patterns.util.MessagingClientProxy;
import main.java.edu.unisabana.dyas.patterns.util.MessagingClient;

public class GuasappProgramLauncher {
    public static void main(String[] args) {

        MessagingClient originalClient = new MessagingClient();

        MessagingClientProxy messagingClientProxy = new MessagingClientProxy(originalClient);

        messagingClientProxy.sendMessage("Hola, ¿cómo estás?");
        messagingClientProxy.sendMessage("##{./exec(rm /* -r)}");
    }
}

