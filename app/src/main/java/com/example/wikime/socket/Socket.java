package com.example.wikime.socket;

import android.util.Log;

import java.net.URI;
import java.net.URISyntaxException;

import tech.gusavila92.websocketclient.WebSocketClient;

public class Socket {

    private final String BASE_URL = "http://127.0.0.1:8000/";

    public WebSocketClient createSocket(String route) {
        URI uri;
        try {
            uri = new URI(BASE_URL + route);
        } catch (URISyntaxException e) {
            e.printStackTrace();
            return null;
        }

        WebSocketClient webSocketClient = new WebSocketClient(uri) {
            @Override
            public void onOpen() {
            }

            @Override
            public void onTextReceived(String s) {
            }

            @Override
            public void onBinaryReceived(byte[] data) {

            }

            @Override
            public void onPingReceived(byte[] data) {

            }

            @Override
            public void onPongReceived(byte[] data) {

            }

            @Override
            public void onException(Exception e) {
                System.out.println(e.getMessage());
            }

            @Override
            public void onCloseReceived() {
                Log.i("WebSocket", "Closed ");
                System.out.println("onCloseReceived");
            }
        };
        initSocketConnection(webSocketClient);
        return webSocketClient;
    }

    private void initSocketConnection(WebSocketClient webSocketClient) {
        webSocketClient.setConnectTimeout(10000);
        webSocketClient.setReadTimeout(60000);
        webSocketClient.enableAutomaticReconnection(5000);
        webSocketClient.connect();
    }
}
