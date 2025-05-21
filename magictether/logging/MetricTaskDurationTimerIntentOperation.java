package com.google.android.gms.magictether.logging;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.SystemClock;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.auth.magictether.AppContextProvider;
import defpackage.aptz;
import defpackage.apud;
import defpackage.bqzj;
import defpackage.bqzk;
import defpackage.brbp;
import defpackage.brbr;
import defpackage.cbtb;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fpzd;
import defpackage.fpzg;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
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
        if (fpzd.e() && (stringExtra = intent.getStringExtra("EXTRA_METRIC_KEY")) != null) {
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
                        cbtb cbtbVar = new cbtb();
                        if (fpzg.f() && cbtb.a.contains(stringExtra)) {
                            String concat = stringExtra.concat("_ms");
                            if (fpzg.f()) {
                                if (cbtbVar.b) {
                                    brbr f = cbtbVar.d.f(concat);
                                    brbp brbpVar = f.f.f;
                                    fecj v = bqzk.a.v();
                                    String str2 = f.a;
                                    if (!v.b.L()) {
                                        v.U();
                                    }
                                    fecp fecpVar = v.b;
                                    bqzk bqzkVar = (bqzk) fecpVar;
                                    str2.getClass();
                                    bqzkVar.b |= 1;
                                    bqzkVar.c = str2;
                                    bqzj bqzjVar = bqzj.COUNTERTYPE_LONG_HISTOGRAM;
                                    if (!fecpVar.L()) {
                                        v.U();
                                    }
                                    bqzk bqzkVar2 = (bqzk) v.b;
                                    bqzkVar2.d = bqzjVar.g;
                                    bqzkVar2.b |= 2;
                                    long a = f.b.a(j2);
                                    if (!v.b.L()) {
                                        v.U();
                                    }
                                    fecp fecpVar2 = v.b;
                                    bqzk bqzkVar3 = (bqzk) fecpVar2;
                                    bqzkVar3.b |= 16;
                                    bqzkVar3.g = a;
                                    if (!fecpVar2.L()) {
                                        v.U();
                                    }
                                    bqzk bqzkVar4 = (bqzk) v.b;
                                    bqzkVar4.b |= 32;
                                    bqzkVar4.h = 1L;
                                    f.a(v, brbpVar);
                                } else {
                                    aptz f2 = cbtbVar.c.f(concat);
                                    f2.a(f2.g.a(j2), 1L, apud.b);
                                }
                                cbtbVar.f();
                            }
                        }
                        h(stringExtra, stringExtra2);
                    }
                }
            }
        }
    }
}
