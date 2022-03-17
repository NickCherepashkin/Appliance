package com.drozdova.appliance.dao;

import com.drozdova.appliance.bean.Appliance;
import com.drozdova.appliance.bean.criteria.Criteria;
import java.util.List;
import java.io.IOException;


public interface ApplianceDAO {
    List<Appliance> find(Criteria criteria) throws IOException;
}
