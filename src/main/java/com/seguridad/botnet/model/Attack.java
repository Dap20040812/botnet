package com.seguridad.botnet.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "`ATTACK`")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Attack {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String url;

    private boolean isActive;
}
