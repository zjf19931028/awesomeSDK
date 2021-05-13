package com.awesomesdk.base;

import android.os.Bundle;

import com.awesome.sdk.base.BaseActivity;
import com.awesomesdk.R;

import static com.awesome.sdk.constant.Constant.RECORD_AUDIO_CODE;
import static com.awesome.sdk.constant.Constant.RECORD_AUDIO_PERMISSION;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (!hasPermission(RECORD_AUDIO_PERMISSION)) {
            requestPermission(RECORD_AUDIO_CODE, RECORD_AUDIO_PERMISSION);
        }
//        WeakHashMap<String, Object> params = new WeakHashMap<>();
//        params.put("type", "4");
//        params.put("num", "10");
//        new RxClient("http://www.imooc.com/",params)
//                .get()
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(new Observer<Teacher>() {
//                    @Override
//                    public void onCompleted() {
//                        Log.i("Retrofit", "onCompleted");
//                    }
//
//                    @Override
//                    public void onError(Throwable e) {
//                        Log.i("Retrofit", "onError");
//                    }
//
//                    @Override
//                    public void onNext(Teacher teacher) {
//                        List<Course> courses = teacher.getData();
//                        for (int i = 0; i < courses.size(); i++) {
//                            Log.i("Retrofit", courses.get(i).toString());
//                        }
//                    }
//                });
    }

}