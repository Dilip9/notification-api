package gouri.notification.common.dto;

import gouri.notification.common.enums.ChannelType;
import gouri.notification.common.enums.MessageType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.nio.channels.Channel;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EnrichedNotificationEvent {

    private String userId;
    private ChannelType channelType;
    private String recipient;
    private String content;
    private MessageType messageType;

}
