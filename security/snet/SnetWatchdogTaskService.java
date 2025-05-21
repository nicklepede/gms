package com.google.android.gms.security.snet;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.EventLog;
import com.google.android.gms.R;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.byjl;
import defpackage.byln;
import defpackage.czbu;
import defpackage.czbw;
import defpackage.frtq;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class SnetWatchdogTaskService extends GmsTaskBoundService {
    public static final long a = TimeUnit.MINUTES.toMillis(2);
    public static final long b = TimeUnit.MINUTES.toMillis(10);
    private Context c;

    public SnetWatchdogTaskService() {
    }

    public static void d(Context context) {
        byjl.a(context).d("snet_watchdog_task_tag", SnetWatchdogTaskService.class.getName());
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        String str = "";
        Bundle bundle = bylnVar.b;
        if (bundle == null) {
            return 2;
        }
        int i = bundle.getInt("snet.watchdog.intent.extra.GMS_CORE_VERSION");
        long j = bundle.getLong("snet.watchdog.intent.extra.TIMEOUT");
        String string = bundle.getString("snet.watchdog.intent.extra.SESSION_UUID");
        String string2 = bundle.getString("snet.watchdog.intent.extra.DEVICE_UUID");
        if (string == null || string2 == null) {
            return 2;
        }
        czbu czbuVar = new czbu(this.c, i);
        czbuVar.f = string;
        czbuVar.g = string2;
        String packageName = this.c.getApplicationContext().getPackageName();
        String string3 = this.c.getString(R.string.common_snet_process);
        String valueOf = String.valueOf(packageName);
        String valueOf2 = String.valueOf(string3);
        ActivityManager activityManager = (ActivityManager) this.c.getSystemService("activity");
        if (activityManager == null) {
            return 0;
        }
        Iterator<ActivityManager.RunningAppProcessInfo> it = activityManager.getRunningAppProcesses().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String concat = valueOf.concat(valueOf2);
            ActivityManager.RunningAppProcessInfo next = it.next();
            if (concat.equals(next.processName)) {
                czbu.b(j);
                if (frtq.r()) {
                    ArrayList arrayList = new ArrayList();
                    try {
                        EventLog.readEvents(new int[]{1397638484}, arrayList);
                        Iterator it2 = arrayList.iterator();
                        String str2 = "";
                        while (it2.hasNext()) {
                            Object[] objArr = (Object[]) ((EventLog.Event) it2.next()).getData();
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
                Process.killProcess(next.pid);
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.chimera.BoundService, defpackage.qan
    public final void onCreate() {
        this.c = this;
        super.onCreate();
    }

    SnetWatchdogTaskService(czbw czbwVar, Context context) {
        this.c = context;
    }
}
