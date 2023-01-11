package behavioral.mediator;

public class SimpleUser implements User{
    private Chat chat;
    private String name;

    public SimpleUser(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    @Override
    public void sendMessage(String message) {
        chat.broadcastMessage(message,this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("user " + name + " got message: " + message);
    }
}
