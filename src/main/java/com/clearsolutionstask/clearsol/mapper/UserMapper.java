package com.clearsolutionstask.clearsol.mapper;

import com.clearsolutionstask.clearsol.dto.PatchUserDto;
import com.clearsolutionstask.clearsol.dto.UserDto;
import com.clearsolutionstask.clearsol.entity.User;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, builder = @Builder(disableBuilder = true))
public interface UserMapper {

    UserDto toUserDto(User user);

    User toUser(UserDto userDto);

    User patchToUser(PatchUserDto patchUserDto);
}
