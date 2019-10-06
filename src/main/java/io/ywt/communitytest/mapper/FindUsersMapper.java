package io.ywt.communitytest.mapper;

import io.ywt.communitytest.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface FindUsersMapper {

    /**
     *
     * @param id
     * @return
     */
    public User findUsersById(Integer id);
}
