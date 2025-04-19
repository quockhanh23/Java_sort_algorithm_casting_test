package Test_Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsToMap {
    public static void main(String[] args) {

        Map<Integer, String> map1 = Arrays.asList(1, 2, 3, 4, 5, 5, 6)
                .stream().collect(Collectors.toMap(Integer::intValue, Object::toString));

        Map<Integer, String> map2 = Stream.of(1, 2, 3, 4, 5, 5, 6)
                .collect(Collectors.toMap(Integer::intValue, Object::toString));

        Map<Integer, String> map = Arrays.asList(1, 2, 3, 4, 5, 6).stream()
                .collect(Collectors.toMap(
                        Integer::intValue,
                        i -> i.toString(), (existing, replacement) -> existing // Giữ lại giá trị cũ
                ));

        System.out.println(map1);
        System.out.println(map);


        // 2 danh sách nhưng trỏ cùng vào 1 đối tượng ở heap
        // Steam tạo ra 1 danh sách mới nhưng đối tượng bên trong đang trỏ cùng đến vị trị của đối tượng ở danh sách ban đầu
        // Khi thay đổi giá trị của đối tượng đó trong stream thì đối tượng trong list ban đầu cũng bị thay đổi theo
        List<StreamTest> streamTestList = new ArrayList<>();
        StreamTest streamTest = new StreamTest("KK");
        StreamTest streamTest2 = new StreamTest("CC");
        streamTestList.add(streamTest);
        streamTestList.add(streamTest2);

        List<StreamTest> streamTestList1 = streamTestList.stream().filter(i -> {
            i.name = "4444";
            return true;
        }).collect(Collectors.toList());

        System.out.println(streamTestList);
        System.out.println(streamTestList1);
    }

    public static class StreamTest {
        public String name;

        public StreamTest(String name) {
            this.name = name;
        }
    }

}
