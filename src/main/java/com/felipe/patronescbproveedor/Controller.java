package com.felipe.patronescbproveedor;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

    @CrossOrigin(origins = "*")
    @GetMapping("/notificar")
    public String notificar() {
        return ISOTimeGenerator.getTime();
    }
}
