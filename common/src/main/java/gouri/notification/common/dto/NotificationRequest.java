package gouri.notification.common.dto;

import gouri.notification.common.enums.ChannelType;
import gouri.notification.common.enums.MessageType;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Data
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class NotificationRequest {
    private String clientId;
    private String userId;
    private ChannelType channelType;
    private String recipient;

    @NotBlank
    private String content;
    private MessageType messageType;
}
