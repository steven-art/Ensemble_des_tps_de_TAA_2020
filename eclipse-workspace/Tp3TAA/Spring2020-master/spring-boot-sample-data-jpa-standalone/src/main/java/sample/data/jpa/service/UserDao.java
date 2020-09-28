package sample.data.jpa.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import sample.data.jpa.domain.User;

// Imports ...

@Transactional
public interface UserDao extends JpaRepository<User, Long> {

  /**
   * This method will find an User instance in the database by its email.
   * Note that this method is not implemented and its working code will be
   * automagically generated from its signature by Spring Data JPA.
   */
  public User findByEmail(String email);
  
  
  // le as u est présent pour crée l'alias
  @Query("select u from User as u where u.name =name ")
  public User findByUser(String name);

}