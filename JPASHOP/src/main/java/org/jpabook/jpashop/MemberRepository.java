package org.jpabook.jpashop;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class MemberRepository {

    @PersistenceContext // entity manager
    private EntityManager em; // entitymanager 알아서 주입


    // member Entity를 영속성 컨텍스트에 추가 및 DB에 저장
    public Long save(Member member) {
        em.persist(member);
        return member.getId();
    }

    // 하나 조회
    public Member find(Long id){
        return em.find(Member.class, id);
    }

}
