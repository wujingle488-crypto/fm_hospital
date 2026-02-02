package com.hospital.hms.controller.form;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.*;

@Schema(description = "修改医生信息表单")
@Data
public class UpdateDoctorForm {

    @NotNull(message = "id不能为空")
    @Min(value = 1,message = "id不能小于1")
    @Schema(description = "id")
    private Integer id;

    @NotBlank(message = "姓名不能为空")
    @Pattern(regexp = "^[\\u4e00-\\u9f5a]{2,20}$", message = "name内容不正确")
    @Schema(description = "姓名")
    private String name;

    @NotBlank(message = "pid身份证号不能为空")
    private String pid;

    @NotBlank(message = "sex不能为空")
    @Pattern(regexp = "^男$|^女$", message = "sex内容不正确")
    @Schema(description = "性别")
    private String sex;


    @NotBlank(message ="birthday不能为空")
    private String birthday;


    @NotBlank(message ="school不能为空")
    @Length(min=2,max=50,message ="school内容不正确")
    private String school;


    @NotBlank(message ="degree不能为空")
    @Pattern(regexp = "^本科$|^研究生$|^博士$", message = "degree内容不正确")
    private String degree;


    @NotBlank(message = "tel不能为空")
    @Schema(description = "电话")
    private String tel;


    @NotBlank(message ="address不能为空")
    @Length(max=200,message ="address内容不正确")
    private String address;

    @NotBlank(message = "内容不能为NULL")
    @Email(message = "email内容不正确")
    @Schema(description = "邮箱")
    private String email;

    @Pattern(regexp = "^主治医师$|^副主治医师$|^主任医师$|^副主任医师$", message = "job内容不正确")
    @NotBlank
    private String job;

    private String remark;

    private Integer subId;

    private String description;

    @NotNull(message = "hiredate不能为空")
    @Schema(description = "入职日期")
    private String hiredate;

    private String[] tag;

    private Boolean recommended;

    private Integer status;


}
