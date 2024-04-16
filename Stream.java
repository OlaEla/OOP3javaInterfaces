import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup> {
    // Список учебных групп в потоке
    private List<StudentGroup> groups;

    // Конструктор класса Stream
    public Stream() {
        this.groups = new ArrayList<>();
    }

    // Метод добавления учебной группы в поток
    public void addGroup(StudentGroup group) {
        groups.add(group);
    }

    // Реализация метода iterator интерфейса Iterable
    @Override
    public Iterator<StudentGroup> iterator() {
        return groups.iterator();
    }

    // Метод для получения списка учебных групп
    public List<StudentGroup> getGroups() {
        return groups;
    }

    // Метод для получения кириллического названия потока
    public String getName() {
        if (!groups.isEmpty()) {
            // Возьмем имя первой группы потока как его название
            return groups.get(0).getName();
        } else {
            return "Неизвестный поток";
        }
    }
}