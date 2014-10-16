package puzzle;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("context.xml");
        ctx.refresh();

        final Bean bean = ctx.getBean(Bean.class);

        System.out.println(bean.getOsName());
    }
}
