package com.seguridad.botnet.service;

import com.seguridad.botnet.model.Attack;
import com.seguridad.botnet.repository.AttackRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AttackService {

    private AttackRepository attackRepository;

    public Attack createAttack(String url, boolean isActive) {

        Attack attack = Attack.builder()
                .url(url)
                .isActive(isActive)
                .build();
        return attackRepository.save(attack);
    }

    public boolean updateAttack(int id,String url, boolean isActive) {
        Attack attack = attackRepository.findById(id).orElseThrow();
        attack.setActive(isActive);
        attack.setUrl(url);
        attackRepository.save(attack);
        return true;
    }

    public boolean stopAttack(int id) {
        Attack attack = attackRepository.findById(id).orElseThrow();
        attack.setActive(false);
        attackRepository.save(attack);
        return true;
    }

    public Attack getAttack(int id) {
        return attackRepository.findById(id).orElseThrow();
    }

}
