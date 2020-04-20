package xin.cymall.controller;

import java.util.List;
import java.util.Map;

import xin.cymall.common.enumresource.StateEnum;
import xin.cymall.common.log.SysLog;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;

import xin.cymall.entity.GJc;
import xin.cymall.service.GJcService;
import xin.cymall.common.utils.PageUtils;
import xin.cymall.common.utils.Query;
import xin.cymall.common.utils.R;


/**
 *
 */
@Controller
@RequestMapping("gjc")
public class GJcController {
    @Autowired
    private GJcService gJcService;

    /**
     * 跳转到列表页
     */
    @RequestMapping("/list")
//    @RequiresPermissions("gjc:list")
    public String list() {
        return "gjc/list";
    }

    /**
     * 列表数据
     */
    @ResponseBody
    @RequestMapping("/listData")
    @RequiresPermissions("gjc:list")
    public R listData(@RequestParam Map<String, Object> params) {
        //查询列表数据
        Query query = new Query(params);

        List<GJc> gJcList = gJcService.getList(query);

        int total = gJcService.getCount(query);

        PageUtils pageUtil = new PageUtils(gJcList, total, query.getLimit(), query.getPage());

        return R.ok().put("page", pageUtil);
    }

    /**
     * 跳转到新增页面
     **/
    @RequestMapping("/add")
    @RequiresPermissions("gjc:save")
    public String add() {
        return "gjc/add";
    }

    /**
     * 跳转到修改页面
     **/
    @RequestMapping("/edit/{id}")
    @RequiresPermissions("gjc:update")
    public String edit(Model model, @PathVariable("id") String id) {
        GJc gJc = gJcService.get(id);
        model.addAttribute("model", gJc);
        return "gjc/edit";
    }

    /**
     * 信息
     */
    @ResponseBody
    @RequestMapping("/info/{id}")
    @RequiresPermissions("gjc:info")
    public R info(@PathVariable("id") String id) {
        GJc gJc = gJcService.get(id);
        return R.ok().put("gJc", gJc);
    }

    /**
     * 保存
     */
    @ResponseBody
    @SysLog("保存")
    @RequestMapping("/save")
    @RequiresPermissions("gjc:save")
    public R save(@RequestBody GJc gJc) {
        gJcService.save(gJc);

        return R.ok();
    }

    /**
     * 修改
     */
    @ResponseBody
    @SysLog("修改")
    @RequestMapping("/update")
    @RequiresPermissions("gjc:update")
    public R update(@RequestBody GJc gJc) {
        gJcService.update(gJc);

        return R.ok();
    }

    /**
     * 启用
     */
    @ResponseBody
    @SysLog("启用")
    @RequestMapping("/enable")
    @RequiresPermissions("gjc:update")
    public R enable(@RequestBody String[] ids) {
        String stateValue = StateEnum.ENABLE.getCode();
        gJcService.updateState(ids, stateValue);
        return R.ok();
    }

    /**
     * 禁用
     */
    @ResponseBody
    @SysLog("禁用")
    @RequestMapping("/limit")
    @RequiresPermissions("gjc:update")
    public R limit(@RequestBody String[] ids) {
        String stateValue = StateEnum.LIMIT.getCode();
        gJcService.updateState(ids, stateValue);
        return R.ok();
    }

    /**
     * 删除
     */
    @ResponseBody
    @SysLog("删除")
    @RequestMapping("/delete")
    @RequiresPermissions("gjc:delete")
    public R delete(@RequestBody String[] ids) {
        gJcService.deleteBatch(ids);

        return R.ok();
    }

}
