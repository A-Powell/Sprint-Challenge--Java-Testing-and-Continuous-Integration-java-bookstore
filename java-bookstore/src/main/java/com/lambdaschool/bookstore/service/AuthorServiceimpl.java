package com.lambdaschool.bookstore.service;

import com.lambdaschool.bookstore.model.Authors;
import com.lambdaschool.bookstore.repository.Authorsrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service(value = "authorService")
public class AuthorServiceimpl implements AuthorService
{
    @Autowired
    private Authorsrepository authorsrepos;

    @Override
    public List<Authors> findAll(Pageable pageable)
    {
        List<Authors> list = new ArrayList<>();
        authorsrepos.findAll(pageable).iterator().forEachRemaining(list::add);
        return list;
    }
}
