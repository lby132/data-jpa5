package study.datajpa5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.datajpa5.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
