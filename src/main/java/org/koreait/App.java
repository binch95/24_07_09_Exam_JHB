package org.koreait;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class App {
    static ArrayList<Motivation> motivations = new ArrayList<>();
    public App() {

        System.out.println("== 명언 앱 실행 ==");
        String[] cm = new String[0];

        while (true) {
            System.out.print("명령어) ");
            String cmd = Container.getScanner().nextLine();
            if (cmd.split("\\?").length >= 2) {
                String[] ra = cmd.split("\\?");
                cm = ra[1].split("\\=");
                if(cm.length == 1){
                    System.out.println("명령어를 잘못 입력하셨습니다.");
                    continue;
                }
            }

            if (cmd.equals("종료")) {
                System.out.println("== 명언 앱 종료 ==");
                break;
            }

            if (cmd.equals("등록")) {
                MotivationSystem.add();


            } else if (cmd.equals("목록")) {
                MotivationSystem.list();

            } else if (cmd.startsWith("수정?")) {
                MotivationSystem.modify(cm);

            } else if (cmd.startsWith("상세보기?")) {
                MotivationSystem.detail(cm);

            } else if (cmd.startsWith("삭제?")) {
                MotivationSystem.delete(cm);

            }

        }

    }


}
