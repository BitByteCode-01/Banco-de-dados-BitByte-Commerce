package br.com.BitByte.Commerce.API.controllers;


import br.com.BitByte.Commerce.API.models.EmpresasCadastradas;
import br.com.BitByte.Commerce.API.repository.EmpresasCadastradasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
@RestController
@CrossOrigin
@RequestMapping("/Empresas")
public class EmpresasCadastradasController {
    @Autowired
    private EmpresasCadastradasRepository empresasCadastradasRepository;

    @GetMapping("/")
public List <EmpresasCadastradas>
encontrarTodosOsRegistros(){
        return empresasCadastradasRepository.findAll();
    }
    @PostMapping(value = "/salvar",produces="application/json")
    public EmpresasCadastradas create(@RequestBody EmpresasCadastradas dados){
return empresasCadastradasRepository.save(dados);


    }
}
