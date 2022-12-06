package sk.umb.luiza.controller.mapper;

import org.mapstruct.Mapper;
import sk.umb.luiza.controller.dto.UserDto;
import sk.umb.luiza.domain.model.User;


@Mapper(componentModel = "spring")
public interface UserMapper {
     User requestToUser(UserDto dto);
}
