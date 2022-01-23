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
        listUser.add(new User("basic@gmail.com", LocalDate.of(2021, 01, 10), "Basic"));
        listUser.add(new User("objectPascal@gmail.com", LocalDate.of(2022, 01, 11), "Pascal"));
        listUser.add(new User("java@gmail.com", LocalDate.of(2022, 01, 23), "Java"));
        listUser.add(new User("perl@gmail.com", LocalDate.of(2022, 01, 22), "Perl"));
        listUser.add(new User("php@gmail.com", LocalDate.of(2022, 01, 21), "PHP"));
        listUser.add(new User("pascal@gmail.com", LocalDate.of(2022, 01, 20), "Pascal"));
        listUser.add(new User("visualBasic@gmail.com", LocalDate.of(2022, 01, 16), "Basic"));
        listUser.add(new User("delphi@gmail.com", LocalDate.of(2022, 01, 22), "Pascal"));
        listUser.add(new User("python@gmail.com", LocalDate.of(2022, 01, 23), "Python"));


        Supplier<Stream<User>> streamOfUsers = listUser::stream;

// Отфильтровать пользователей, которые вошли в систему после
// неделю назад (7 днем тому).
        var userSort = streamOfUsers.get()
                .filter(it -> it.getLoginData()
                        .isAfter(LocalDate.now().minusDays(7))).toList();
        System.out.println(userSort);

// сгруппировать по команде, где K - team, V - email.
        var userGroup = streamOfUsers.get()
                .collect(Collectors.groupingBy(User::getTeam));
        System.out.println(userGroup);
    }
}
