package Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Uma classe de tela de login simples que oferece funcionalidade de autenticacao de usuario.
 */
public class LoginScreen {
    private Map<String, String> userDatabase;

    /**
     * Inicializa a tela de login e preenche o banco de dados de usuarios com exemplos iniciais.
     */
    public LoginScreen() {
        userDatabase = new HashMap<>();
        userDatabase.put("john", "password123");
        userDatabase.put("alice", "securepass");
    }

    /**
     * Autentica um usuario com base no nome de usuario e senha fornecidos.
     *
     * @param username O nome de usuario fornecido pelo usuario.
     * @param password A senha fornecida pelo usuario.
     * @return `true` se o nome de usuario e a senha fornecidos corresponderem a um usuario no banco de dados, `false` caso contrario.
     */
    public boolean login(String username, String password) {
        if (userDatabase.containsKey(username)) {
            String storedPassword = userDatabase.get(username);
            if (storedPassword.equals(password)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Adiciona um novo usuario ao banco de dados de usuarios ou atualiza a senha de um usuario existente.
     *
     * @param username O nome de usuario do usuario a ser adicionado ou atualizado.
     * @param password A senha do usuario.
     */
    public void addUser(String username, String password) {
        userDatabase.put(username, password);
    }
}
