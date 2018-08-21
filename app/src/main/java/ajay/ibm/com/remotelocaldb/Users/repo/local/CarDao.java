package ajay.ibm.com.remotelocaldb.Users.repo.local;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import java.util.List;

import ajay.ibm.com.remotelocaldb.Users.repo.datamodel.Car;

@Dao
public interface CarDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAll(List<Car> items);

    @Query("SELECT * FROM " + DBConstants.TABLE_NAME)
    List<Car> getCars();
}
