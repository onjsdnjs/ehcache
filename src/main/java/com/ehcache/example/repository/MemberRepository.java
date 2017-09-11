package com.ehcache.example.repository;

import com.ehcache.example.domain.Member;

/**
 * Created by hongjong-wan on 2017. 9. 11..
 */
public interface MemberRepository {
    Member findByNameNoCache(String name);

    Member findByNameCache(String name);

    void refresh(String name);
}

