package service;


import java.util.*;
import entity.*;
/**
 *
 * @author Reza Aditya
 */
public class ServiceMotor {
    
    private static List<Motor> data = new LinkedList<Motor>();

    public void addData(Motor lp) {
        data.add(lp);
        System.out.println("Data telah tersimpan");
    }

    public void updateData(Motor lp) {
        int index = data.indexOf(lp);
        if(index >= 0) {
            data.set(index, lp);
            System.out.println("Data telah berubah");
        }
    }

    public void deleteData(String id) {
        int idx = data.indexOf(new Motor(id, "", ""));
        if(idx >= 0) {
            data.remove(idx);
            System.out.println("Data telah terhapus");
        }
    }

    public void showAllData() {
        int i=1;
        System.out.println("\nData di List :");
        for(Motor lp : data) {
            System.out.println("data ke-" + i++);
            System.out.println("  ID : " + lp.getId());
            System.out.println("  NAMA : " + lp.getNama());
            System.out.println("  MERK MOTOR : " + lp.getMerk_motor());
        }
    }
}
