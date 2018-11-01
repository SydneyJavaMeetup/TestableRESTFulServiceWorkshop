package workshop;

import act.db.jpa.JPADao;

import javax.persistence.*;

@Entity(name = "bookmark")
public class Bookmark {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    public String url;

    public String description;

    public static class Dao extends JPADao<Integer, Bookmark> {}
}
