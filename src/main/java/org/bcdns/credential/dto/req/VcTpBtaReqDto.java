package org.bcdns.credential.dto.req;

import com.alipay.antchain.bridge.commons.utils.crypto.SignAlgoEnum;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import static org.bcdns.credential.common.constant.MessageConstant.*;

@Data
public class VcTpBtaReqDto {
    private String vcId;

    private byte[] tpbta;

    @NotNull(message = DESC_VALID_NULL)
    @Range(min = 1, max = 3, message = DESC_VALID_NUMBER)
    private Integer credentialType;

    @NotBlank(message = DESC_VALID_NULL)
    @Length(min = 1, max = 128, message = DESC_VALID_STRING)
    private String publicKey;

    private String signAlgo;

    private byte[] sign;
}
