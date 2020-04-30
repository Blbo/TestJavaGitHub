package com.iut.as.dao;
import com.iut.as.modele.Client;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.*;

public class ClientDAO  implements DAO<Client> {

    private List<Client> clients = new ArrayList<>();

    private ClientDAO(){
         clients.add(new Client("56565", "katia", "Metz 57000" ));
        clients.add(new Client("1919", "arwa", "Metz 57000" ));

     }

    @Override
    public Optional<Client> get(long id) {
        return Optional.ofNullable(clients.get((int)id));
    }

    @Override
    public List<Client> getAll() {
        return clients;
    }

    @Override
    public void save(Client client) {
        clients.add(client);
    }

    @Override
    public void update(Client client, String[] params) {
        /*client.setNumClient(Object.requireNonNull(params[0], "Le numéro client ne peut etre null"));   //   Numero Client
        client.setNomClient(Object.requireNonNull(params[1], "Le nom client ne peut etre null"));   // Nom du client
        client.setNom(Object.requireNonNull(params[2], "L'adresse client ne peut etre null"));    // Adresse

        clients.add(client);*/
    }

    @Override
    public void delete(Client client) {
        clients.remove(client);
    }
}
