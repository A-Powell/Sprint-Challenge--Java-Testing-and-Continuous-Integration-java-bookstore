package com.lambdaschool.bookstore.service;

import com.lambdaschool.bookstore.model.Authors;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;
import java.util.List;

public interface AuthorService
{
    List<Authors> findAll(Pageable pageable);

}
