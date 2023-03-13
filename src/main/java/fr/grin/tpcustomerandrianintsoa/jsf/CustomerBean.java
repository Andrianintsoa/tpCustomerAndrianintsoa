/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package fr.grin.tpcustomerandrianintsoa.jsf;

import fr.grin.tpcustomerandrianintsoa.ejb.CustomerManager;
import fr.grin.tpcustomerandrianintsoa.entities.Customer;
import jakarta.ejb.EJB;
import jakarta.inject.Named;
import jakarta.faces.view.ViewScoped;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author tsior
 */
@Named(value = "customerBean")
@ViewScoped
public class CustomerBean implements Serializable {
  private List<Customer> customerList;  

  @EJB
  private CustomerManager customerManager;  
        
  public CustomerBean() {  }  
        
  /** 
   * Creates a new instance of CustomerBean
   */  
  public List<Customer> getCustomers() {
    if (customerList == null) {
      customerList = customerManager.getAllCustomers();
    }
    return customerList;
  }
}
