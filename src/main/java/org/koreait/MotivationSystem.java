package org.koreait;

import java.text.SimpleDateFormat;
import java.util.Date;


import static org.koreait.App.motivations;

public class MotivationSystem {

    public static void add() {
        System.out.print("명언 : ");
        String content = Container.getScanner().nextLine();
        System.out.print("작가 : ");
        String author = Container.getScanner().nextLine();
        Date now = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String regDate = format.format(now);
        Motivation motivation = new Motivation(motivations.size() + 1, regDate, content, author);
        motivations.add(motivation);
        System.out.printf("%d번 명언이 등록되었습니다\n", motivations.size());
    }

    public static void list() {
        System.out.println("번호    /    작가    /    명언");
        System.out.println("===============================");
        for (int i = motivations.size() - 1; i >= 0; i--) {
            System.out.printf("%d  /    %s     /      %s     \n", motivations.get(i).getId(), motivations.get(i).getAuthor(), motivations.get(i).getContent());
        }
    }

    public static void modify(String[] cm) {
        Motivation modi = contain(cm);
        System.out.printf("명언(기존) :%s\n", modi.getContent());
        System.out.printf("작가(기존) :%s\n", modi.getAuthor());
        System.out.print("명언 : ");
        String content = Container.getScanner().nextLine();
        System.out.print("작가 : ");
        String author = Container.getScanner().nextLine();
        modi.setContent(content);
        modi.setAuthor(author);
        System.out.printf("%d번 명언이 수정되었습니다.\n", modi.getId());
    }

    public static void detail(String[] cm) {
        Motivation modi = contain(cm);
        if (modi == null) {
            System.out.printf("%s번 명언은 존재하지 않습니다.\n", cm[1]);
            return;
        }
        System.out.printf("번호 : %d \n", modi.getId());
        System.out.printf("날짜 : %s \n", modi.getRegDate());
        System.out.printf("명언 : %s \n", modi.getContent());
        System.out.printf("작가 : %s \n", modi.getAuthor());
    }

    public static void delete(String[] cm) {
        Motivation modi = contain(cm);
        if (modi == null) {
            System.out.printf("%s번 명언은 존재하지 않습니다.\n", cm[1]);
            return;
        }
        motivations.remove(modi);
        System.out.printf("%d번 명언이 삭제되었습니다.\n", modi.getId());

    }
    public static Motivation contain(String[] cm) {

        for (Motivation motivation : motivations) {
            if (motivation.getId() == Integer.parseInt(cm[1])) {
                return motivation;
            }

        }
        return null;
    }
}
