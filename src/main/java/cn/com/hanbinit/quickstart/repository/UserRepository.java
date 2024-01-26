package cn.com.hanbinit.quickstart.repository;

import cn.com.hanbinit.quickstart.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
