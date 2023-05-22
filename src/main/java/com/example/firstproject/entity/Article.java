package com.example.firstproject.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity // DB가 해당 객체를 인식 가능!! (해당 클래스로 테이블을 만든다)
@AllArgsConstructor //생성자
@NoArgsConstructor  // 디폴트 생성자
@ToString
@Getter
public class Article {

    @Id // 대표값을 지정 Like a 주민번호
    @GeneratedValue(strategy = GenerationType.IDENTITY) // db가 자동 생성
    private Long id;

    @Column
    private String title;

    @Column
    private String content;

}
