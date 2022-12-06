package sk.umb.luiza.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import sk.umb.luiza.controller.dto.UserDto;
import sk.umb.luiza.controller.mapper.UserMapper;
import sk.umb.luiza.service.UserService;


@RestController
public class UserController {

    private UserService userService;

    private UserMapper userMapper;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @PostMapping("/user/login")
    public ApiResponse userLogin(@RequestBody UserDto request) {
        var user = userService.userLogin(userMapper.requestToUser(request));
        if (user == null) {
            return new ApiErrorResponse();
        }
        return new ApiSuccessResponse();
    }
}
