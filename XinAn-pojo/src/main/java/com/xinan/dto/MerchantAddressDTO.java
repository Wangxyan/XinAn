package com.xinan.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ApiModel(value = "用户按地址查询商家条件数据传输模型")
public class MerchantAddressDTO {
    @ApiModelProperty(value = "城市名")
    private String city;
    @ApiModelProperty(value = "区/县/镇名")
    private String district;
}
