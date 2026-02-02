package com.hospital.hms.controller.form;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.*;

@Schema(description = "添加医生表单")
@Data
public class InsertDoctorForm {

    @NotBlank(message = "姓名不能为空")
    private String name;

    @NotBlank(message = "pid身份证号不能为空")
    @Pattern(regexp = "^(\\d{17}[0-9Xx])$", message = "身份证格式不正确")
    private String pid;

    @NotBlank(message = "sex不能为空")
    @Pattern(regexp = "^男$|^女$", message = "sex内容不正确")
    @Schema(description = "性别")
    private String sex;


    @NotBlank(message ="birthday不能为空")
    @Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}$", message = "生日格式不正确")
    private String birthday;


    @NotBlank(message ="school不能为空")
    @Length(min=2,max=50,message ="school内容不正确")
    private String school;


    @NotBlank(message ="degree不能为空")
    @Pattern(regexp = "^本科$|^研究生$|^博士$", message = "degree内容不正确")
    private String degree;


    @NotBlank(message = "tel不能为空")
    @Pattern(regexp = "^1[1-9][0-9]{9}$", message = "tel内容不正确")
    @Schema(description = "电话")
    private String tel;

    @NotBlank(message ="address不能为空")
    @Length(max=200,message ="address内容不正确")
    private String address;


    @Pattern(regexp = "^主治医师$|^副主治医师$|^主任医师$|^副主任医师$", message = "job内容不正确")
    @NotBlank
    private String job;

    @NotBlank(message = "内容不能为NULL")
    @Email(message = "email内容不正确")
    private String email;

    @NotBlank(message = "remark内容不能为空")
    private String remark;

    @NotBlank(message = "description内容不能为空")
    private String description;

    @NotNull(message = "hiredate不能为空")
    @Pattern(regexp = "^((((1[6-9]|[2-9]\\d)\\d{2})-(0?[13578]|1[02])-(0?[1-9]|[12]\\d|3[01]))|(((1[6-9]|[2-9]\\d)\\d{2})-(0?[13456789]|1[012])-(0?[1-9]|[12]\\d|30))|(((1[6-9]|[2-9]\\d)\\d{2})-0?2-(0?[1-9]|1\\d|2[0-8]))|(((1[6-9]|[2-9]\\d)(0[48]|[2468][048]|[13579][26])|((16|[2468][048]|[3579][26])00))-0?2-29-))$", message = "hiredate内容不正确")
    private String hiredate;

    private String[] tag;

    @NotNull(message = "recommended不能为空")
    private Boolean recommended;

    @NotNull(message = "status不能为空")
    @Range(min = 1,max = 3,message = "status不能超出范围")
    private Byte status;

    @NotNull(message = "subId不能为空")
    @Min(value = 1,message = "subId不能小于1")
    private Integer subId;

}
