package com.drozdova.appliance.service;

import com.drozdova.appliance.service.impl.ApplianceServiceImpl;

public class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();
    private final ApplianceService applianceService = new ApplianceServiceImpl();

    private ServiceFactory() {}
    public static ServiceFactory getInstance() {
        return instance;
    }

    public ApplianceService getApplianceService() {

        return applianceService;
    }
}
