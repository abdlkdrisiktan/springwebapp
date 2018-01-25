package com.guru.springframework.springwebapp.repository;

import com.guru.springframework.springwebapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorReporsitory extends CrudRepository<Author,Long> {
}
