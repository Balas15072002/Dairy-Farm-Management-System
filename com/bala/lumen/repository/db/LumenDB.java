package com.bala.lumen.repository.db;

import com.bala.lumen.repository.dto.RegistrationInfo;

public class LumenDB {
    private static LumenDB sLumenDB;

    private LumenDB() {

    }

    public static LumenDB getInstance() {
        if (sLumenDB == null) {
            sLumenDB = new LumenDB();
        }
        return sLumenDB;
    }

    private RegistrationInfo registrationInfo;

    public RegistrationInfo getRegistrationInfo() {
        return registrationInfo;
    }

    public void setRegistrationInfo(RegistrationInfo registrationInfo) {
        this.registrationInfo = registrationInfo;
    }

    public boolean validateLoginInfo(String userName, String password) {
        return registrationInfo.getUserName().equals(userName) && registrationInfo.getPassword().equals(password);
    }
}
