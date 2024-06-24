package org.ysy.lease.web.admin.custom.converter;

import org.springframework.core.convert.converter.Converter;
import org.ysy.lease.model.enums.LeaseStatus;


public class StringToLeaseStatusConverter implements Converter<String, LeaseStatus> {
    @Override
    public LeaseStatus convert(String code) {
        LeaseStatus[] values = LeaseStatus.values();

        for (LeaseStatus leaseStatus : values) {
            if (leaseStatus.getCode().equals(Integer.valueOf(code))){
                return leaseStatus;
            }
        }
        throw new IllegalArgumentException("code: " + code + " illegal!");
    }

}
