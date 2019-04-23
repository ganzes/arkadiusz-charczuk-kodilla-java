package com.kodilla.stream.forum;

import com.kodilla.stream.forumuser.Forum;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public final class ForumUser {
    private final String userName;
    private final String realName;
    private final String location;
    private final Set<ForumUser> friends = new HashSet<>();

    public ForumUser(final String userName, final String realName, final String location) {
        this.userName = userName;
        this.realName = realName;
        this.location = location;
    }

    public void addFriend(ForumUser user){
        friends.add(user);
    }

    public boolean removeFriend(ForumUser user){
        return friends.remove(user);
    }

    public String getUserName() {
        return userName;
    }

    public String getRealName() {
        return realName;
    }

    public String getLocation() {
        return location;
    }

    public Set<ForumUser> getFriends(){
        return friends;
    }

    public Set<String> getLocationsOfFriends(){
        return friends.stream()
                .map(friend -> friend.getLocation())
                .collect(Collectors.toSet());
    }

    public Set<String> getLocationsOfFriendsOfFriends(){
        return friends.stream()//tworzony jest i uruchamiany strumień na kolekcji friends.
                .flatMap(user -> user.getFriends().stream())//dokonujemy spłaszczenia strumienia - dla każdego
                // przyjaciela (user) pobieramy jego listę przyjaciół (user.getFriends()) i ją przekazujemy do
                // dalszego przetwarzania w postaci nowego strumienia Stream.
                // Od tego momentu pracujemy nie na liście przyjaciół, lecz na liście "przyjaciół przyjaciół".
                .filter(user -> user != this)//wykluczamy ze zbioru wynikowego odwołania do "samego siebie" -
                // wiadomo, że my też jesteśmy przyjacielem naszych przyjaciół, jednak interesują nas ich
                // lokalizacje, a nie nasza własna.
                .map(ForumUser::getLocation)//transformujemy strumień tak, że zamiast obiektów ForumUser,
                // dalej będą już przez niego przepływały jedynie obiekty String będące lokalizacjami
                // użytkowników (pobieramy je przy pomocy metody ForumUser::getLocation).
                .collect(Collectors.toSet());//dokonujemy złożenia strumienia wynikowego w kolekcję typu Set
        // zawierającą listę lokalizacji "przyjaciół przyjaciół".
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userName='" + userName + '\'' +
                ", realName='" + realName + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ForumUser)) return false;

        ForumUser forumUser = (ForumUser) o;

        return getUserName().equals(forumUser.getUserName());

    }

    @Override
    public int hashCode() {
        return getUserName().hashCode();
    }
}
