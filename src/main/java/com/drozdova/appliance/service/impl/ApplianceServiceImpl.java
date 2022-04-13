package com.drozdova.appliance.service.impl;

import com.drozdova.appliance.bean.Appliance;
import com.drozdova.appliance.bean.criteria.Criteria;
import com.drozdova.appliance.dao.ApplianceDAO;
import com.drozdova.appliance.dao.DAOFactory;
import com.drozdova.appliance.service.ApplianceService;
import com.drozdova.appliance.service.validation.Validator;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

public class ApplianceServiceImpl implements ApplianceService {
    @Override
    public List<Appliance> find(Criteria criteria) throws IOException {

        DAOFactory factory = DAOFactory.getInstance();
        ApplianceDAO applianceDAO = factory.getApplianceDAO();
        List<Appliance> appliance = null;

        if (Validator.criteriaValidator(criteria)) {
            appliance = applianceDAO.find(criteria);
        }

         if(appliance == null) {
             throw new RuntimeException("Error creating appliance list");
         }

        return appliance;
    }
}
