<#--  公用页面-->
<#--  chenyi 2020-04-20 21:20:29-->
            <div class="layui-form-item">${(model.bucket)!""}
<#--            <label class="layui-form-label"><span class="span_must">*</span></label>-->
            <div class="layui-input-normal" hidden="hidden">
                <input type="text"  name="id" maxlength="11" lay-verify="required" hidden="hidden"
                       value="${(model.id)!""}"  placeholder="请输入"  class="layui-input" >
            </div>
        </div>

              <div class="layui-form-item">${(model.bucket)!""}
            <label class="layui-form-label">业务流水号<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="ywlsh" maxlength="255" lay-verify="required"
                 value="${(model.ywlsh)!""}"  placeholder="自动生成"  class="layui-input" >
            </div>
        </div>

              <div class="layui-form-item">${(model.bucket)!""}
            <label class="layui-form-label">汇缴的状态<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="status" maxlength="2" lay-verify="required"
                 value="${(model.status)!""}"  placeholder="请输入汇缴的状态"  class="layui-input">
            </div>
        </div>

              <div class="layui-form-item">${(model.bucket)!""}
            <label class="layui-form-label">汇缴的单位账号<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="dwzh" maxlength="255" lay-verify="required"
                 value="${(model.dwzh)!""}"  placeholder="请输入汇缴的单位账号"  class="layui-input" >
            </div>
        </div>

              <div class="layui-form-item">${(model.bucket)!""}
            <label class="layui-form-label">单位的汇缴额<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="money" maxlength="255,0" lay-verify="required"
                 value="${(model.money)!""}"  placeholder="请输入单位的汇缴额"  class="layui-input" >
            </div>
        </div>

              <div class="layui-form-item">${(model.bucket)!""}
            <label class="layui-form-label">单位缴存的月份<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="jcdate" maxlength="20" lay-verify="required"
                 value="${(model.jcdate)!""}"  placeholder="5645"  class="layui-input">
            </div>
        </div>

              <div class="layui-form-item">${(model.bucket)!""}
            <label class="layui-form-label">单位缴存人数<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="jcrs" maxlength="255" lay-verify="required"
                 value="${(model.jcrs)!""}"  placeholder="请输入单位缴存人数"  class="layui-input" >
            </div>
        </div>

              <div class="layui-form-item">
            <label class="layui-form-label">状态</label>
            <div cyType="radioTool" cyProps="enumName:'StateEnum'" name="state"
                 value="${(model.state)!"1"}" class="layui-input-inline"></div>
        </div>
