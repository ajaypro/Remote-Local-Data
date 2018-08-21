package ajay.ibm.com.remotelocaldb.Users.repo.remote;

import java.util.List;

import ajay.ibm.com.remotelocaldb.Users.repo.datamodel.Car;
import io.reactivex.Observable;
import retrofit2.http.GET;

public interface CarServices {

      @GET("cars")
      Observable<List<Car>> getCars();
}
