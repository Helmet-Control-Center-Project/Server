package com.example.helmetproject.vo;

import lombok.Data;

import java.time.LocalDate;

@Data
public class UserVo {

    /* 노동자 고유 ID*/
    private String userId;

    /* 노동자 이름 */
    private String userName;

    /* 노동자 생년월일 */
    private LocalDate userBirth;

    /* 노동자 등록 날짜 */
    private LocalDate userRegistrationDate;
}
