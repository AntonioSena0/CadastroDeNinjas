package dev.java10x.CadastroDeNinjas.Ninjas;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
@AllArgsConstructor
public class NinjaController {

    private final NinjaService service;

    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Essa é a minha primeira mensagem nessa rota";
    }

    // Adicionar Ninja (CREATE)
    @PostMapping("/criar")
    public String criarNinja(){
        return "Ninja criado";
    }

    // Mostrar todos os ninjas (READ)
    @GetMapping("/todos")
    public List<NinjaModel> mostrarTodosOsNinjas(){
        return service.listarNinjas();
    }

    // Mostrar Ninja por ID (READ)
    @GetMapping("/{id}")
    public NinjaModel mostrarNinjaPorId(@PathVariable Long id) {
        return service.listarNinjasPorId(id);
    }

    // Alterar dados dos ninjas (UPDATE)
    @PutMapping("/alterar/{id}")
    public String alterarNinja(@PathVariable Long id) {
        return "Ninja";
    }

    // Deletar ninja (DELETE)
    @DeleteMapping("/deletar/{id}")
    public String deletarNinja(@PathVariable Long id) {
        return "Ninja Deletado";
    }

}