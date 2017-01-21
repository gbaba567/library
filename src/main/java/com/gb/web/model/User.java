/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gb.web.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
	name = "getAllUsers",
	query = "select * from users",
        resultClass = User.class
	)
})
@Entity
@Table(name = "users")
@Data
public class User {

	@Id
	@Column(name = "userId", nullable = false)
	private String id;

	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "phone", nullable = false)
	private String phone;

	@Column(name = "email", nullable = false)
	private String email;

	
  @OneToMany(fetch = FetchType.EAGER,  cascade = CascadeType.ALL)
    @JoinTable(
            name = "users_books",
            joinColumns =
            @JoinColumn(name = "userId"),
            inverseJoinColumns =
            @JoinColumn(name = "bookId"))
    @ElementCollection(targetClass=Book.class)
    private List<Book> books = new ArrayList<>();

}
