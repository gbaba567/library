/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gb.web.model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.NamedNativeQueries;
import org.hibernate.annotations.NamedNativeQuery;

@NamedNativeQueries({
    @NamedNativeQuery(
            name = "getAllBooks",
            query = "select * from books",
            resultClass = Book.class)
})
@Entity
@Table(name = "books")
@Data
public class Book {

    @Id
    @Column(name = "bookId", nullable = false)
    private String id;
    @Column(name = "title", nullable = false)
    private String title;
    @Column(name = "author", nullable = false)
    private String author;
    @Column(name = "isbn", nullable = false)
    private String isbn;
}
