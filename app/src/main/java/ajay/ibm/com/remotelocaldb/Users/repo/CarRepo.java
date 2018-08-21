package ajay.ibm.com.remotelocaldb.Users.repo;

import java.util.List;

import ajay.ibm.com.remotelocaldb.Users.repo.datamodel.Car;
import io.reactivex.Observable;

public interface CarRepo {

    Observable<List<Car>> getAllCars();
}
