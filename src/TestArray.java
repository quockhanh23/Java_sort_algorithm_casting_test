import Test.Account;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestArray {
    public static void main(String[] args) {
        List<Account> list = new ArrayList<>();
        Account account = new Account();
        account.setAge(null);
        account.setEmail(null);
        account.setName("khánh");
        list.add(account);
        List<String[]> dataRows = list
                .stream().map(data -> new String[]{
                        data.getAge(), data.getEmail(), data.getName(), data.getPassword()
                }).toList();
        for (int i = 0; i < dataRows.size(); i++) {
            System.out.println(Arrays.toString(dataRows.get(i)));
        }
    }
}
