/*
Definição do projeto!

TODO App

Descrição: Aplicação para o gerenciamento de projetos e as tarefas envolvidas
nesses projetos.

Objetivo: Resolver a questão de organização de tarefas de um ou vários projetos

#Entidades envolvidas:
-> Projeto;
    * Nome;
    * Descrição;
    * Data de criação;
    * Data de atualização;

-> Tarefa;
    * Nome;
    * Descrição;
    * Status;
    * Observações;
    * Prazo;
    * Data de criação;
    * Data de atualização;

# Requisito funcional:
    * Permitir que o usuário crie um projeto;
        ** Permitir alterar o projeto;
        ** Permitir deletar o projeto;
    * Permitir que o usuário crie uma tarefa;
        ** Permitir alterar a tarefa;
        ** Permitir deletar a tarefa;

# Regras de negócio:
    * Não irá conter um sistema de login;
    * O sistema não contará com um sistema de login;
        ** Não haverá o conceito de usuário;
        ** Toda tarega deve pertencer a um projeto;

# Tecnologias utilizadas:
    * Java;
    * MySql;
    

 */
package ListaDeTarefas;

import java.sql.Connection;
import util.ConnectionFactory;

public class App {

    public static void main(String[] args) {

        Connection c = ConnectionFactory.getConnection();

        ConnectionFactory.closeConnection(c);
    }
}
