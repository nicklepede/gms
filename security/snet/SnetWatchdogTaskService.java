package com.google.android.gms.security.snet;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.EventLog;
import com.google.android.gms.R;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.casd;
import defpackage.cauf;
import defpackage.dbls;
import defpackage.dblu;
import defpackage.fuoj;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class SnetWatchdogTaskService extends GmsTaskBoundService {
    public static final long a = TimeUnit.MINUTES.toMillis(2);
    public static final long b = TimeUnit.MINUTES.toMillis(10);
    private Context c;

    public SnetWatchdogTaskService() {
    }

    public static void d(Context context) {
        casd.a(context).d("snet_watchdog_task_tag", SnetWatchdogTaskService.class.getName());
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        String str = "";
        Bundle bundle = caufVar.b;
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
        dbls dblsVar = new dbls(this.c, i);
        dblsVar.f = string;
        dblsVar.g = string2;
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
                dbls.b(j);
                if (fuoj.r()) {
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
                        dbls.e = str;
                        EventLog.writeEvent(1397638484, "do-not-log-execution-checkpoint-tag", -1, "done");
                    }
                }
                dblsVar.c(4);
                Process.killProcess(next.pid);
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.chimera.BoundService, defpackage.rtr
    public final void onCreate() {
        this.c = this;
        super.onCreate();
    }

    SnetWatchdogTaskService(dblu dbluVar, Context context) {
        this.c = context;
    }
}
