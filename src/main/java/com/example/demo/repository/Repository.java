package com.example.demo.repository;

import com.example.demo.entity.Result;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Ilyas on 09.01.2019.
 */

public interface Repository extends CrudRepository<Result, Long> {
}
