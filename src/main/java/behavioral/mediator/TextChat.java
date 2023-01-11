package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class TextChat implements Chat{

    private Admin admin;

    private List<User> users;

    public TextChat(Admin admin) {
        this.admin = admin;
        this.users = new ArrayList<>();
    }

    public void addUser(User user){
        users.add(user);
    }


    @Override
    public void broadcastMessage(String message, User user) {
        for(User u: users){
            u.getMessage(message);
        }
        admin.getMessage(message);
    }
}
