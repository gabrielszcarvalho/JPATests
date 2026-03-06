package com.bn.milagre2.repositories;

import com.bn.milagre2.models.MilagreModel;
import org.springframework.data.jpa.repository.JpaRepository;

//passar a entidade e o tipo de id nos params do JPa Repository
public interface MilagreRepository extends JpaRepository<MilagreModel,Long> {

}
