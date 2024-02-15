/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.main.model;

/**
 *
 * @author Kawmal Kashmika
 */
public class JobNoteDTO {
    
    private int jobNoteId;
    private String customerName;
    private String contactNumber;

    public int getJobNoteId() {
        return jobNoteId;
    }

    public void setJobNoteId(int jobNoteId) {
        this.jobNoteId = jobNoteId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    @Override
    public String toString() {
        return "JobNoteDTO{" + "jobNoteId=" + jobNoteId + ", customerName=" + customerName + ", contactNumber=" + contactNumber + '}';
    }
    
    
    
}
