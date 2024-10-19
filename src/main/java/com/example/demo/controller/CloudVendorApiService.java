/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.CloudVendor;
import jakarta.transaction.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
 
@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorApiService {

    CloudVendor cloudvendor;

    @GetMapping("{vendorId}")
    public CloudVendor getVendor(String vendorId) {
        return cloudvendor;
    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        
        this.cloudvendor = cloudVendor;
        
        return "Cloud Vendor Created Successfully" ;
       
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        this.cloudvendor = cloudVendor; 
        return "Cloud Vendor Updated Successfully";
    }

    @DeleteMapping("{vendorId}")
    public void deleteCloudVendorDetails(String vendorId) {
         this.cloudvendor = null;
    }

}
