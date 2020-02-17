package database;

import models.Message;
import models.Profile;

import java.util.HashMap;
import java.util.Map;

public class Database {

    private static Map<Long, Message> messageMap = new HashMap<>();
    private static Map<Long, Profile> profileMap = new HashMap<>();

    public static Map<Long, Message> getMessages() {
        return messageMap;
    }

    public static Map<Long, Profile> getProfiles() {
        return profileMap;
    }

}
