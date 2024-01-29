package study.datajpa5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.datajpa5.entity.Team;

public interface TeamRepository extends JpaRepository<Team, Long> {
}
