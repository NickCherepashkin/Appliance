package com.drozdova.appliance.service.impl;

import com.drozdova.appliance.bean.Appliance;
import com.drozdova.appliance.bean.criteria.Criteria;
import com.drozdova.appliance.dao.ApplianceDAO;
import com.drozdova.appliance.dao.DAOFactory;
import com.drozdova.appliance.service.ApplianceService;
import com.drozdova.appliance.service.validation.Validator;

import java.io.IOException;
import java.util.List;

public class ApplianceServiceImpl implements ApplianceService {
    private final DAOFactory factory = DAOFactory.getInstance();

    @Override
    public List<Appliance> find(Criteria criteria) throws IOException {
        if (!Validator.criteriaValidator(criteria)) {
            return null;
        }

        DAOFactory factory = DAOFactory.getInstance();
        ApplianceDAO applianceDAO = factory.getApplianceDAO();

        List<Appliance> appliance = applianceDAO.find(criteria);

        // you may add your own code here

        return appliance;
    }
}
