package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/missoes")
public class MissaoController {

    @PostMapping("/criar")
    public String criarMissao(){
        return "Missão criada";
    }

    @GetMapping("/listar")
    public String mostrarTodasAsMissoes(){
        return "Missões";
    }

    @GetMapping("/{id}")
    public String mostrarMissaoPorId(@PathVariable Long id){
        return "Missão";
    }

    @PutMapping("atualizar/{id}")
    public String alterarMissao(@PathVariable Long id){
        return "Missão Alterada";
    }

    @DeleteMapping("deletar/{id}")
    public String deletarMissao(@PathVariable Long id){
        return "Missão deletada";
    }

}
