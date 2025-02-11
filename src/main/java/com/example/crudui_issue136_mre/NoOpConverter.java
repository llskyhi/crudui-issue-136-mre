package com.example.crudui_issue136_mre;

import com.vaadin.flow.data.binder.Result;
import com.vaadin.flow.data.binder.ValueContext;
import com.vaadin.flow.data.converter.Converter;

public class NoOpConverter implements Converter<Object, Object> {
    @Override
    public Result<Object> convertToModel(Object value, ValueContext context) {
        return Result.ok(value);
    }

    @Override
    public Object convertToPresentation(Object value, ValueContext context) {
        return value;
    }
}
