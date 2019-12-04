package gnf.sender;

import org.springframework.integration.annotation.Gateway;

public interface SenderService {
 
    @Gateway(requestChannel = "resSenderChannel")
    public void send(String s);
}