package com.raj.library.controller;

import com.raj.library.DTO.UserAddress;
import com.raj.library.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/UserDetails")
public class UserDetails {

    @Autowired
    private UserService userService;
    @GetMapping("/UserID")
    public Long getUserIdByUsername(@RequestParam String username){
        return userService.getUserIdByUsernameService(username);
    }
    @GetMapping("/UserAddressSave")
    public Map<String,Boolean> saveUserAddress(@RequestBody UserAddress userAddress){
        String name = userAddress.getName();
        String phone = userAddress.getPhone();
        String pincode = userAddress.getPincode();
        String locality = userAddress.getLocality();
        String address = userAddress.getAddress();
        String city = userAddress.getCity();
        String state = userAddress.getState();
        String landmark = userAddress.getLandmark();
        String alternatePhone = userAddress.getAlternatePhone();
        String addressType = userAddress.getAddressType();
        String username = userAddress.getUsername();
        String id = userAddress.getId();
    }
}
