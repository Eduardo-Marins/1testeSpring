package com.APIsimples.Licao1.controller;

// Importa a classe Usuario para que possamos utilizá-la.
import com.APIsimples.Licao1.model.Usuario;

// Importa as anotações do Spring para criar endpoints REST.
import org.springframework.web.bind.annotation.*;

// Importa ArrayList e List do Java.
import java.util.ArrayList;
import java.util.List;

// Diz ao Spring que esta classe é um Controller REST.
// Todos os retornos dos métodos serão enviados diretamente como resposta HTTP.
@RestController

// Define a rota base da classe.
// Todos os endpoints começarão com /usuarios.
@RequestMapping("/usuarios")
public class UsuarioController {

    // Lista que armazenará os usuários em memória.
    // Enquanto a aplicação estiver rodando os dados existirão.
    // Ao reiniciar o programa a lista será apagada.
    public List<Usuario> usuarioList = new ArrayList<>();

    private Integer idCounter = 1;
    // Endpoint POST.
    // Será executado quando alguém fizer:
    // POST http://localhost:2008/usuarios
    @PostMapping
    public Usuario cadastrar(

            // @RequestBody pega o JSON enviado na requisição
            // e transforma automaticamente em um objeto Usuario.
            @RequestBody Usuario usuario
    ) {
        usuario.setId(idCounter++);

        // Adiciona o usuário recebido na lista.
        usuarioList.add(usuario);

        // Retorna o nome do usuário cadastrado.
        return usuario;
    }

    // Endpoint GET.
    // Será executado quando alguém fizer:
    // GET http://localhost:2008/usuarios
    @GetMapping
    public List<Usuario> listar() {

        // Retorna todos os usuários cadastrados.
        // O Spring converte a lista para JSON automaticamente.
        return usuarioList;
    }
}