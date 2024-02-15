/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.main.model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Kawmal Kashmika
 */
public class MyDataModel extends AbstractTableModel{
    
    ArrayList<Laptop> LaptopList;

  
    private final String[] columns = {"Brand", "Model","Faults","Battery","Charger","DVD ROM","RAM","Hard disk"};

    public MyDataModel(ArrayList<Laptop> data) {
        this.LaptopList =  data; 
    }

    @Override
    public int getRowCount() {
        return LaptopList.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Laptop row = LaptopList.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return row.getBrand();
            case 1:
                return row.getModel();
            case 2:
                return row.getFalult();
            case 3:
                return (row.isBattery()) ? "YES" : "NO";
            case 4:
                return (row.isCharger()) ? "YES" : "NO";
            case 5:
                return (row.isDvd()) ? "YES" : "NO";
            case 6:
                return (row.isHardDisk()) ? "YES" : "NO";
            case 7:
                return (row.isRam()) ? "YES" : "NO";
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }
    
}
