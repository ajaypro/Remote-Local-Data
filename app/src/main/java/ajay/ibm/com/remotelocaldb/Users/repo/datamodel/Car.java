package ajay.ibm.com.remotelocaldb.Users.repo.datamodel;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

import ajay.ibm.com.remotelocaldb.Users.repo.local.DBConstants;

@Entity(tableName = DBConstants.TABLE_NAME)
public class Car {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = DBConstants.CAR_ID)
    private Integer id;

    @SerializedName("model")
    @ColumnInfo(name = DBConstants.CAR_MODEL)
    private String model;

    @SerializedName("price")
    @ColumnInfo(name = DBConstants.CAR_PRICE)
    private int price;

    public Car(){}

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
