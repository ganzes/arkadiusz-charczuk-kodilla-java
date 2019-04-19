package stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> forumUsersList = new ArrayList<>();

    public Forum () {
        forumUsersList.add(new ForumUser(1, "All Bundy", 'M', LocalDate.of(1948, 11, 7), 2));
        forumUsersList.add(new ForumUser(2, "Ryan Reynlokd", 'M', LocalDate.of(1987, 9, 12), 200));
        forumUsersList.add(new ForumUser(3, "Drew Barrymore", 'F', LocalDate.of(1955, 9, 23), 15));
        forumUsersList.add(new ForumUser(4, "John Kent", 'M', LocalDate.of(1999, 2, 20), 158));
        forumUsersList.add(new ForumUser(5, "Miechelle Phefier", 'F', LocalDate.of(2011, 8, 11), 25));
        forumUsersList.add(new ForumUser(6, "Henu Hanajaj", 'F', LocalDate.of(2000, 12, 15), 0));
        forumUsersList.add(new ForumUser(7, "Alex Burhnahm", 'M', LocalDate.of(2005, 5, 18), 0));
        forumUsersList.add(new ForumUser(8, "Allison Parker", 'F', LocalDate.of(1998, 6, 25), 69));
        forumUsersList.add(new ForumUser(9, "Monika Lovall", 'F', LocalDate.of(1999, 7, 26), 777));
        forumUsersList.add(new ForumUser(10, "Anna Pana", 'F', LocalDate.of(2001, 3, 13), 555));
    }

    public List<ForumUser> getForumUsersList(){
        return new ArrayList<>(forumUsersList);
    }
}
