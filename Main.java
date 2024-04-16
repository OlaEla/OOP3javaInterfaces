import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StreamService streamService = new StreamService();

        // Создание потоков и добавление учебных групп
        Stream itStream = new Stream();
        itStream.addGroup(new StudentGroup("Разработчики"));
        itStream.addGroup(new StudentGroup("Программисты Java"));
        itStream.addGroup(new StudentGroup("Разработчики Python"));
        itStream.addGroup(new StudentGroup("Веб-разработчики"));
        itStream.addGroup(new StudentGroup("Тестировщики ПО"));

        Stream engineeringStream = new Stream();
        engineeringStream.addGroup(new StudentGroup("Механики"));
        engineeringStream.addGroup(new StudentGroup("Строители"));
        engineeringStream.addGroup(new StudentGroup("Проектировщики"));
        engineeringStream.addGroup(new StudentGroup("Электротехники"));

        Stream businessStream = new Stream();
        businessStream.addGroup(new StudentGroup("Маркетологи"));
        businessStream.addGroup(new StudentGroup("Финансисты"));
        businessStream.addGroup(new StudentGroup("HR-специалисты"));
        businessStream.addGroup(new StudentGroup("Бизнес-аналитики"));

        Stream artStream = new Stream();
        artStream.addGroup(new StudentGroup("Художники"));
        artStream.addGroup(new StudentGroup("Дизайнеры"));
        artStream.addGroup(new StudentGroup("Архитекторы"));

        Stream machineLearningStream = new Stream();
        machineLearningStream.addGroup(new StudentGroup("Машинное обучение"));
        machineLearningStream.addGroup(new StudentGroup("Глубокое обучение"));

        // Создание списка потоков и добавление в него созданных потоков
        List<Stream> streams = new ArrayList<>();
        streams.add(itStream);
        streams.add(engineeringStream);
        streams.add(businessStream);
        streams.add(artStream);
        streams.add(machineLearningStream);

        // Сортировка списка потоков по количеству учебных групп
        streamService.sortStreams(streams);

        // Вывод отсортированных потоков
        for (Stream s : streams) {
            System.out.println("Поток " + s.getName() + " с количеством групп: " + s.getGroups().size());
            for (StudentGroup group : s) {
                System.out.println(" - " + group.getName());
            }
            System.out.println(); // Пустая строка между потоками
        }
    }
}