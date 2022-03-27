package ca.jrvs.apps;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * Create a DAO
 * Implement CRUD practice
 *
 * - DAO: isolates the application/business layer from persistence layer (usually relational database)
 *
 */
class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

}

interface DAOInterface<T> {
    /*
        Defines an abstract API that performs CRUD operations on object of type T
     */
    Optional<T> get(long id);

    List<T> getAll();

    void save(T t);

    void update(T t, String[] params);

    void delete(T t);
}

public class DAO implements DAOInterface<User> {
    private List<User> users = new ArrayList<>();

    public DAO(){
        users.add(new User("John","1234"));
        users.add(new User("Rex","1235"));
    }

    @Override
    public Optional<User> get(long id) {
        return Optional.ofNullable(users.get((int) id));
    }

    @Override
    public List<User> getAll() {
        return users;
    }

    @Override
    public void save(User user) {
        users.add(user);
    }

    @Override
    public void update(User user, String[] params) {
        user.setName(Objects.requireNonNull(params[0],"Name cannot be nul"));
        user.setEmail(Objects.requireNonNull(params[1],"Email cannot be null"));
    }

    @Override
    public void delete(User user) {
        users.remove(user);
    }
}

class DAOTest {
    private static DAOInterface<User> userDAO;

    public static void main(String[] args){
        userDAO = new DAO();

        userDAO.getAll().forEach(user -> System.out.println("1) " + user.getName()));

        User user1 = getUser(0);
        System.out.println("1st user: " + user1.getName());
        userDAO.update(user1, new String[]{"Jay","4321"});

        userDAO.getAll().forEach(user -> System.out.println("2) "+user.getName()));

        User user2 = getUser(1);
        System.out.println("2nd user - going to Delete: " + user2.getName());
        userDAO.delete(user2);
        userDAO.getAll().forEach(user -> System.out.println("3) " + user.getName()));


        userDAO.save(new User("July","2341"));

        userDAO.getAll().forEach(user -> System.out.println(user.getName()));
    }

    private static User getUser(long id){
        Optional<User> user = userDAO.get(id);
        return user.orElseGet(() -> new User("non-existing user","no email"));
    }
}
