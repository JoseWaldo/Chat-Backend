package learningsb.chatws.controller;

import learningsb.chatws.model.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class MessageController {
    @MessageMapping("/envio")
    @SendTo("/tema/mensaje")
    public Message sendMessage(Message message) {
        return new Message(message.nombre(), message.contenido());
    }
}
