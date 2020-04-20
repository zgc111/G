<#--  chenyi 2020-04-20 21:20:29-->

<html>
<head>
    <title>详情页面</title>
    <#include "../resource.ftl"/>
</head>
<body>
<div class="layui-field-box">
    <form class="layui-form" action="">
             <div class="layui-form-item">
            <label class="layui-label-left"><span class="label_span">:</span></label>
            <label class="layui-label-right">${(model.id)!"-"}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">业务流水号<span class="label_span">:</span></label>
            <label class="layui-label-right">${(model.ywlsh)!"-"}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">汇缴的状态<span class="label_span">:</span></label>
            <label class="layui-label-right">${(model.status)!"-"}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">汇缴的单位账号<span class="label_span">:</span></label>
            <label class="layui-label-right">${(model.dwzh)!"-"}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">单位的汇缴额<span class="label_span">:</span></label>
            <label class="layui-label-right">${(model.money)!"-"}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">单位缴存的月份<span class="label_span">:</span></label>
            <label class="layui-label-right">${(model.jcdate)!"-"}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">单位缴存人数<span class="label_span">:</span></label>
            <label class="layui-label-right">${(model.jcrs)!"-"}</label>
        </div>
          </form>
</div>

</body>
</html>
