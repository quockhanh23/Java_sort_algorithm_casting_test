import Test.Account;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestDuplicate {
    public static List<Account> filterDuplicate(List<Account> list) {
        List<Account> list1 = new ArrayList<>();
        list.sort((p1, p2) -> (p2.getName().compareTo(p1.getName())));
        Collections.reverse(list);
        for (int i = 0; i < list.size(); i++) {
            if (i + 1 == list.size()) {
                break;
            }
            if (list.get(i).getName().equals(list.get(i + 1).getName())) {
                list1.add(list.get(i));
            }
        }
        list.removeAll(list1);
        return list;
    }

    public static void main(String[] args) {
        Account account1 = new Account("1", "hhhh", "khanh", "alo4", "alo5", "545");
        Account account11 = new Account("1.1", "hhhh", "khanh", "alo4", "alo5", "545");
        List<Account> accountList = new ArrayList<>();
        accountList.add(account1);
        accountList.add(account11);

        System.out.println(accountList.size());
        System.out.println(filterDuplicate(accountList));
        System.out.println(accountList.size());
    }
}
