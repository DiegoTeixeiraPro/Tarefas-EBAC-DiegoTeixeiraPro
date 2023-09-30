package com.diego;

import com.diego.dao.GenericDAO;
import com.diego.domain.Acessorio;
import com.diego.domain.Carro;
import com.diego.domain.Marca;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GenericDAO genericDAO = new GenericDAO("mod33");

        Marca marca = new Marca();
        marca.setNome("Porsche");

        Carro carro = new Carro();
        carro.setModelo("911");
        carro.setMarca(marca);

        Acessorio acessorio = new Acessorio();
        acessorio.setNome("Capa para chave canivete couro");

        carro.setAcessorios(new ArrayList<>());
        carro.getAcessorios().add(acessorio);
        acessorio.getCarros().add(carro);

        genericDAO.save(marca);
        genericDAO.save(carro);
        genericDAO.save(acessorio);

        genericDAO.commit();

        genericDAO.close();
    }
}