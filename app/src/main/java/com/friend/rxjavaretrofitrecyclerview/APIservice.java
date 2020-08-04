package com.friend.rxjavaretrofitrecyclerview;

import java.util.List;
import io.reactivex.Single;
import retrofit2.http.GET;

public interface APIservice {

    @GET("posts/")
    Single<List<Model>> getData();
}
