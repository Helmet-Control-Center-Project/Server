package com.example.helmetproject.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class User {

    /* 노동자 고유 ID*/
    private String userId;

    /* 노동자 주민등록 번호 */
    private String userSsn;

    /* 노동자 이름 */
    private String userName;

    /* 노동자 부서 */
    private String userDepartment;

    /* 노동자 생년월일 */
    private LocalDate userBirth;

    /* 노동자 마지막 출근일 */
    private LocalDate userLastWorkDate;

    /* 노동자 등록 날짜 */
    private LocalDate userRegistrationDate;
}
