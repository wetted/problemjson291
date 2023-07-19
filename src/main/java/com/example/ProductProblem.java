package com.example;

import io.micronaut.http.HttpStatus;
import io.micronaut.problem.HttpStatusType;
import org.zalando.problem.AbstractThrowableProblem;

//@io.micronaut.serde.annotation.Serdeable
@io.micronaut.core.annotation.Introspected
public class ProductProblem extends AbstractThrowableProblem {

    private final String field;

    public ProductProblem(String field) {
        super(null, HttpStatus.INTERNAL_SERVER_ERROR.getReason(), new HttpStatusType(HttpStatus.INTERNAL_SERVER_ERROR));
        this.field = field;
    }

    public String getField() {
        return field;
    }
}
