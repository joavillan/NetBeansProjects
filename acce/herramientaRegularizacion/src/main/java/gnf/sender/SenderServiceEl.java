package gnf.sender;

import org.springframework.integration.annotation.Gateway;

public interface SenderServiceEl {

	@Gateway(requestChannel = "resSenderChannelEl")
    public void send(String s);
}
