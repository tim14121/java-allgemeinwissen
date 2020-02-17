package com.java.allgemein.wissen.functional.programming;

import java.util.function.Supplier;

public class SupplierClass {

    static Supplier<String> getConnectionString = ()-> "https://localhost.com";

    public static void main(String[] args) {
        SupplierClass supplierClass = new SupplierClass();
        System.out.println(getConnectionString.get());

    }



}
