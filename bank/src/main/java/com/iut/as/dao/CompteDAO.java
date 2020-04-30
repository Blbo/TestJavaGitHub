package com.iut.as.dao;

import com.iut.as.modele.Compte;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CompteDAO implements DAO<Compte> {

    private List<Compte> comptes = new ArrayList<>();

    private CompteDAO(){
        comptes.add(new Compte(0,"56565",5000));
        comptes.add(new Compte(0,"1919",4000));

    }


    @Override
    public Optional<Compte> get(long id) {
        return Optional.ofNullable(comptes.get((int)id));
    }

    @Override
    public List<Compte> getAll() {
        return comptes;
    }

    @Override
    public void save(Compte compte) {
        comptes.add(compte);
    }

    @Override
    public void update(Compte compte, String[] params) {
        compte.setSolde(Object.requireNonNull(params[0], "Le solde de compte ne peut etre null"));
        compte.setNumCompte(Object.requireNonNull(params[1], "Le numéro de compte ne peut etre null"));
        compte.setMontant(Object.requireNonNull(params[2], "Le numéro de compte ne peut etre null"));
    }

    @Override
    public void delete(Compte compte) {
        comptes.remove(compte);

    }
}
