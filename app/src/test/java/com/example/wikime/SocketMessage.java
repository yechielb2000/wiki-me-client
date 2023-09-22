package com.example.wikime;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import com.example.wikime.socket.Message.MessageTypes;

class SocketMessage {
    @Test
    public void messageTypesValidator() {
        String message = MessageTypes.MESSAGE;
    }
}
