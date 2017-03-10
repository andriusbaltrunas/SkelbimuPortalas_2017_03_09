package com.kcs.auto.adverts.service;

/**
 * Created by andriusbaltrunas on 3/10/2017.
 */
public interface LoginService {

    boolean isUserHavePermissions(String email, String password);
}
