package com.example.wikime.socket;

public class Message {

    String message_type, message;
    WikiPage wiki_start_point, wiki_endpoint;

    public String getMessage_type() {
        return message_type;
    }

    public String getMessage() {
        return message;
    }

    public WikiPage getWiki_start_point() {
        return wiki_start_point;
    }

    public WikiPage getWiki_endpoint() {
        return wiki_endpoint;
    }

    private class WikiPage {

        String url, article;

        public String getUrl() {
            return url;
        }

        public String getArticle() {
            return article;
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