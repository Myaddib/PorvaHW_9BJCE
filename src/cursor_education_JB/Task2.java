package cursor_education_JB;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task2 {
// 2.Есть список пользователей (User {email, loginDate, team}).
// Отфильтровать пользователей, которые вошли в систему после
// неделю назад (7 днем тому), сгруппировать по команде, где K - team, V - email.

    public void startTask() {
        // создаем  базу пользователей
        List<User> listUser = new ArrayList<>();
        listUser.add(new User("basic@gmail.com", LocalDate.of(2202, 01, 10), "Basic"));
        listUser.add(new User("objectPascal@gmail.com", LocalDate.of(2202, 01, 11), "Pascal"));
        listUser.add(new User("java@gmail.com", LocalDate.of(2202, 01, 12), "Java"));
        listUser.add(new User("perl@gmail.com", LocalDate.of(2202, 01, 13), "Perl"));
        listUser.add(new User("php@gmail.com", LocalDate.of(2202, 01, 14), "PHP"));
        listUser.add(new User("pascal@gmail.com", LocalDate.of(2202, 01, 15), "Pascal"));
        listUser.add(new User("visualBasic@gmail.com", LocalDate.of(2202, 01, 16), "Basic"));
        listUser.add(new User("delphi@gmail.com", LocalDate.of(2202, 01, 17), "Pascal"));
        listUser.add(new User("python@gmail.com", LocalDate.of(2202, 01, 18), "Python"));

        System.out.println(listUser);
        // Берем дату и отнимаем 7 дней
        LocalDate sevenDaysAgo = LocalDate.now();
        sevenDaysAgo.minusDays(7);

        Supplier<Stream<User>> streamOfUsers = listUser::stream;


        var newList = listUser.stream()
                .filter(it -> it.getLoginData()
                        .isAfter(sevenDaysAgo)).collect(Collectors.groupingBy(User::getTeam, Collectors.toList()));
        for (int i = 0; i < newList.size(); i++) {
            System.out.println(newList.values());
        }
        System.out.println(newList);

//        var userSort = streamOfUsers.get()
//                .filter(it -> it.getLoginData()
//                        .isAfter(sevenDaysAgo))
//                        .collect(Collectors.toList());
//        System.out.println("users who logged in after week ago: " + userSort);
//
//
//        var userGroup = streamOfUsers.get()
//                .collect(Collectors.groupingBy(User::getTeam));
//        System.out.println("Group by a team: " + userGroup);
    }
}
