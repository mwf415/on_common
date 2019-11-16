package cn.onlov.utils.module.vo;

import cn.onlov.utils.module.annotation.ExcelField;
import lombok.Data;

import java.util.Date;
@Data
public class ScoreVo {
    @ExcelField(name = "考试编号", column = "A")
    private Integer examId;

    @ExcelField(name = "考试名称", column = "B")
    private String examTitle;


    @ExcelField(name = "考生名字", column = "C")
    private String realName;

    @ExcelField(name = "考生ID", column = "D")

    private String userId;

    @ExcelField(name = "考试分数", column = "E")
    private Integer score;

    @ExcelField(name = "考试状态", column = "F")
    private Integer state;


    @ExcelField(name = "考试时间", column = "G")
    private Date joinTime;

}
