package ajay.ibm.com.remotelocaldb.Users.repo;

import java.util.List;

import ajay.ibm.com.remotelocaldb.Users.repo.datamodel.Car;
import ajay.ibm.com.remotelocaldb.Users.repo.local.CarDao;
import ajay.ibm.com.remotelocaldb.Users.repo.local.CarLocalRepo;
import ajay.ibm.com.remotelocaldb.Users.repo.remote.CarRemoteRepo;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class CarRepoImpl implements CarRepo {

    private CarLocalRepo carLocalRepo;
    private CarRemoteRepo carRemoteRepo;

    public CarRepoImpl(CarLocalRepo carLocalRepo, CarRemoteRepo carRemoteRepo){

        this.carRemoteRepo = carRemoteRepo;
        this.carLocalRepo = carLocalRepo;

    }

    @Override
    public Observable<List<Car>> getAllCars() {
        return Observable.mergeDelayError(carRemoteRepo.getAllCars().doOnNext(new Consumer<List<Car>>() {
            @Override
            public void accept(List<Car> cars) throws Exception {
                carLocalRepo.addCars(cars);
            }
        }).subscribeOn(Schedulers.io()),carLocalRepo.getCars().subscribeOn(Schedulers.io()));
    }
}
