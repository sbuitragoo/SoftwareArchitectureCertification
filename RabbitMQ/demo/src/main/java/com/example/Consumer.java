package com.example;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.DeliverCallback;

public class Consumer {

    public static void main(String[] args) {

        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");

        try
        {
            Connection connection = factory.newConnection();
            Channel channel = connection.createChannel();
            channel.queueDeclare("hello", false, false, false, null);

            DeliverCallback deliverCallback = (consumerTag, delivery) -> {
                String message = new String(delivery.getBody(), "UTF-8");
                System.err.println(" [x] Received '" + message + "'");

            };

            channel.basicConsume("hello", true, deliverCallback, consumerTag -> { });

            System.out.println(" [*] Waiting for messages. To exit press Ctrl+C");
            

        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }  
}
