package com.fan.eduservice.controller;

import com.fan.eduservice.domain.EduTeacher;
import com.fan.eduservice.service.EduTeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/edu_service/teacher")
public class EduTeacherController {
    
    @Autowired
    private EduTeacherService eduTeacherService;

    /**
     * 获取所有老师
     * @return
     */
    @GetMapping("getAll")
    public List<EduTeacher> getAll(){
        return eduTeacherService.list(null);
    }

    /**
     * 删除一个老师
     * @param id
     * @return
     */
    @DeleteMapping("deleteOne/{id}")
    public Boolean deleteOneById(@PathVariable String id){
        boolean b = eduTeacherService.removeById(id);
        return b;
    }
}
