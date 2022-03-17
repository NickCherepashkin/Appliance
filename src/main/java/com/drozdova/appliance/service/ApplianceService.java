package com.drozdova.appliance.service;

import com.drozdova.appliance.bean.Appliance;
import com.drozdova.appliance.bean.criteria.Criteria;

import java.io.IOException;
import java.util.List;

public interface ApplianceService {
    List<Appliance> find(Criteria criteria) throws IOException;
}
