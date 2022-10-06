package achotik.tali.room.credit_book;


import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "course_table")
public class CreditBookModel {

    @PrimaryKey(autoGenerate = true)

    public Long id;
    public String name;
    public int phone;
    public String address;

    public CreditBookModel() {
    }

    public CreditBookModel(Long id, String name, int phone, String address) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }
}
