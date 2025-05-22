package com.google.android.gms.security.snet;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;
import defpackage.auid;
import defpackage.aury;
import defpackage.ausn;
import defpackage.dbbs;
import defpackage.dbhw;
import defpackage.dbhx;
import defpackage.dbhy;
import defpackage.dbls;
import defpackage.dbnf;
import defpackage.dbnv;
import defpackage.dbnz;
import defpackage.dbob;
import defpackage.dhbu;
import defpackage.eluo;
import defpackage.fgqp;
import defpackage.fgri;
import defpackage.fgti;
import defpackage.fuoh;
import defpackage.fuoj;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class SnetLaunchChimeraIntentService extends IntentOperation {
    public static final /* synthetic */ int a = 0;
    private static final String b = "SnetLaunchChimeraIntentService";
    private String c;
    private String d;
    private dbls e;
    private ArrayList f;
    private String g;
    private Bundle h;
    private String[] i;
    private ArrayList j;

    static {
        ausn.b(b, auid.SECURITY);
    }

    final void a(Context context, Intent intent) {
        char c = 65535;
        this.e = new dbls(context, intent.getIntExtra("snet.intent.extra.GMS_CORE_VERSION", -1));
        this.c = intent.getStringExtra("snet.intent.extra.UUID");
        this.d = intent.getStringExtra("snet.intent.extra.SHARED_UUID");
        this.f = intent.getStringArrayListExtra("snet.intent.extra.SNET_API_PACKAGES");
        this.h = intent.getBundleExtra("snet.intent.extra.SNET_FLAGS");
        this.i = intent.getStringArrayExtra("snet.intent.extra.REQUESTED_DIGESTS");
        if (!TextUtils.isEmpty(this.c)) {
            this.e.f = this.c;
        }
        if (!TextUtils.isEmpty(this.d)) {
            this.e.g = this.d;
        }
        this.j = intent.getParcelableArrayListExtra("snet.intent.extra.DEX_INFO_BUNDLES");
        try {
            if (this.g != null) {
                Bundle a2 = dbbs.a(context);
                if (!TextUtils.isEmpty(this.c)) {
                    a2.putString("snet_uuid", this.c);
                }
                if (!TextUtils.isEmpty(this.d)) {
                    a2.putString("snet_shared_uuid", this.d);
                }
                a2.putBoolean("snet_is_sidewinder_device", aury.c(context));
                if ("com.google.android.gms.security.snet.ACTION_IDLE_MODE".equals(this.g)) {
                    a2.putCharSequenceArray("snet_upload_requested_apks", this.i);
                }
                a2.putStringArrayList("snet_verify_apps_api_usage", this.f);
                a2.putBundle("snet.intent.extra.SNET_FLAGS", this.h);
                a2.putParcelableArrayList("snet.intent.extra.DEX_INFO_BUNDLES", this.j);
                String str = this.g;
                int hashCode = str.hashCode();
                if (hashCode != 372813122) {
                    if (hashCode == 539976355 && str.equals("com.google.android.gms.security.snet.ACTION_IDLE_MODE")) {
                        c = 0;
                    }
                } else if (str.equals("com.google.android.gms.security.snet.ACTION_EVENT_LOG_COLLECTOR")) {
                    c = 1;
                }
                if (c == 0) {
                    ausn ausnVar = dbnv.a;
                    dbnf dbnfVar = new dbnf(a2);
                    if (dbnv.d(dbnfVar)) {
                        try {
                            byte[] f = dbnfVar.f();
                            if (f != null) {
                                dbhy dbhyVar = dbhy.a;
                                int length = f.length;
                                fgqp fgqpVar = fgqp.a;
                                fgti fgtiVar = fgti.a;
                                fgri y = fgri.y(dbhyVar, f, 0, length, fgqp.a);
                                fgri.M(y);
                                Iterator it = ((dbhy) y).b.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    dbhx dbhxVar = ((dbhw) it.next()).c;
                                    if (dbhxVar == null) {
                                        dbhxVar = dbhx.a;
                                    }
                                    if ("network_watchlist_report".equals(dbhxVar.b)) {
                                        byte[] f2 = dbnfVar.f();
                                        if (f2 != null) {
                                            dbob.e(context, f2);
                                        }
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            ((eluo) ((eluo) ((eluo) dbnv.a.i()).s(th)).ai((char) 9591)).x("Error while getting watchlist report");
                        }
                    }
                    long a3 = new dbnz(context).a();
                    if (a3 != -1 && a3 + a2.getLong("snet_idle_mode_wake_interval_ms") >= System.currentTimeMillis()) {
                        fuoh.c();
                    }
                    dhbu dhbuVar = new dhbu(context, 1, String.valueOf(dbnv.class.getCanonicalName()).concat(":SnetIdle"));
                    dbnv dbnvVar = new dbnv(context, dbnfVar);
                    try {
                        dhbuVar.c(dbnvVar.c.b.a("watchdog_idle_mode_timeout_ms", 600000L));
                        dbnvVar.b();
                        try {
                            dhbuVar.g();
                        } catch (RuntimeException e) {
                            dbnvVar.d.d(e);
                        }
                    } finally {
                    }
                } else if (c == 1 && fuoj.i()) {
                    dbnv.a(context, a2);
                }
            }
        } finally {
            try {
            } finally {
                try {
                    if (fuoj.s()) {
                        SnetWatchdogTaskService.d(context);
                    } else {
                        SnetWatchdogChimeraIntentService.a(context, this.g);
                    }
                } catch (RuntimeException unused) {
                }
            }
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        this.g = action;
        if (!"com.google.android.gms.security.snet.ACTION_IDLE_MODE".equals(action)) {
            a(this, intent);
            return;
        }
        dhbu dhbuVar = new dhbu(this, 1, b, null, "com.google.android.gms");
        dhbuVar.j(false);
        try {
            dhbuVar.c(SnetWatchdogTaskService.a);
            a(this, intent);
        } catch (Throwable unused) {
        }
        dhbuVar.g();
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
    }
}
