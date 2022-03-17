package com.drozdova.appliance.service.validation;

import com.drozdova.appliance.bean.criteria.Criteria;

import java.util.Map;

public final class Validator {
    private Validator() { }

    public static boolean criteriaValidator(final Criteria criteria) {

        switch (criteria.getGroupSearchName()) {
            case "Oven", "Laptop", "TabletPC": break;
            default: return false;
        }
        for (Map.Entry<String, Object> entry : criteria.getCriteria().entrySet()) {
            if (entry.getValue() == null) {
                return  false;
            }
        }
        return true;
    }
}
