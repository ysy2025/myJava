package org.ysy.lease.web.admin.custom.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.converter.ConverterFactory;
import org.springframework.stereotype.Component;
import org.ysy.lease.model.enums.BaseEnum;

@Component
public class StringToEnumConverterFactory implements ConverterFactory<String, BaseEnum> {

    @Override
    public <T extends BaseEnum> Converter<String, T> getConverter(Class<T> targetType) {


        return new Converter<String, T>() {
            @Override
            public T convert(String code) {
                T[] enumConstants = targetType.getEnumConstants();
                for (T enumConstant : enumConstants){
                    if (enumConstant.getCode().equals(Integer.valueOf(code))){
                        return enumConstant;
                    };

                };
                throw new IllegalArgumentException("code " +code + " is illegal!");
            };

        };

    }
}
