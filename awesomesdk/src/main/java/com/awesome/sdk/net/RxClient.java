package com.awesome.sdk.net;

import java.util.WeakHashMap;
import rx.Observable;

/**
 * Author: JfangZ
 * Email: zhangjingfang@jeejio.com
 * Date: 2021/4/14 15:27
 * Description:
 */
public class RxClient {
    private String url;
    private WeakHashMap<String, Object> params;

    public RxClient(String url, WeakHashMap<String, Object> params) {
        this.url = url;
        this.params = params;
    }

    public Observable get() {
        return request(HttpMethod.GET);
    }

    public Observable post() {
        return request(HttpMethod.POST);
    }

    public Observable delete() {
        return request(HttpMethod.DELETE);
    }

    // 根据请求类型，请求接口
    public Observable request(HttpMethod httpMethod) {
        RxService apiService = RetrofitCreator.getRxService();
        switch (httpMethod) {
            case GET:
                return apiService.get(url, params);
            case POST:
                return apiService.post(url, params);
            case DELETE:
                return apiService.getInfoRx(4, 10);
            default:
                return null;
        }
    }

    public static RxClientBuilder builder() {
        return new RxClientBuilder();
    }

}
