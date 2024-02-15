/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.main.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Kawmal Kashmika
 */
public class JobNote {
    private String jobId;
    private String customerName;
    private Date date;
    private ArrayList<Laptop> laptopList;

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ArrayList<Laptop> getLaptopList() {
        return laptopList;
    }

    public void setLaptopList(ArrayList<Laptop> laptopList) {
        this.laptopList = laptopList;
    }

    @Override
    public String toString() {
        return "JobNote{" + "jobId=" + jobId + ", customerName=" + customerName + ", date=" + date + ", laptopList=" + laptopList + '}';
    }
    
    
    
    
    
}


