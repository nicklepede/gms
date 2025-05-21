package com.google.android.gms.security.snet;

import android.app.ActivityManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.text.TextUtils;
import android.util.EventLog;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.R;
import defpackage.asit;
import defpackage.cyrt;
import defpackage.czbu;
import defpackage.frtq;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class SnetWatchdogChimeraIntentService extends IntentOperation {
    public static final long a = TimeUnit.MINUTES.toMillis(2);
    public static final long b = TimeUnit.MINUTES.toMillis(10);
    private static final String c = "SnetWatchdogChimeraIntentService";

    public static void a(Context context, String str) {
        if (str == null) {
            return;
        }
        new asit(context).a(c(context, -1, -1L, "", "", str));
    }

    public static void b(Context context, int i, String str, String str2, String str3) {
        asit asitVar = new asit(context);
        long j = "com.google.android.gms.security.snet.ACTION_IDLE_MODE".equals(str3) ? b : a;
        asitVar.d(c, 0, System.currentTimeMillis() + j, c(context, i, j, str, str2, str3), "com.google.android.gms");
    }

    private static PendingIntent c(Context context, int i, long j, String str, String str2, String str3) {
        Intent startIntent = IntentOperation.getStartIntent(context, SnetWatchdogChimeraIntentService.class, str3);
        startIntent.putExtra("snet.watchdog.intent.extra.GMS_CORE_VERSION", i);
        startIntent.putExtra("snet.watchdog.intent.extra.TIMEOUT", j);
        startIntent.putExtra("snet.watchdog.intent.extra.SESSION_UUID", str);
        startIntent.putExtra("snet.watchdog.intent.extra.DEVICE_UUID", str2);
        return PendingIntent.getService(context, 0, startIntent, 0);
    }

    private static final void d(czbu czbuVar, long j) {
        czbu.b(j);
        if (frtq.r()) {
            ArrayList arrayList = new ArrayList();
            String str = null;
            try {
                EventLog.readEvents(new int[]{1397638484}, arrayList);
                Iterator it = arrayList.iterator();
                String str2 = null;
                while (it.hasNext()) {
                    Object[] objArr = (Object[]) ((EventLog.Event) it.next()).getData();
                    if (objArr.length == 3 && "do-not-log-execution-checkpoint-tag".equals(objArr[0])) {
                        str2 = (String) objArr[2];
                    }
                }
                str = str2;
            } catch (IOException | ClassCastException unused) {
            }
            if (!TextUtils.isEmpty(str)) {
                czbu.e = str;
                EventLog.writeEvent(1397638484, "do-not-log-execution-checkpoint-tag", -1, "done");
            }
        }
        czbuVar.c(4);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent == null) {
            return;
        }
        int intExtra = intent.getIntExtra("snet.watchdog.intent.extra.GMS_CORE_VERSION", -1);
        long longExtra = intent.getLongExtra("snet.watchdog.intent.extra.TIMEOUT", -1L);
        String stringExtra = intent.getStringExtra("snet.watchdog.intent.extra.SESSION_UUID");
        String stringExtra2 = intent.getStringExtra("snet.watchdog.intent.extra.DEVICE_UUID");
        czbu czbuVar = new czbu(this, intExtra);
        czbuVar.f = stringExtra;
        czbuVar.g = stringExtra2;
        if ("com.google.android.gms.security.snet.ACTION_EVENT_LOG_COLLECTOR".equals(intent.getAction())) {
            stopService(cyrt.b(this, SnetLaunchInProcessChimeraIntentService.class));
            d(czbuVar, longExtra);
            return;
        }
        stopService(cyrt.b(this, SnetLaunchChimeraIntentService.class));
        String packageName = getApplicationContext().getPackageName();
        String string = getString(R.string.common_snet_process);
        String valueOf = String.valueOf(packageName);
        String valueOf2 = String.valueOf(string);
        ActivityManager activityManager = (ActivityManager) getSystemService("activity");
        if (activityManager != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
                String concat = valueOf.concat(valueOf2);
                if (concat.equals(runningAppProcessInfo.processName)) {
                    d(czbuVar, longExtra);
                    Process.killProcess(runningAppProcessInfo.pid);
                    return;
                }
            }
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
    }
}
