package org.ysy.lease.web.admin.custom.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.ysy.lease.web.admin.custom.converter.StringToEnumConverterFactory;
import org.ysy.lease.web.admin.custom.converter.StringToItemTypeConverter;

@Configuration
public class WebMvcConfiguration implements WebMvcConfigurer {

//    @Autowired
//    private StringToItemTypeConverter stringToItemTypeConverter;

    @Autowired
    public StringToEnumConverterFactory stringToEnumConverterFactory;

    @Override
    public void addFormatters(FormatterRegistry registry) {
//        registry.addConverter(this.stringToItemTypeConverter);

        registry.addConverterFactory(this.stringToEnumConverterFactory);
    }
}
