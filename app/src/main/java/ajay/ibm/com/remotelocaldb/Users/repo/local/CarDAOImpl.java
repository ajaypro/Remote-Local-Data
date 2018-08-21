package ajay.ibm.com.remotelocaldb.Users.repo.local;

import java.util.List;
import java.util.concurrent.Callable;

import ajay.ibm.com.remotelocaldb.Users.repo.datamodel.Car;
import io.reactivex.Observable;
import io.reactivex.Observer;


public class CarDAOImpl implements CarLocalRepo {

    private CarDao carDao;

    public CarDAOImpl(CarDao carDao){
        this.carDao = carDao;

    }

    @Override
    public Observable<List<Car>> getCars() {
        return Observable.fromCallable(new Callable<List<Car>>() {
            @Override
            public List<Car> call() throws Exception {
                return carDao.getCars();
            }
        });
    }

    @Override
    public void addCars(List<Car> cars) {
        carDao.insertAll(cars);
    }
}
