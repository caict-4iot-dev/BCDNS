package org.bcdns.credential.dto.req;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import static org.bcdns.credential.common.constant.MessageConstant.*;

@Getter
@Setter
@Data
public class AccessTokenReqDto {
    @NotBlank(message = DESC_VALID_NULL)
    @Length(min = 16, max = 16, message = DESC_VALID_STRING)
    private String apiKey;

    @NotBlank(message = DESC_VALID_NULL)
    @Length(min = 40, max = 40, message = DESC_VALID_STRING)
    private String apiSecret;

    @NotBlank(message = DESC_VALID_NULL)
    @Pattern(regexp = PATTERN_MAIN_BID, message = VALID_MAIN_BID_FORMAT)
    private String issuerId;
}
