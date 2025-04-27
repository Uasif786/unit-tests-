/**
 * Author: Umar Asif
 * Date: April 2025
 * Purpose: Unit tests for Appointment class
 */

package com.contactservice;

import java.util.HashMap;
import java.util.Map;

public class ContactService {
    private Map<String, Contact> contactStore = new HashMap<>();

    public boolean addContact(Contact contact) {
        if (contactStore.containsKey(contact.getContactId())) {
            return false; // Duplicate contact ID
        }
        contactStore.put(contact.getContactId(), contact);
        return true;
    }

    public boolean deleteContact(String contactId) {
        if (contactStore.containsKey(contactId)) {
            contactStore.remove(contactId);
            return true;
        }
        return false;
    }

    public boolean updateContact(String contactId, String firstName, String lastName, String phone, String address) {
        Contact contact = contactStore.get(contactId);
        if (contact != null) {
            if (firstName != null) contact.setFirstName(firstName);
            if (lastName != null) contact.setLastName(lastName);
            if (phone != null) contact.setPhone(phone);
            if (address != null) contact.setAddress(address);
            return true;
        }
        return false;
    }
}