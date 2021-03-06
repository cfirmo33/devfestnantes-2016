package com.nilhcem.devfestnantes.data.network;

import com.nilhcem.devfestnantes.data.network.model.Session;
import com.nilhcem.devfestnantes.data.network.model.Speaker;

import java.util.List;

import retrofit2.http.GET;
import rx.Observable;

public interface DevFestService {

    @GET("sessions")
    Observable<List<Session>> loadSessions();

    @GET("speakers")
    Observable<List<Speaker>> loadSpeakers();
}
