package entity;

/**
 *
 * @author Reza Aditya
 */
public class Motor {
    
    private String id;
    private String nama;
    private String merk_motor;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getMerk_motor() {
        return merk_motor;
    }

    public void setMerk_motor(String merk_motor) {
        this.merk_motor = merk_motor;
    }

    public Motor(String id, String nama, String merk_motor) {
        this.id = id;
        this.nama = nama;
        this.merk_motor = merk_motor;
    }


    public boolean equals(Object object) {
        Motor temp = (Motor) object;
        return id.equals(temp.getId());
    }
}
