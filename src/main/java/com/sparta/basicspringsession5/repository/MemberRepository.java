package com.sparta.basicspringsession5.repository;

import com.sparta.basicspringsession5.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
