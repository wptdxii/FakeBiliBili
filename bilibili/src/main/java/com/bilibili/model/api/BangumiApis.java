package com.bilibili.model.api;

import com.bilibili.model.api.annotation.NeedSign;
import com.bilibili.model.bean.bangumi.BangumiIndexPage;
import com.bilibili.model.bean.ResultObjectResponse;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by jiayiyang on 17/3/26.
 */

public interface BangumiApis {

    String HOST = "http://bangumi.bilibili.com";

    /**
     * https://bangumi.bilibili.com/appindex/follow_index_page?appkey=1d8b6e7d45233436&build=502000&mobi_app=android&platform=android&ts=1493967208000&sign=3eff79d895af9cf800016%20fe8f6bc6ce0
     */
    @GET("/appindex/follow_index_page")
    @NeedSign
    Observable<ResultObjectResponse<BangumiIndexPage>> getIndexPage(@Query("appkey") String appkey,
                                                                    @Query("build") String build,
                                                                    @Query("mobi_app") String mobi_app,
                                                                    @Query("platform") String platform,
                                                                    @Query("ts") String ts
    );
}
