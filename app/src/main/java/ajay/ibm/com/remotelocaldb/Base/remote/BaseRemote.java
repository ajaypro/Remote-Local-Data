package ajay.ibm.com.remotelocaldb.Base.remote;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class BaseRemote {

    protected <T> T create (Class<T> clazz, String baseUrl){
         T service = retrofit(baseUrl).create(clazz);
         return service;
    }

    private Retrofit retrofit(String url){
        OkHttpClient okHttpClient = new OkHttpClient().newBuilder()
                .build();
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson customGson = gsonBuilder.create();

        return new Retrofit.Builder()
                .baseUrl(url).client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create(customGson))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }
}
