package com.njupt.nymeeting.mapper;

import com.njupt.nymeeting.pojo.dto.MeetingDTO;
import com.njupt.nymeeting.pojo.vo.MeetingVO;

import java.util.List;

/**
 * @author lhm
 */
public interface MeetingMapper {

    /**
     * 添加会议
     * @param meetingVO
     */
    void insertMeeting(MeetingVO meetingVO);

    void updateMeeting(MeetingVO meetingVO);

    MeetingDTO selectMeeting(Long meetingId);

    List<MeetingDTO> selectMeetingList();
}
