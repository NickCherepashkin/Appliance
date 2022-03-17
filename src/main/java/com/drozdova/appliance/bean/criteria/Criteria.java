package com.drozdova.appliance.bean.criteria;

import com.drozdova.appliance.bean.Appliance;

import java.util.HashMap;
import java.util.Map;

public class Criteria {
    private String groupSearchName;
    // создается список критериев для поиска
    private Map<String, Object> criteria = new HashMap<String, Object>();

    public Criteria(String groupSearchName) {
        this.groupSearchName = groupSearchName;
    }

    public String getGroupSearchName() {
        return groupSearchName;
    }

    public void add(String searchCriteria, Object value) {
        criteria.put(searchCriteria, value);
    }

    // you may add your own code here
    public Map<String, Object> getCriteria () {
        return criteria;
    }
}
