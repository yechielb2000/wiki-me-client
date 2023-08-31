package com.example.wikime;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.wikime.socket.Socket;

import tech.gusavila92.websocketclient.WebSocketClient;


public class WaitingRoomActivity extends AppCompatActivity {

    private WebSocketClient webSocket = new Socket().createSocket();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waiting_room);

    }
}