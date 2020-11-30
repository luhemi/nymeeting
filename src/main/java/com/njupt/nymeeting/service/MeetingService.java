package com.njupt.nymeeting.service;

import com.github.pagehelper.PageInfo;
import com.njupt.nymeeting.pojo.dto.MeetingDTO;
import com.njupt.nymeeting.pojo.vo.MeetingVO;
import com.njupt.nymeeting.pojo.vo.params.MeetingParamsVO;

import java.util.List;

/**
 * @author lhm
 */
public interface MeetingService {

    /**
     * 添加会议
     * @param meetingVO
     */
    void addMeeting(MeetingVO meetingVO);

    /**
     * 修改会议
     * @param meetingVO
     */
    void updateMeeting(MeetingVO meetingVO);

    /**
     * 删除会议
     * @param meetingId
     */
    void deleteMeeting(Long meetingId);

    /**
     * 获取会议详情
     * @param meetingId
     * @return
     */
    MeetingDTO getMeeting(Long meetingId);

    /**
     * 会议列表
     * @return
     */
    PageInfo<MeetingDTO> listMeeting(MeetingParamsVO meetingParamsVO);
}
