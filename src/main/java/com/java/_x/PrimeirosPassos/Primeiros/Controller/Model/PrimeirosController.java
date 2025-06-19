package com.java._x.PrimeirosPassos.Primeiros.Controller.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeirosController {
    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Essa a nossa primeira mensagem";
    }
}
