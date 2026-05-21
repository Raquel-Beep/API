package org.serratec.raquel.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/preferenciaacessibilidade")
    
    public class PreferenciaacessibilidadeController {

        @postmapping 
        public ResponseEntity<String> criarPreferenciaAcessibilidade(@Valid @RequestBody PreferenciaAcessibilidade preferencia) {
            
            return ResponseEntity
            
                .status(HttpStatus.CREATED)
                .body("Preferência de acessibilidade criada com sucesso para o participante: " + preferencia.getParticipante().getNome());
        }
        

    
}
