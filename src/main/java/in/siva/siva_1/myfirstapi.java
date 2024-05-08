package in.siva.siva_1;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myfirstapi {

    @RequestMapping("/hello")
    public String sayHello(){
        return "Hello class !";
    }
    @RequestMapping("/hello/{name}/")
    public String sayHelloName(@PathVariable("name") String name){
return "Hello " + name;
    }
    @RequestMapping("/hello/{name}/{times}")
    public String sayHelloNametimes(@PathVariable("name") String name,
                                    @PathVariable("times") int times){
        String str="";
        for(int i=0;i<times;i++){
            str += name +" "+ (i);
            str +="<br>";
        }
        return str;
    }
}
