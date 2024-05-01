package com.clearsolutionstask.clearsol.controller;

import com.clearsolutionstask.clearsol.dto.UserDto;
import com.clearsolutionstask.clearsol.service.UserService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/user/save")
    public UserDto saveUser(@Valid @RequestBody UserDto userDto){
        return userService.creatUser(userDto);
    }

    @DeleteMapping("/user/delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteUser(@PathVariable Integer id){
        userService.deleteUser(id);
    }
}
