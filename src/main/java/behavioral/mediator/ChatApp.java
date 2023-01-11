package behavioral.mediator;



public class ChatApp {

    public static void main(String[] args) {

        Admin admin = new Admin();
        TextChat chat = new TextChat(admin);
        admin.setChat(chat);

        User user = new SimpleUser(chat,"Bob");
        User user1 = new SimpleUser(chat, "Max");

        chat.addUser(user);
        chat.addUser(user1);


        user.sendMessage("Hallo !");
    }


}
