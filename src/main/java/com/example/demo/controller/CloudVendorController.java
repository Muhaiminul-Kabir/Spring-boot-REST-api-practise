/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.CloudVendor;
import com.example.demo.service.CloudVendorService;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
 
@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {

    CloudVendorService cloudvendorservice;

    public CloudVendorController(CloudVendorService cloudvendorservice) {
        this.cloudvendorservice = cloudvendorservice;
    }

    @GetMapping("{vendorId}")
    public CloudVendor getVendor(@PathVariable("vendorId") String vendorId) {
        return cloudvendorservice.getCloudVendor(vendorId);
    }
    
    @GetMapping()
    public List<CloudVendor> getAllVendor() {
        return cloudvendorservice.getAllCloudVendors();
    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        
        
        
        return cloudvendorservice.createCloudVEndor(cloudVendor) ;
       
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
         
        return cloudvendorservice.updateCloudVEndor(cloudVendor);
    }

    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(@PathVariable("vendorId")String vendorId) {
         return cloudvendorservice.deleteCloudVEndor(vendorId);
    }

}
