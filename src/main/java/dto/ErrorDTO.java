package dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@Builder
@ToString

public class ErrorDTO {
    int status;
    String error;
    String message;
//    "path": "string"
}
