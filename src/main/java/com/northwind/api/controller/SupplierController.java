package com.northwind.api.controller;

import java.util.List;

import javax.ws.rs.QueryParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.northwind.api.entities.Supplier;
import com.northwind.api.service.SupplierService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/supplier")
@RequiredArgsConstructor
@Slf4j
public class SupplierController {
    private final SupplierService service;

    @GetMapping()
    public ResponseEntity<?> findSuppliersByCountry() {
        log.debug("Supplier :: Get All Supplier");
        List<Supplier> suppliers = service.findAllSupplier();
        return new ResponseEntity<>(suppliers, HttpStatus.OK);
    }

    @GetMapping("/search")
    public ResponseEntity<?> findSupplierPagination(
            @RequestParam(name = "city", required = true) String city,
            @RequestParam(name = "sort", required = true) String sort,
            @RequestParam(name = "page", required = true) int page,
            @RequestParam(name = "size", required = true) int size) {

        log.debug("Supplier :: Get all supplier pagination");
        return new ResponseEntity<>(service.findSupplierByCityPageable(city,page, size, sort), HttpStatus.OK);

    }

}
