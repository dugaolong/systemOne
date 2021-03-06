package cn.dgl.www.systemone;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.media.AudioManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    MyStatusReceiver mMyStatusReceiver;
    int num, num2;
    EditText input_num1, input_num2;
    Context mContext;
    List<ApplicationInfo> mApplicationInfos;
    Set<String> allowPackages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        queryFilterAppInfo();//获取所有的app信息
        mContext = this;
        input_num1 = (EditText) findViewById(R.id.input_num1);
        input_num2 = (EditText) findViewById(R.id.input_num2);
        Button button1 = (Button) findViewById(R.id.button1);

        // 注册广播，添加三个Action
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(AudioManager.RINGER_MODE_CHANGED_ACTION);
        mMyStatusReceiver = new MyStatusReceiver();
        registerReceiver(mMyStatusReceiver, intentFilter); // 注册监听广播

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
//                try {
//                    uninsall();
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
                signqutoutiao();
                signtaotoutiao();
                if (TextUtils.isEmpty(input_num1.getText().toString())) {
                    Toast.makeText(mContext, "1填数字", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (TextUtils.isEmpty(input_num2.getText().toString())) {
                    Toast.makeText(mContext, "2填数字", Toast.LENGTH_SHORT).show();
                    return;
                }
                num = Integer.valueOf(input_num1.getText().toString());
                num2 = Integer.valueOf(input_num2.getText().toString());
                try {
                    if (allowPackages.contains("com.jifen.qukan") && num > 10) {
                        qutoutiao();
                    }
                    if (allowPackages.contains("com.kuaima.kuailai") && num2 > 10) {
                        taotoutiao();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    private void qutoutiao() throws Exception {
        //趣头条
        Thread.sleep(3000);
        execShellCmd("am start -n com.jifen.qukan/com.jifen.qkbase.main.MainActivity");
        Thread.sleep(10000);
        for (int i = 1; i < num; i++) {
//            Log.v("qutoutiao", "第" + i + "次start");
//            if (i % 50 == 0) {
//                execShellCmd("am force-stop com.jifen.qukan");
//                Thread.sleep(3000);
//                execShellCmd("am start -n com.jifen.qukan/com.jifen.qkbase.main.MainActivity");
//                Thread.sleep(12000);
//            }
            execShellCmd("input tap 187 187");
            Thread.sleep(5000);
            execShellCmd("input tap 187 187");
            Thread.sleep(5000);
            execShellCmd("input tap 180 300");
//            upDownClick();
            qutoutiaoSwipeClick();
//            Log.v("qutoutiao", "第" + i + "次end");
//            if (i % 10 == 0) {
//                Toast.makeText(mContext, i+"jifen", Toast.LENGTH_SHORT).show();
//            }

        }
        execShellCmd("am force-stop com.jifen.qukan");
    }

    // //taotoutiao
    private void taotoutiao() throws Exception {
        Thread.sleep(3000);
        execShellCmd("am start -n com.kuaima.kuailai/com.kuaima.kuailai.MainInterfaceActivity");
        Thread.sleep(10000);
        for (int i = 1; i < num2; i++) {
            execShellCmd("input tap 500 187");
            Thread.sleep(5000);
            execShellCmd("input swipe 555 304 222 1008 1500");
            Thread.sleep(5000);
            execShellCmd("input tap 180 300");
            taotoutiaoSwipeClick();
        }
        execShellCmd("am force-stop com.kuaima.kuailai");
    }

    // execShellCmd("input swipe 222 1000 555 300 900");
    private void qutoutiaoSwipeClick() throws Exception {
        Thread.sleep(5000);
        execShellCmd("input swipe 222 1000 555 300 1500");
        Thread.sleep(4500);
        execShellCmd("input swipe 222 1020 555 300 1500");
        Thread.sleep(4500);
        execShellCmd("input swipe 222 1000 555 310 1500");
        Thread.sleep(4500);
        execShellCmd("input swipe 222 1007 555 300 1500");
        Thread.sleep(4500);
        execShellCmd("input swipe 222 1000 555 302 1500");
        Thread.sleep(4500);
        execShellCmd("input swipe 222 1000 555 305 1500");
        Thread.sleep(4500);
        execShellCmd("input swipe 222 1000 555 304 1500");
        Thread.sleep(4500);
        execShellCmd("input swipe 222 1007 555 304 1500");
        Thread.sleep(4500);
        execShellCmd("input swipe 555 304 222 1008 1500");
        Thread.sleep(4500);
        execShellCmd("input swipe 555 304 222 1008 1500");
        Thread.sleep(4500);
        execShellCmd("input swipe 555 304 222 1008 1500");
        Thread.sleep(4500);
        execShellCmd("input swipe 555 304 222 1008 1500");
        Thread.sleep(5000);
        execShellCmd("input keyevent 4");
        Thread.sleep(5000);
        execShellCmd("input keyevent 4");
        Thread.sleep(5000);
    }
 private void taotoutiaoSwipeClick() throws Exception {
        Thread.sleep(5000);
        execShellCmd("input swipe 222 1000 555 300 1500");
        Thread.sleep(4500);
        execShellCmd("input swipe 222 1020 555 300 1500");
        Thread.sleep(4500);
        execShellCmd("input swipe 222 1000 555 310 1500");
        Thread.sleep(4500);
        execShellCmd("input swipe 222 1007 555 300 1500");
        Thread.sleep(4500);
        execShellCmd("input swipe 222 1000 555 302 1500");
        Thread.sleep(4500);
        execShellCmd("input swipe 222 1000 555 305 1500");
        Thread.sleep(4500);
        execShellCmd("input swipe 222 1000 555 304 1500");
        Thread.sleep(4500);
        execShellCmd("input swipe 222 1007 555 304 1500");
        Thread.sleep(4500);
        execShellCmd("input keyevent 4");
        Thread.sleep(5000);
        execShellCmd("input keyevent 4");
        Thread.sleep(5000);
    }

    /**
     * 执行shell命令
     *
     * @param cmd
     */
    public static void execShellCmd(String cmd) {

        try {
            // 申请获取root权限，这一步很重要，不然会没有作用
            Process process = Runtime.getRuntime().exec("su");
            // 获取输出流
            OutputStream outputStream = process.getOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(
                    outputStream);
            dataOutputStream.writeBytes(cmd);
            dataOutputStream.flush();
            dataOutputStream.close();
            outputStream.close();
            Log.v("aaa","okkkkkkk");
        } catch (Exception t) {
            t.printStackTrace();
        }
    }

    public void signqutoutiao() {
        try{
            //趣头条
            Thread.sleep(3000);
            execShellCmd("am start -n com.jifen.qukan/com.jifen.qkbase.main.MainActivity");
            Thread.sleep(14000);
            execShellCmd("input keyevent 4");
            Thread.sleep(5000);
            execShellCmd("input tap 504 1230");
            Thread.sleep(10000);
            execShellCmd("am force-stop com.jifen.qukan");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void signtaotoutiao() {
        try{
            Thread.sleep(3000);
            execShellCmd("am start -n com.kuaima.kuailai/com.kuaima.kuailai.MainInterfaceActivity");
            Thread.sleep(14000);
            execShellCmd("input keyevent 4");
            Thread.sleep(5000);
            execShellCmd("input tap 72 1230");
            Thread.sleep(5000);
            for (int i = 1; i < 2; i++) {
                execShellCmd("input tap 400 187");
                Thread.sleep(5000);
                execShellCmd("input swipe 555 304 222 1008 1500");
                Thread.sleep(5000);
                execShellCmd("input tap 180 300");
                taotoutiaoSwipeClick();
            }
            execShellCmd("input tap 360 1230");
            Thread.sleep(5000);
//            execShellCmd("input tap 555 220");
            Thread.sleep(5000);
            execShellCmd("am force-stop com.kuaima.kuailai");
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    private void queryFilterAppInfo() {
        PackageManager pm = this.getPackageManager();
        // 查询所有已经安装的应用程序
        List<ApplicationInfo> appInfos = pm.getInstalledApplications(PackageManager.GET_UNINSTALLED_PACKAGES);// GET_UNINSTALLED_PACKAGES代表已删除，但还有安装目录的
        List<ApplicationInfo> applicationInfos = new ArrayList<>();

        // 创建一个类别为CATEGORY_LAUNCHER的该包名的Intent
        Intent resolveIntent = new Intent(Intent.ACTION_MAIN, null);
        resolveIntent.addCategory(Intent.CATEGORY_LAUNCHER);

        // 通过getPackageManager()的queryIntentActivities方法遍历,得到所有能打开的app的packageName
        List<ResolveInfo> resolveinfoList = getPackageManager().queryIntentActivities(resolveIntent, 0);
        allowPackages = new HashSet();
        for (ResolveInfo resolveInfo : resolveinfoList) {
            allowPackages.add(resolveInfo.activityInfo.packageName);
            Log.v("allowPackages", resolveInfo.activityInfo.packageName);
        }

        for (ApplicationInfo app : appInfos) {
//            if((app.flags & ApplicationInfo.FLAG_SYSTEM) <= 0)//通过flag排除系统应用，会将电话、短信也排除掉
//            {
//                applicationInfos.add(app);
//            }
//            if(app.uid > 10000){//通过uid排除系统应用，在一些手机上效果不好
//                applicationInfos.add(app);
//            }
            if (allowPackages.contains(app.packageName)) {
                applicationInfos.add(app);
            }
        }
        mApplicationInfos = applicationInfos;
    }

    private void uninsall() throws Exception {

//        Thread.sleep(3000);
        Log.v("aaa","aaaaaaa");
        execShellCmd("uninstall com.miui.video ");
//        Thread.sleep(10000);

    }

}