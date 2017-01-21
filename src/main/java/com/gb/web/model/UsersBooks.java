/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gb.web.model;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;
import org.hibernate.annotations.NamedNativeQueries;
import org.hibernate.annotations.NamedNativeQuery;

@NamedNativeQueries({
    @NamedNativeQuery(
            name = "findBooksByAuther",
            query = "select * from users_books where userId = :userId",
            resultClass = UsersBooks.class)
})
@Entity
@Table(name = "users_books")
@Data
public class UsersBooks {

    @Id
    private int id;
    
    @JoinColumn(name = "userId")
    private List<User> user;
    
    @JoinColumn(name = "bookId" )
    private List<Book> book;
    
    @Column(name = "learningDate", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date learningDate;
}
