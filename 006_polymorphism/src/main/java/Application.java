public class Application {
    public static void main(String[] args) {
        AppOnWindows idea = new Idea();
        System.out.println("按下F5时候Intellij Idea的响应:");
        idea.printF5();
        AppOnWindows chrome = new Chrome();
        System.out.println("按下F5时候Chrome的响应:");
        chrome.printF5();
        AppOnWindows wechat = new Wechat();
        System.out.println("按下F5时候Wechat的响应:");
        wechat.printF5();
    }
}
