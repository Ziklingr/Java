package com.karpinmaa.loppu;

import java.util.List;

//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController 


public class userRest {

    private userRegister uService = new userRegister();

    @GetMapping("/")
    public String getInfo(
        @RequestParam String lang

        ) {
        if(lang.equals("eng"))
        return "this is root info";
        
    return "This is root info  "; 
    }   



    @PostMapping("/user")
    public String postUser(@RequestBody user user) {
        uService.addUser(user);

        return "Tokmanni user added"; 
    }   

    @GetMapping("/users")
    public List<user> getUsers(@RequestParam(required = false) String keyword) {
        if (keyword != null) {
        return uService.searchUser(keyword);
    }
    return uService.getUsers();
    }

   @GetMapping("/user/{phone}/ShoppingCart")
    public ShoppingCart getUser(@PathVariable int phone) {
    var users = uService.getUsers();
    for (user user : users) {
        if (user.getPhone() == phone) {
            return user.getShoppingCart();
        }
        
    }
    return null;
    }
    @PostMapping("/user/{phone}/ShoppingCart")
    public String postProduct(@PathVariable int phone, @RequestBody Product product) {
        var users = uService.getUsers();
        for (user user : users) {
            if (user.getPhone() == phone) {
                user.getShoppingCart().getProducts().add(product);
                return "Product added to shopping cart";
            }
        }
        return "User not found";
    }

  
}

