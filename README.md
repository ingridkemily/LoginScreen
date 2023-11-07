# Tela de Login
Este projeto tem como objetivo criar um sistema de autenticação de usuário e senha em Java, seguindo o processo de Desenvolvimento Orientado por Testes (TDD). Para isso, iremos seguir os passos descritos a seguir:

## Escrever o Teste Unitário

Neste primeiro passo, iremos escrever um teste unitário utilizando JUnit para a tela de login. O teste irá verificar se a autenticação de usuário e senha está funcionando corretamente.

```public class LoginScreenTest {
    @Test
    public void testeSucessfulLogin(){
        LoginScreen loginScreen = new LoginScreen();
        Assertions.assertTrue(loginScreen.login("john", "password123"));
    }

    // Outros testes também podem ser criados, como login malsucedido ou adição de usuário.
}
```
## Executar o Teste Unitário

Após escrever o teste unitário, vamos executá-lo para garantir que o sistema esteja funcionando conforme o esperado. Neste momento, é esperado que o teste falhe, pois a implementação da classe de autenticação ainda não foi feita.

## Implementar a Classe LoginScreen

No terceiro passo, iremos implementar a classe `LoginScreen`, que será responsável por realizar a autenticação do usuário e senha. A implementação deve ser feita de acordo com os requisitos definidos no teste unitário.

```package Test;

import java.util.HashMap;
import java.util.Map;

public class LoginScreen {
    private Map<String, String> userDatabase;

    public LoginScreen(){
        userDatabase = new HashMap<>();
        userDatabase.put("john", "password123");
        userDatabase.put("alice", "securepass");
    }

    public boolean login(String username, String password) {
        if(userDatabase.containsKey(username)){
            String storedPassword = userDatabase.get(username);
            if(storedPassword.equals(password)){
                return true; // Verificação com sucesso
            }
        }
        return false; // Verificação falhada
    }

    public void addUser(String username, String password){
        userDatabase.put(username, password);
    }
}
```

## Executar o Teste Unitário Novamente

Agora que a implementação da classe `LoginScreen` foi realizada, iremos executar o teste unitário novamente. Desta vez, o teste deve passar, indicando que a autenticação está funcionando corretamente.

## Documentação, exportar o Javadoc

No quinto passo, é importante documentar o código do projeto de forma adequada. Além disso, será necessário exportar a documentação do projeto usando o Javadoc para gerar documentação em formato HTML.

```package Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Uma classe para simular a conexão com banco de dados e validação de login.
 */
public class LoginScreen {
    /**
     * Simula um banco de dados (username, password).
     */
    private Map<String, String> userDatabase;

    /**
     * Cria uma instância de LoginScreen e insere registros para simular um banco de dados.
     */
    public LoginScreen(){
        userDatabase = new HashMap<>();
        userDatabase.put("john", "password123");
        userDatabase.put("alice", "securepass");
    }

    /**
     * Tentativa de verificar a autenticidade das credenciais passadas.
     *
     * @param username o usuário que está tentando fazer login.
     * @param password a senha do usuário que está tentando fazer login.
     * @return {@code true} se a verificação for bem-sucedida, caso contrário {@code false}.
     */
    public boolean login(String username, String password) {
        if(userDatabase.containsKey(username)){
            String storedPassword = userDatabase.get(username);
            if(storedPassword.equals(password)){
                return true; // Verificação com sucesso
            }
        }
        return false; // Verificação falhada
    }

    /**
     * Adiciona um novo usuário ao 'banco de dados'.
     *
     * @param username o usuário a ser inserido no banco de dados.
     * @param password a senha a ser inserida no banco de dados.
     */
    public void addUser(String username, String password){
        userDatabase.put(username, password);
    }
}
```
