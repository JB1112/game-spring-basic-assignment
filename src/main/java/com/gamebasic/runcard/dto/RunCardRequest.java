package com.gamebasic.runcard.dto;

import jakarta.validation.constraints.*;
import lombok.Getter;

@Getter
public class RunCardRequest {
    @NotBlank
    private String cardType;
    @Min(0)
    @Max(10)
    private Integer acquiredFloor;
}
