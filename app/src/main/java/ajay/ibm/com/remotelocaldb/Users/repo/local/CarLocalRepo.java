package ajay.ibm.com.remotelocaldb.Users.repo.local;

import java.util.List;

import ajay.ibm.com.remotelocaldb.Users.repo.datamodel.Car;
import io.reactivex.Observable;

public interface CarLocalRepo {

    Observable<List<Car>> getCars();

    void addCars(List<Car> cars);
}
