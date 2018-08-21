package ajay.ibm.com.remotelocaldb.Users.repo.remote;

import java.util.List;

import ajay.ibm.com.remotelocaldb.Users.repo.datamodel.Car;
import io.reactivex.Observable;

public interface CarRemoteRepo {

    Observable<List<Car>> getAllCars();
}
