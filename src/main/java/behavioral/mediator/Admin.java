package behavioral.mediator;

public class Admin  implements User{

    private Chat chat;


    public void setChat(Chat chat){
        this.chat = chat;
    }

    @Override
    public void sendMessage(String message) {
        chat.broadcastMessage(message,this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("Admin  got message: "+ message);

    }
}
