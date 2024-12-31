package src.ch2;

import java.util.*;

public class Main {
    private static final String ERROR_MSG = "List, set, map 중에서 입력하세요";
    public static void main(String[] args) {
//        저장할 자료구조명을 입력합니다. (List / Set / Map)
//        내가 좋아하는 요리 제목을 먼저 입력합니다.
//        이어서 내가 좋아하는 요리 레시피를 한 문장씩 입력합니다.
//        입력을 마쳤으면 마지막에 “끝” 문자를 입력합니다.

        Scanner scanner = new Scanner(System.in);

        String structureName = getStructureName();

        String cookName = getCookName();

        switch (structureName.toUpperCase()) {

            case "LIST":
                List<String> list = new ArrayList<>();
                while (true) {
                    String receipt = scanner.nextLine();
                    if (receipt.equals("끝")) {
                        break;
                    }
                    list.add(receipt);
                }
                System.out.println("[List 으로 저장된 " + cookName + " ]");
                int listIdx=1;
                for (String s : list) {
                    System.out.println(listIdx+ ". " + s);
                    listIdx++;
                }
                break;
            case "SET":
                Set<String> set = new HashSet<>();
                while (true) {
                    String receipt = scanner.nextLine();
                    if (receipt.equals("끝")) {
                        break;
                    }
                    set.add(receipt);
                }
                System.out.println("[Set 으로 저장된 " + cookName + " ]");
                int setIdx=1;
                for (String s : set) {
                    System.out.println(setIdx+ ". " + s);
                    setIdx++;
                }
                break;
            case "MAP":
                Map<Integer, String> map =new HashMap<>();
                while (true) {
                    String receipt = scanner.nextLine();
                    if (receipt.equals("끝")) {
                        break;
                    }
                    map.put(map.size() + 1, receipt);
                }
                System.out.println("[Map 으로 저장된 " + cookName + " ]");
                for (Map.Entry<Integer, String> integerStringEntry : map.entrySet()) {
                    System.out.println(integerStringEntry.getKey() + "." + integerStringEntry.getValue());
                }
                break;
            default:
                break;
        }


    }

    private static String getCookName() {
        Scanner scanner = new Scanner(System.in);
        String cookName = "";
        while (cookName.isEmpty()) {
            System.out.print("요리제목");
            cookName = scanner.nextLine();
        }
        return cookName;
    }

    private static String getStructureName() {
        Scanner scanner = new Scanner(System.in);
        String structureName ="";
        while (structureName.isEmpty()) {
            System.out.print("자료 구조명 (List / Set / Map)");
            structureName = scanner.nextLine();
            String upper = structureName.toUpperCase();
            if(!upper.equals("LIST") && !upper.equals("SET") && !upper.equals("MAP")) {
                System.out.println(ERROR_MSG);
                structureName = "";
            }
        }
        return structureName;
    }
}
