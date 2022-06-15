import java.time.ZonedDateTime;

/**
 * @Description
 * @Author 无忧
 * @Date 2022/6/13 21:08
 */
public class T2 {

    public static void main(String[] args) {
        ZonedDateTime zbj = ZonedDateTime.now();    // 默认时区
        System.out.println(zbj);
    }
}
