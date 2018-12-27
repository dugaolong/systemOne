package cn.dgl.www.systemone;

import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.DataOutputStream;
import java.io.OutputStream;

public class MainActivity extends AppCompatActivity {

    MyStatusReceiver mMyStatusReceiver;
    int num = 1;
    EditText input_num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input_num = (EditText) findViewById(R.id.input_num);
        Button button1 = (Button) findViewById(R.id.button1);

        // 注册广播，添加三个Action
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(AudioManager.RINGER_MODE_CHANGED_ACTION);
        mMyStatusReceiver = new MyStatusReceiver();
        registerReceiver(mMyStatusReceiver, intentFilter); // 注册监听广播

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                num = Integer.valueOf(input_num.getText().toString());
                try {
                    qutoutiao();
                    dongfangtoutiao();
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
        for (int i = 0; i < num; i++) {
            Log.v("qutoutiao", "第" + i + "次start");
            execShellCmd("input tap 78 1233");
            Thread.sleep(5000);
            execShellCmd("input tap 180 600");
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
            Log.v("qutoutiao", "第" + i + "次end");
        }
        execShellCmd("am force-stop com.jifen.qukan/com.jifen.qkbase.main.MainActivity");
    }

    // //东方头条

    private void dongfangtoutiao() throws Exception {
        Thread.sleep(3000);
        execShellCmd("am start -n com.songheng.eastnews/com.songheng.eastfirst.business.ad.view.WarmSplashActivity");
        Thread.sleep(8000);
        for (int i = 0; i < num; i++) {
            Log.v("dongfangtoutiao", "第" + i + "次start");
            execShellCmd("input tap 78 1233");
            Thread.sleep(5000);
            execShellCmd("input tap 180 600");
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
            Log.v("dongfangtoutiao", "第" + i + "次end");
        }
        execShellCmd("am force-stop com.songheng.eastnews/com.songheng.eastfirst.business.ad.view.WarmSplashActivity");
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


}