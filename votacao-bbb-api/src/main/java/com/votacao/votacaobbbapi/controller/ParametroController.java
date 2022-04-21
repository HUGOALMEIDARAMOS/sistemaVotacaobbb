package com.votacao.votacaobbbapi.controller;

import com.votacao.votacaobbbapi.model.ParametroModel;
import com.votacao.votacaobbbapi.repository.ParametroRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/parametro")
public class ParametroController {

    private final ParametroRepository repository;

    public ParametroController(ParametroRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/save")
    public ResponseEntity<ParametroModel> save(@RequestBody ParametroModel parametro){
       ParametroModel entidade =  repository.save(parametro);
       return  ResponseEntity.ok(entidade);
    }

    @GetMapping("/listAll")
    public ResponseEntity<ParametroModel> consultar(@RequestParam String chave){
        Optional<ParametroModel> optParametro = repository.findById(chave);
        if(optParametro.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(optParametro.get());
    }


}
