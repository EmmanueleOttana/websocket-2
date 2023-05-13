package co.develhope.websocket2.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MessageDTO {

    private String mittente;
    private String tipo;
    private String messaggio;

}