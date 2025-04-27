/**
 * Author: Umar Asif
 * Date: April 2025
 * Purpose: Unit tests for Appointment class
 */

package com.contactservice;



import java.util.Date;

public class Appointment {
    private final String appointmentId;  
    private final Date appointmentDate;   //Date of appointment
    private String description;           // Description of the appointment

    // Constructor for creating a new appointment
    public Appointment(String appointmentId, Date appointmentDate, String description) {
        if (appointmentId == null || appointmentId.length() > 10) {
            throw new IllegalArgumentException("Appointment ID cannot be null or longer than 10 characters.");
        }
        if (appointmentDate == null || appointmentDate.before(new Date())) {
            throw new IllegalArgumentException("Appointment date cannot be null or in the past.");
        }
        if (description == null || description.length() > 50) {
            throw new IllegalArgumentException("Description cannot be null or longer than 50 characters.");
        }
        
        this.appointmentId = appointmentId;
        this.appointmentDate = appointmentDate;
        this.description = description;
    }

    public String getAppointmentId() {
        return appointmentId;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (description != null && description.length() <= 50) {
            this.description = description;
        } else {
            throw new IllegalArgumentException("Description cannot be longer than 50 characters.");
        }
    }
}
