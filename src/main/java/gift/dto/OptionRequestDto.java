package gift.dto;

import gift.validation.ValidName;
import gift.vo.Option;
import gift.vo.Product;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;

public record OptionRequestDto(
    Long id,

    Long productId,

    @ValidName
    @NotEmpty(message = "옵션명을 입력해 주세요.")
    String name,

    @Positive
    int quantity
){
    public Option toOption (Product product) {
        return new Option(id, product, name, quantity);
    }
}