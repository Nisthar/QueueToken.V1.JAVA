package com.queue_it.queuetoken;

public class Token {

    public static EnqueueTokenGenerator enqueue(String customerId) {
        return new EnqueueTokenGenerator(customerId);
    }
}
