package ajay.ibm.com.remotelocaldb.Users.repo.remote;

import java.util.List;

import ajay.ibm.com.remotelocaldb.Base.remote.BaseRemote;
import ajay.ibm.com.remotelocaldb.Base.remote.RemoteConfiguration;
import ajay.ibm.com.remotelocaldb.Users.repo.datamodel.Car;
import io.reactivex.Observable;

public class CarRemoteRepoImpl extends BaseRemote implements CarRemoteRepo {

    @Override
    public Observable<List<Car>> getAllCars() {
        return create(CarServices.class, RemoteConfiguration.url).getCars();
    }
}
