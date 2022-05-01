package 实验1.简单工厂;

public class Nvwa {
    public static Person getPerson(char kind) {
        switch (kind) {
            case 'M':
                return new Man();
            case 'W':
                return new Woman();
            case 'R':
                return new Robot();
        }
        return null;
    }
}