package com.example.wikime;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import com.example.wikime.socket.Socket;
import com.example.wikime.socket.Message.MessageTypes;
import androidx.appcompat.app.AppCompatActivity;
import tech.gusavila92.websocketclient.WebSocketClient;

public class MainActivity extends AppCompatActivity {

    private TextView username, roomId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView username = findViewById(R.id.edittext_username);
        TextView roomId = findViewById(R.id.edittext_room_id);
        Button joinRoom = findViewById(R.id.button_join_room);
        Button createRoom = findViewById(R.id.button_create_room)

        joinRoom.setOnClickListener(view -> {
            String absoluteRoomId = roomId.getText().toString().trim();
            if (absoluteRoomId.isEmpty()) {
                roomId.setError("Please provide room id.");
                return null;
            }
            WebSocketClient socket = new Socket()
            socket.createSocket(absoluteRoomId)

        });
    }
}