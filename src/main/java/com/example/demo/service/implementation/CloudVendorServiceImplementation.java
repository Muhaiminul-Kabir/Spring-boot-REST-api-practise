/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service.implementation;

import com.example.demo.model.CloudVendor;
import com.example.demo.repository.CloudVendorRepository;
import com.example.demo.service.CloudVendorService;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author ASUS
 */

@Service
public class CloudVendorServiceImplementation implements CloudVendorService{

    CloudVendorRepository cloudvendorRepo;

    public CloudVendorServiceImplementation(CloudVendorRepository cloudvendorRepo) {
        this.cloudvendorRepo = cloudvendorRepo;
    }
    
    @Override
    public String createCloudVEndor(CloudVendor cloudVendor) {
        cloudvendorRepo.save(cloudVendor);
        return "Created succesfully";
    }

    @Override
    public String updateCloudVEndor(CloudVendor cloudVendor) {
        cloudvendorRepo.save(cloudVendor);
        return "Updated succesfully";
    }

    @Override
    public String deleteCloudVEndor(String vendorId) {
        cloudvendorRepo.deleteById(vendorId);
        return "Deleted succesfully";
    }

    @Override
    public CloudVendor getCloudVendor(String vendorId) {
        return cloudvendorRepo.findById(vendorId).get();
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        return cloudvendorRepo.findAll();
    }
    
}
