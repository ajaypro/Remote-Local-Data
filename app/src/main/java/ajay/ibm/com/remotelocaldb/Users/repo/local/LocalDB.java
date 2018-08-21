package ajay.ibm.com.remotelocaldb.Users.repo.local;

import android.arch.persistence.room.Database;

import ajay.ibm.com.remotelocaldb.Users.repo.datamodel.Car;

@Database(entities = {Car.class}, version = 1, exportSchema = false)
public abstract class LocalDB {

    public abstract CarDao carDAO();

}
