/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reponsitory;

import model.Contact;

/**
 *
 * @author Bravo
 */
public class ContactReponsitory implements IcontactFunction {
ContactFunction function = new ContactFunction();
    @Override
    public void Add_A_Contact() {
        function.Add_A_Contact();
    }

    @Override
    public void DisPlay_All_Contacts() {
        function.DisPlay_All_Contacts();
    }

    @Override
    public Contact getContactById(int E) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void Delete_A_Contacts() {
        function.Delete_A_Contacts();
    }
    
}
