package study.datajpa.repository;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import study.datajpa.entity.Member;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class MemberQueryRepository {

//    private final EntityManager em;
//
//    List<Member> findAllMembers() { // 쿼리가 복잡하다고 가정
//        em.createQuery("select m from Member m")
//                .getResultList();
//    }
}
