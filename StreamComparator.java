import java.util.Comparator;

public class StreamComparator implements Comparator<Stream> {
    // Метод для сравнения потоков по количеству учебных групп
    @Override
    public int compare(Stream stream1, Stream stream2) {
        return Integer.compare(stream1.getGroups().size(), stream2.getGroups().size());
    }
}