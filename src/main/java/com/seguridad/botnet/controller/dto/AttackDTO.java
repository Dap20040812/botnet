package com.seguridad.botnet.controller.dto;

import jakarta.annotation.Nonnull;
import lombok.Data;

@Data
public class AttackDTO {

    @Nonnull
    private String url;

    @Nonnull
    private boolean isActive;
}
