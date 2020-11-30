package com.njupt.nymeeting.pojo.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel(value = "会议DTO")
public class MeetingDTO {

    @ApiModelProperty(value = "会议id")
    private Long meetingId;

    @ApiModelProperty(value = "会议主题")
    private String subject;

    @ApiModelProperty(value = "会议描述")
    private String describle;

    @ApiModelProperty(value = "会议开始时间")
    private Date startDate;

    @ApiModelProperty(value = "创建时间")
    private Date creatDate;

    @ApiModelProperty(value = "会议地点")
    private String site;

    @ApiModelProperty(value = "签到开始时间")
    private Date signDate;

    @ApiModelProperty(value = "签到结束时间")
    private Date endDate;

    @ApiModelProperty(value = "备注")
    private String remake;

    @ApiModelProperty(value = "状态")
    private String state;

    @ApiModelProperty(value = "创建人")
    private String createUser;

    @ApiModelProperty(value = "修改人")
    private String updateUser;

    @ApiModelProperty(value = "修改时间")
    private Date updateDate;
}
