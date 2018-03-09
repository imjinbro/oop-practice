// 한 라인에는 한 점만 사용하기 : 책임소재 분명하게, 코드 깔끔하게
public class OneLineOneDot {

    public static String[] exam() {
        String target = "aaaaasdmdamda,.ad..dasdasdad,ad,a,da.d";
        //String[] result = target.replace('.', ',').concat("adasdczxczcsad").split(",");
        target = replaceDot(target);
        target = attachSentence(target, "adadadadazxczx");
        return divideSentence(target, ",");
    }

    private static String replaceDot(String target) {
        return target.replace('.', ',');
    }

    private static String attachSentence(String origin, String extra) {
        return origin.concat(extra);
    }

    private static String[] divideSentence(String target, String delimiter) {
        return target.split(delimiter);
    }
}
