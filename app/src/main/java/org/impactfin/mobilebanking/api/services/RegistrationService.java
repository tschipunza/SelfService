package org.impactfin.mobilebanking.api.services;

import org.impactfin.mobilebanking.api.ApiEndPoints;
import org.impactfin.mobilebanking.models.register.RegisterPayload;
import org.impactfin.mobilebanking.models.register.UserVerify;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by dilpreet on 31/7/17.
 */

public interface RegistrationService {

    @POST(ApiEndPoints.REGISTRATION)
    Observable<ResponseBody> registerUser(@Body RegisterPayload registerPayload);

    @POST(ApiEndPoints.REGISTRATION + "/user")
    Observable<ResponseBody> verifyUser(@Body UserVerify userVerify);
}
