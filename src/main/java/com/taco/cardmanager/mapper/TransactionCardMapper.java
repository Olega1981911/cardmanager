package com.taco.cardmanager.mapper;

import com.taco.cardmanager.model.dto.request.TransactionCardRequestDTO;
import com.taco.cardmanager.model.dto.response.TransactionCardResponseDTO;
import com.taco.cardmanager.model.entity.BankCard;
import com.taco.cardmanager.model.entity.TransactionCard;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "spring")
public interface TransactionCardMapper {

    TransactionCardResponseDTO transactionCardToTransactionCardResponse(TransactionCard transactionCard);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "transactionDate", ignore = true) // Дата устанавливается на сервере
    @Mapping(source = "bankCardId", target = "bankCard", qualifiedByName = "idToBankCard")
    TransactionCard transactionCardRequestToEntity(TransactionCardRequestDTO transactionCardRequestDTO);

    @Named("idToBankCard")
    default BankCard idToBankCard(Long bankCardId) {
        if (bankCardId == null) return null;
        return BankCard.builder()
                .id(bankCardId)
                .build();
    }

}
