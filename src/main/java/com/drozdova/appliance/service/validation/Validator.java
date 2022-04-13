package com.drozdova.appliance.service.validation;

import com.drozdova.appliance.bean.criteria.Criteria;

import java.util.Map;

public final class Validator {
    private Validator() { }

    public static boolean criteriaValidator(final Criteria criteria) {
        if (criteria == null) {
            throw new RuntimeException("Error. Search criteria not selected.");
        }

        if(criteria.getGroupSearchName().isEmpty()) {
            throw new RuntimeException("Error. Appliance type not selected.");
        }

        if (criteria.getCriteria().size() == 0) {
            throw new RuntimeException("Error. Appliance criteries not selected.");
        }

        for (Map.Entry<String, Object> entry : criteria.getCriteria().entrySet()) {
            if (entry.getValue() == null) {
                throw new RuntimeException("Error. Not all values entered for select criteries.");
            }
        }
        return true;
    }
}
