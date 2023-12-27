package hello.servlet.web.springmvc.v1;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


//@Component // 컴포넌트 스캔을 통해 스프링 빈으로 등록
//@RequestMapping
@Controller // 자동으로 스프링 빈 등록, 컴포넌트 스캔의 대상.
public class SpringMemberFormControllerV1 {

    @RequestMapping("/springmvc/v1/members/new-form")
    public ModelAndView process(){
        // 모델과 뷰 정보를 담아서 반환
        return new ModelAndView("new-form");
    }
}
