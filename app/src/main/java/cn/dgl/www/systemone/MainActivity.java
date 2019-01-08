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
    int num = 1;
    EditText input_num;
    Context mContext;
    List<ApplicationInfo> mApplicationInfos;
    Set<String> allowPackages;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        queryFilterAppInfo();//获取所有的app信息
        mContext = this;
        input_num = (EditText) findViewById(R.id.input_num);
        Button button1 = (Button) findViewById(R.id.button1);

        // 注册广播，添加三个Action
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(AudioManager.RINGER_MODE_CHANGED_ACTION);
        mMyStatusReceiver = new MyStatusReceiver();
        registerReceiver(mMyStatusReceiver, intentFilter); // 注册监听广播

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (TextUtils.isEmpty(input_num.getText().toString())) {
                    Toast.makeText(mContext, "填数字", Toast.LENGTH_SHORT).show();
                    return;
                }
                num = Integer.valueOf(input_num.getText().toString());
                try {
                    Toast.makeText(mContext, "开始运行", Toast.LENGTH_SHORT).show();
                    if (allowPackages.contains("com.jifen.qukan")) {
                        qutoutiao();
                    }
                    if (allowPackages.contains("com.huolea.bull")) {
                        niuniutoutiao();
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
        Thread.sleep(8000);
        for (int i = 1; i < num; i++) {
            Log.v("qutoutiao", "第" + i + "次start");
            if (i % 30 == 0) {
                execShellCmd("am force-stop com.jifen.qukan");
                Thread.sleep(3000);
                execShellCmd("am start -n com.jifen.qukan/com.jifen.qkbase.main.MainActivity");
                Thread.sleep(12000);
            }
            execShellCmd("input tap 100 1055");
            Thread.sleep(5000);
            execShellCmd("input tap 100 1055");
            Thread.sleep(5000);
            execShellCmd("input tap 270 694");
            upDownClick();
            Log.v("qutoutiao", "第" + i + "次end");
        }
        execShellCmd("am force-stop com.jifen.qukan");
    }

    // //牛牛头条
    private void niuniutoutiao() throws Exception {
        Thread.sleep(3000);
        execShellCmd("am start -n com.huolea.bull/com.huolea.bull.page.other.activity.MainActivity");
        Thread.sleep(8000);
        for (int i = 1; i < num; i++) {
            Log.v("niuniutoutiao", "第" + i + "次start");
            if (i % 30 == 0) {
                execShellCmd("am force-stop com.huolea.bull");
                Thread.sleep(3000);
                execShellCmd("am start -n com.huolea.bull/com.huolea.bull.page.other.activity.MainActivity");
                Thread.sleep(12000);
            }
            execShellCmd("input tap 100 1055");
            Thread.sleep(5000);
            execShellCmd("input tap 100 1055");
            Thread.sleep(5000);
            execShellCmd("input tap 270 694");
            upDownClick();
            Log.v("niuniutoutiao", "第" + i + "次end");
        }
        execShellCmd("am force-stop com.huolea.bull");
    }

    private void upDownClick() throws Exception {
        Thread.sleep(5000);
        execShellCmd("input keyevent 20");
        Thread.sleep(2000);
        execShellCmd("input keyevent 20");
        Thread.sleep(2000);
        execShellCmd("input keyevent 20");
        Thread.sleep(2000);
        execShellCmd("input keyevent 20");
        Thread.sleep(2000);
        execShellCmd("input keyevent 20");
        Thread.sleep(2000);
        execShellCmd("input keyevent 20");
        Thread.sleep(2000);
        execShellCmd("input keyevent 20");
        Thread.sleep(2000);
        execShellCmd("input keyevent 20");
        Thread.sleep(2000);
        execShellCmd("input keyevent 20");
        Thread.sleep(2000);
        execShellCmd("input keyevent 20");
        Thread.sleep(2000);
        execShellCmd("input keyevent 20");
        Thread.sleep(2000);
        execShellCmd("input keyevent 20");
        Thread.sleep(2000);
        execShellCmd("input keyevent 20");
        Thread.sleep(2000);
        execShellCmd("input keyevent 20");
        Thread.sleep(2000);
        execShellCmd("input keyevent 20");
        Thread.sleep(2000);
        execShellCmd("input keyevent 20");
        Thread.sleep(2000);
        execShellCmd("input keyevent 20");
        Thread.sleep(2000);
        execShellCmd("input keyevent 20");
        Thread.sleep(2000);
        execShellCmd("input keyevent 20");
        Thread.sleep(2000);
        execShellCmd("input keyevent 20");
        Thread.sleep(2000);
        execShellCmd("input keyevent 20");
        Thread.sleep(2000);
        execShellCmd("input keyevent 20");
        Thread.sleep(2000);
        execShellCmd("input keyevent 20");
        Thread.sleep(2000);
        execShellCmd("input keyevent 20");
        Thread.sleep(2000);
        execShellCmd("input keyevent 20");
        Thread.sleep(2000);
        execShellCmd("input keyevent 20");
        Thread.sleep(2000);
        execShellCmd("input keyevent 19");
        Thread.sleep(2000);
        execShellCmd("input keyevent 19");
        Thread.sleep(2000);
        execShellCmd("input keyevent 19");
        Thread.sleep(2000);
        execShellCmd("input keyevent 19");
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
        } catch (Exception t) {
            t.printStackTrace();
        }
    }

    public void startAdb(View view) {
        try {
            int port = 5555;
            Runtime.getRuntime().exec("su");
            Runtime.getRuntime().exec("setprop service.adb.tcp.port " + port);
            Runtime.getRuntime().exec("stop adbd");
            Runtime.getRuntime().exec("start adbd");
        } catch (Exception t) {
            t.printStackTrace();
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

}