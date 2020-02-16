package services;

import models.Message;

import java.util.ArrayList;
import java.util.List;

public class MessageService {


    public Message[] getMessages() {
        return new Message[] {
                new Message(0, "m1", "usr1"),
                new Message(1, "m2", "usr2"),
                new Message(2, "m3", "usr3")
        };
    }

}
