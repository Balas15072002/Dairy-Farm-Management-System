package com.bala.lumen.features.auth;

import com.bala.lumen.repository.db.LumenDB;
import com.bala.lumen.repository.dto.RegistrationInfo;

class AuthModel {
    private final AuthView view;

    public AuthModel(AuthView authView) {
        view = authView;
    }

    void init() {
        if (LumenDB.getInstance().getRegistrationInfo() != null) {
            view.proceedLogin();
        } else {
            view.proceedRegistration();
        }
    }

    void registerUser(RegistrationInfo info) {
        if (isAlreadyExist(info.getUserName())) {
            view.showErrorMessage("Username already Exist");
        } else if (isWeakPassword()) {
            view.showErrorMessage("Please enter strong password");
        } else {
            LumenDB.getInstance().setRegistrationInfo(info);
            view.onRegistrationSuccess(info);
        }
    }

    private boolean isWeakPassword() {
        return false; // Write your logics here
    }

    private boolean isAlreadyExist(String userName) {
        return false;
    }

    public void validateCredentials(String userName, String password) {
        if (LumenDB.getInstance().validateLoginInfo(userName, password)) {
            view.onSuccessLogin(userName);
        } else {
            view.onInvalidCredentials();
        }
    }
}
