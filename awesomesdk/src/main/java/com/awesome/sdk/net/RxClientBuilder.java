package com.awesome.sdk.net;

import java.util.WeakHashMap;

/**
 * Author: JfangZ
 * Email: zhangjingfang@jeejio.com
 * Date: 2021/4/16 11:13
 * Description: 客户端构建器
 */
public class RxClientBuilder {
    private String url;
    private WeakHashMap<String, Object> params;


    public RxClientBuilder url(String url) {
        this.url = url;
        return this;
    }


    public RxClientBuilder params(WeakHashMap<String, Object> params) {
        this.params = params;
        return this;
    }

    public RxClient build(){
        return new RxClient(url,params);
    }
}
