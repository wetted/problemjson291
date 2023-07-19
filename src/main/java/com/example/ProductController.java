package com.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/product")
class ProductController {
    @Get("/problem")
    public void problem() {
        throw new ProductProblem("random");
    }
}
