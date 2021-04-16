package com.awesome.sdk.net;

import java.util.WeakHashMap;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;
import rx.Observable;

/**
 * Author: JfangZ
 * Email: zhangjingfang@jeejio.com
 * Date: 2021/4/13 17:16
 * Description: 接口
 */
public interface RxService {
    @GET()
    Observable<Object> get(@Url String url, @QueryMap WeakHashMap<String,Object> params);

    @POST()
    Observable<Object> post(@Url String url, @QueryMap WeakHashMap<String,Object> params);

    @GET("api/teacher")
    Observable<Object> getInfoRx(@Query("type") int type, @Query("num")int num);

}
