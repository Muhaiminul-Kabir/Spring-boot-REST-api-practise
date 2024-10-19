/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.model.CloudVendor;
import java.util.List;

/**
 *
 * @author ASUS
 */
public interface CloudVendorService {
    public String createCloudVEndor(CloudVendor cloudVendor);
    public String updateCloudVEndor(CloudVendor cloudVendor);
    public String deleteCloudVEndor(String vendorId);
    public CloudVendor getCloudVendor(String vendorId);
    public List<CloudVendor> getAllCloudVendors();
    
    
}
