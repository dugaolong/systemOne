package cn.dgl.www.systemone;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import static cn.dgl.www.systemone.MainActivity.execShellCmd;

public class MyStatusReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.v("action:",intent.getAction()+"");
        //媒体音量改变才通知
        if ("android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction())) {

            Toast.makeText(context, "ddddddd", Toast.LENGTH_LONG).show();
            execShellCmd("exit");
        }
    }
}