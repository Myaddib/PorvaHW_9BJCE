package cursor_education_JB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Task4 {

    public void startTask() {

        // *4 Есть коллекция ящиков (Box). Каждая коробка содержит список
        // некоторых вещей (Thing). Вещи могут быть хрупкими.
        // Задача - добавить дополнительную упаковку (протектор) для
        // хрупких вещей с помощью потоков.

        List<Thing> thingList = Arrays.asList(new Thing("Ложка"), new Thing("Китайська ваза", true),
                new Thing("Кришталева ваза", true), new Thing("Виделка"));

        List<Thing> thingList1 = Arrays.asList(new Thing("Ніж"), new Thing("Тарілка", true), new Thing("Миска"),
                new Thing("Скляна мірка", true), new Thing("Ополоник"));

        List<Box> boxList = new ArrayList<>();
        boxList.add(new Box(thingList));
        boxList.add(new Box(thingList1));

        boxList.stream()
                .map(Box::getThings)
                .flatMap(Collection::stream)
                .filter(Thing::isFragile)
                .peek(Thing::addExtraPacking)
                .forEach(it -> System.out.println(it + "\n"));
    }
}
