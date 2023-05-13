package co.develhope.websocket2.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class ClientMessageDTO {

    String nomeCliente;
    String clientAlert;
    String clientMsg;

}