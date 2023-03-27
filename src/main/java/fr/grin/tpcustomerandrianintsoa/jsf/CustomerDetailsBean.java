/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package fr.grin.tpcustomerandrianintsoa.jsf;

import fr.grin.tpcustomerandrianintsoa.ejb.CustomerManager;
import fr.grin.tpcustomerandrianintsoa.entities.Customer;
import fr.grin.tpcustomerandrianintsoa.entities.Discount;
import java.io.Serializable;
import jakarta.ejb.EJB;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import java.util.List;

/**
 *
 * @author tsior
 */
@Named(value = "customerDetailsBean")
@ViewScoped
public class CustomerDetailsBean implements Serializable {
private int idCustomer;
private Customer customer;

@EJB
private CustomerManager customerManager;
    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }
   /**
   * Retourne les détails du client courant (contenu dans l'attribut customer de
   * cette classe).
   */
    public Customer getCustomer() {
      return customer;
    }
    
    public String update() {
    // Modifie la base de données.
    // Il faut affecter à customer (sera expliqué dans le cours).
    customer = customerManager.update(customer);
    return "customerList";
    }

    public void loadCustomer() {
      this.customer = customerManager.findById(idCustomer);
    }
    /**
     * Creates a new instance of CustomerDetailsBean
     */
    public CustomerDetailsBean() {
    }
      /**
   * Retourne la liste de tous les Discount.
   */
    public List<Discount> getDiscounts() {
        return discountManager.getAllDiscounts();
    }

    private static class discountManager {

        private static List<Discount> getAllDiscounts() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public discountManager() {
        }
    }
    
}
