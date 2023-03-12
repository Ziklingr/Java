package com.karpinmaa.loppu;

import java.util.List;
import java.util.ArrayList;

//oleellinen lopputyöhon

public class userRegister {
    private List<user> users = new ArrayList<>();

    public void addUser(user user) {
        users.add(user);
    }

    public void removeUser(user user) {
        users.remove(user);
    }

    public List<user> searchUser(String keyword) {
        List<user> result = new ArrayList<>();
        
        for (user canditat : users) {
            if (canditat.getName().contains(keyword)) {
                result.add(canditat);
            }
        }

        return result;
    }

    public List<user> getUsers() {
        return this.users;
    }
}
