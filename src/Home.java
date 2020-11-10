import cn.jrac.util.StringHelper;
import cn.jrac.service.*;
import cn.jrac.service.impl.*;

public class Home {
    public static void main(String[] args) {
        String str = "abcdefgadasda123";
        IPersonService personService = new PersonService();
        personService.toSay(str);
        StringHelper.toArray(str);
    }
}
