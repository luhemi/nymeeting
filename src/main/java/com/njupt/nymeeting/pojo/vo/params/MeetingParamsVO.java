package com.njupt.nymeeting.pojo.vo.params;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;
import lombok.Value;

@Data
@ApiModel(value = "会议查询VO")
public class MeetingParamsVO {

    @ApiModelProperty(value = "页面值")
    Integer pageNum;

    @ApiModelProperty(value = "页面大小")
    Integer pageSize;
}
