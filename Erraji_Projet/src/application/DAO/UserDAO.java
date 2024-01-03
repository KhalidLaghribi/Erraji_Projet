package application.DAO;

import application.model.User;

public interface UserDAO {
	boolean insert_User(User user);
	User findUser(String email);
	void deleteUser(int Id);
}


/*package DAO;

import java.util.List;

import model.Cours;

public interface CoursDao {
	void insertCours(Cours Cours);
    Cours findCours(int id);
    List<Cours> findAll();
    void updateCours(Cours Cours);
    void deleteCours(int id);
}
*/