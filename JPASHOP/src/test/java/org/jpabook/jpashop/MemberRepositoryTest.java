package org.jpabook.jpashop;

import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(SpringExtension.class) // junit5에게 spring 관련 테스트 한다고 알려줌
@SpringBootTest
class MemberRepositoryTest {

    // member repo 테스트
    @Autowired MemberRepository memberRepository; // Autowired의 조건 : singleton, utility
//    @Autowired Member member; // 어떤 member가 생길지 모름 // 닉네임 특수문자 규칙 테스트 경우 나눠주기


    @Test
    @Transactional
    @Rollback(false)
    public void testMember() throws Exception {
        //given
        Member member = new Member();
        member.setUsername("memberA");

        //when
        Long saveId = memberRepository.save(member);
        Member findMember = memberRepository.find(saveId);

        //then
        assertEquals(member.getId(), findMember.getId());
        assertEquals(member.getUsername(), findMember.getUsername());
        assertEquals(member, findMember); // 저장한 거랑 조회한 게 같은지
        System.out.println("findeMember == member:" + (findMember == member));
    }
}