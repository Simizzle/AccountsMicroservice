package com.simonmorgan.Accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@Schema(
        name = "Response",
        description = "Schema to hold error response information"
)
public class ErrorResponseDto {

    @Schema(
            description = "API path invoked by client")
    private String apiPath;

    @Schema(
            description = "Error code representing the type of error")
    private HttpStatus errorCode;

    @Schema(
            description = "Message returned from error")
    private String errorMessage;

    @Schema(
            description = "TimeStamp error occurred")
    private LocalDateTime errorTime;
}
