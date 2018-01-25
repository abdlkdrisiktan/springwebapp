package com.guru.springframework.springwebapp.boostrap;

import com.guru.springframework.springwebapp.model.Author;
import com.guru.springframework.springwebapp.model.Book;
import com.guru.springframework.springwebapp.model.Publisher;
import com.guru.springframework.springwebapp.repository.AuthorReporsitory;
import com.guru.springframework.springwebapp.repository.BookRepository;
import com.guru.springframework.springwebapp.repository.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorReporsitory authorReporsitory;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(AuthorReporsitory authorReporsitory, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorReporsitory = authorReporsitory;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        init();
    }
    private void init(){
        Publisher publisher = new Publisher();
        publisher.setName("Foo");

        publisherRepository.save(publisher);

        //For Eric
        Author eric = new Author("Eric","Evans");
        Book ddd = new Book("Domanin Driven Design ","1234",publisher);
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorReporsitory.save(eric);
        bookRepository.save(ddd);
        //Rod
        Author rod = new Author("Rod","Johnson");
        Book noejd = new Book("J2ee development","12312",publisher);
        rod.getBooks().add(noejd);

        authorReporsitory.save(rod);
        bookRepository.save(noejd);


    }
}
