/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities.session;

import entities.Aseguradora;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author BuRr0X
 */
@Stateless
public class AseguradoraFacade extends AbstractFacade<Aseguradora> {
    @PersistenceContext(unitName = "BomberAppPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AseguradoraFacade() {
        super(Aseguradora.class);
    }
    
}
