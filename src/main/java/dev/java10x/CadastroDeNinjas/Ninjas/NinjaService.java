package dev.java10x.CadastroDeNinjas.Ninjas;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class NinjaService {

    // Injeção de dependência
    private final NinjaRepository repository;

    // Listar todos os meus ninjas
    public List<NinjaModel> listarNinjas() {
        return repository.findAll();
    }

}
