package com.buybuddy.service.user;

import com.buybuddy.dto.UserDto;
import com.buybuddy.model.User;
import com.buybuddy.request.CreateUserRequest;
import com.buybuddy.request.UserUpdateRequest;

public interface IUserService {

    User getUserById(Long userId);
    User createUser(CreateUserRequest request);
    User updateUser(UserUpdateRequest request, Long userId);
    void deleteUser(Long userId);

    UserDto convertUserToDto(User user);
}
