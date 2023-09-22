package com.example.wikime.socket;

public class Message {

    public enum Test {
        LOL, LOLO;

        @Override
        public String toString() {
            return this.getClass().getName().toLowerCase()
        }
    }

    public enum MessageTypes {
        WIN {
            public String toString() {

                return "win";
            }
        },

        PLAY {
            public String toString() {
                return "play";
            }
        },

        SYSTEM {
            public String toString() {
                return "system";
            }
        },
        MESSAGE {
            public String toString() {
                return "message";
            }
        },
        DISCONNECT_ALL {
            public String toString() {
                return "disconnect_all";
            }
        },
        DISCONNECT {
            public String toString() {
                return "disconnect";
            }
        },
        REMOVE {
            public String toString() {
                return "remove";
            }
        },
        ERRROR {
            public String toString() {
                return "error";
            }
        }
    }


}