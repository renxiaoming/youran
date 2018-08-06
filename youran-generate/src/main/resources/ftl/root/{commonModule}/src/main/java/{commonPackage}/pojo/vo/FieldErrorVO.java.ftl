<#include "/common.ftl">
<#--定义主体代码-->
<#assign code>
<@call this.addImport("${this.commonPackage}.util.JsonUtil")/>
<@call this.printClassCom("参数错误-错误字段信息")/>
public class FieldErrorVO {

    private final String objectName;

    private final String field;

    private final String errorMsg;

    public FieldErrorVO(String dto, String field, String errorMsg) {
        this.objectName = dto;
        this.field = field;
        this.errorMsg = errorMsg;
    }

    public String getObjectName() {
        return objectName;
    }

    public String getField() {
        return field;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    @Override
    public String toString() {
        return JsonUtil.toJSONString(this);
    }
}
</#assign>
<#--开始渲染代码-->
package ${this.commonPackage}.pojo.vo;

<@call this.printImport()/>

${code}
