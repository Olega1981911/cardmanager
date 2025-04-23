package com.taco.cardmanager.mapper;

import com.taco.cardmanager.model.dto.UserShortDTO;
import com.taco.cardmanager.model.dto.request.BankCardRequestDTO;
import com.taco.cardmanager.model.entity.BankCard;
import com.taco.cardmanager.model.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "spring")
public interface BankCardMapper {
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "transactions", ignore = true)
    @Mapping(source = "userId", target = "user", qualifiedByName = "userIdToUser")
    BankCard bankCardRequestToEntityCard(BankCardRequestDTO bankCardRequestDTO);

    @Mapping(source = "user", target = "user", qualifiedByName = "userToUserShortDTO")
    BankCardRequestDTO bankCardEntityToBankCardRequest(BankCard bankCard);

    @Named("userIdToUser")
    static User userIdToUser(Long userId) {
        return User.builder().id(userId).build();
    }

    @Named("userToUserShortDTO")
    static UserShortDTO userToUserShortDTO(User user) {
        if (user == null) return null;
        return UserShortDTO.builder()
                .id(user.getId())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .email(user.getEmail())
                .build();
    }
}
