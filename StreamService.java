import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StreamService {
    // Метод сортировки списка потоков с использованием StreamComparator
    public void sortStreams(List<Stream> streams) {
        // Создаем экземпляр компаратора
        Comparator<Stream> comparator = new StreamComparator();
        // Сортируем список потоков
        Collections.sort(streams, comparator);
    }
}