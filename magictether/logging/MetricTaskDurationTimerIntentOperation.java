package com.google.android.gms.magictether.logging;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.SystemClock;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.auth.magictether.AppContextProvider;
import defpackage.btha;
import defpackage.bthb;
import defpackage.btjg;
import defpackage.btji;
import defpackage.cebt;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fssz;
import defpackage.fstc;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class MetricTaskDurationTimerIntentOperation extends IntentOperation {
    private final SharedPreferences a = AppContextProvider.a().getSharedPreferences("com.google.android.gms.magictether.logging.MetricTaskDurationTimer.PREFERENCE_FILE", 0);

    public static void a(Context context, String str) {
        b(context, str, null);
    }

    public static void b(Context context, String str, String str2) {
        context.startService(g(context, "com.google.android.gms.magictether.logging.CLEAR_TIMER", str, -1L, str2));
    }

    public static void c(Context context, String str) {
        d(context, str, null);
    }

    public static void d(Context context, String str, String str2) {
        context.startService(g(context, "com.google.android.gms.magictether.logging.START_TIMER", str, SystemClock.elapsedRealtime(), str2));
    }

    public static void e(Context context, String str) {
        f(context, str, null);
    }

    public static void f(Context context, String str, String str2) {
        context.startService(g(context, "com.google.android.gms.magictether.logging.STOP_TIMER", str, SystemClock.elapsedRealtime(), str2));
    }

    private static Intent g(Context context, String str, String str2, long j, String str3) {
        return IntentOperation.getStartIntent(context, MetricTaskDurationTimerIntentOperation.class, str).putExtra("EXTRA_METRIC_KEY", str2).putExtra("EXTRA_TIMESTAMP", j).putExtra("EXTRA_TASK_ID", str3);
    }

    private final void h(String str, String str2) {
        if (str2 != null) {
            str = str.concat(str2);
        }
        this.a.edit().remove(str).apply();
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        String stringExtra;
        String str;
        if (fssz.e() && (stringExtra = intent.getStringExtra("EXTRA_METRIC_KEY")) != null) {
            String stringExtra2 = intent.getStringExtra("EXTRA_TASK_ID");
            if ("com.google.android.gms.magictether.logging.CLEAR_TIMER".equals(intent.getAction())) {
                h(stringExtra, stringExtra2);
            }
            long longExtra = intent.getLongExtra("EXTRA_TIMESTAMP", -1L);
            if (longExtra > 0) {
                if ("com.google.android.gms.magictether.logging.START_TIMER".equals(intent.getAction())) {
                    if (stringExtra2 != null) {
                        stringExtra = stringExtra.concat(stringExtra2);
                    }
                    this.a.edit().putLong(stringExtra, longExtra).apply();
                    return;
                }
                if ("com.google.android.gms.magictether.logging.STOP_TIMER".equals(intent.getAction())) {
                    if (stringExtra2 != null) {
                        str = stringExtra.concat(stringExtra2);
                    } else {
                        stringExtra2 = null;
                        str = stringExtra;
                    }
                    long j = this.a.getLong(str, -1L);
                    if (j > 0) {
                        long j2 = longExtra - j;
                        cebt cebtVar = new cebt();
                        if (fstc.e() && cebt.a.contains(stringExtra)) {
                            String concat = stringExtra.concat("_ms");
                            if (fstc.e()) {
                                btji f = cebtVar.b.f(concat);
                                btjg btjgVar = f.f.f;
                                fgrc v = bthb.a.v();
                                String str2 = f.a;
                                if (!v.b.L()) {
                                    v.U();
                                }
                                fgri fgriVar = v.b;
                                bthb bthbVar = (bthb) fgriVar;
                                str2.getClass();
                                bthbVar.b |= 1;
                                bthbVar.c = str2;
                                btha bthaVar = btha.COUNTERTYPE_LONG_HISTOGRAM;
                                if (!fgriVar.L()) {
                                    v.U();
                                }
                                bthb bthbVar2 = (bthb) v.b;
                                bthbVar2.d = bthaVar.g;
                                bthbVar2.b |= 2;
                                long a = f.b.a(j2);
                                if (!v.b.L()) {
                                    v.U();
                                }
                                fgri fgriVar2 = v.b;
                                bthb bthbVar3 = (bthb) fgriVar2;
                                bthbVar3.b |= 16;
                                bthbVar3.g = a;
                                if (!fgriVar2.L()) {
                                    v.U();
                                }
                                bthb bthbVar4 = (bthb) v.b;
                                bthbVar4.b |= 32;
                                bthbVar4.h = 1L;
                                f.a(v, btjgVar);
                                cebtVar.f();
                            }
                        }
                        h(stringExtra, stringExtra2);
                    }
                }
            }
        }
    }
}
