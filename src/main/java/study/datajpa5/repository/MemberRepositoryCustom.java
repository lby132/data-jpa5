package study.datajpa5.repository;

import study.datajpa5.entity.Member;

import java.util.List;

public interface MemberRepositoryCustom {

    List<Member> findMemberCustom();
}
