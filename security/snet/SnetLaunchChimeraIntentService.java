package com.google.android.gms.security.snet;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;
import defpackage.asej;
import defpackage.asoe;
import defpackage.asot;
import defpackage.cyru;
import defpackage.cyxy;
import defpackage.cyxz;
import defpackage.cyya;
import defpackage.czbu;
import defpackage.czdh;
import defpackage.czdx;
import defpackage.czeb;
import defpackage.czed;
import defpackage.deqr;
import defpackage.ejhf;
import defpackage.febw;
import defpackage.fecp;
import defpackage.feep;
import defpackage.frto;
import defpackage.frtq;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class SnetLaunchChimeraIntentService extends IntentOperation {
    public static final /* synthetic */ int a = 0;
    private static final String b = "SnetLaunchChimeraIntentService";
    private String c;
    private String d;
    private czbu e;
    private ArrayList f;
    private String g;
    private Bundle h;
    private String[] i;
    private ArrayList j;

    static {
        asot.b(b, asej.SECURITY);
    }

    final void a(Context context, Intent intent) {
        char c = 65535;
        this.e = new czbu(context, intent.getIntExtra("snet.intent.extra.GMS_CORE_VERSION", -1));
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
                Bundle a2 = cyru.a(context);
                if (!TextUtils.isEmpty(this.c)) {
                    a2.putString("snet_uuid", this.c);
                }
                if (!TextUtils.isEmpty(this.d)) {
                    a2.putString("snet_shared_uuid", this.d);
                }
                a2.putBoolean("snet_is_sidewinder_device", asoe.c(context));
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
                    asot asotVar = czdx.a;
                    czdh czdhVar = new czdh(a2);
                    if (czdx.d(czdhVar)) {
                        try {
                            byte[] f = czdhVar.f();
                            if (f != null) {
                                cyya cyyaVar = cyya.a;
                                int length = f.length;
                                febw febwVar = febw.a;
                                feep feepVar = feep.a;
                                fecp y = fecp.y(cyyaVar, f, 0, length, febw.a);
                                fecp.M(y);
                                Iterator it = ((cyya) y).b.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    cyxz cyxzVar = ((cyxy) it.next()).c;
                                    if (cyxzVar == null) {
                                        cyxzVar = cyxz.a;
                                    }
                                    if ("network_watchlist_report".equals(cyxzVar.b)) {
                                        byte[] f2 = czdhVar.f();
                                        if (f2 != null) {
                                            czed.e(context, f2);
                                        }
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            ((ejhf) ((ejhf) ((ejhf) czdx.a.i()).s(th)).ah((char) 9589)).x("Error while getting watchlist report");
                        }
                    }
                    long a3 = new czeb(context).a();
                    if (a3 != -1 && a3 + a2.getLong("snet_idle_mode_wake_interval_ms") >= System.currentTimeMillis()) {
                        frto.c();
                    }
                    deqr deqrVar = new deqr(context, 1, String.valueOf(czdx.class.getCanonicalName()).concat(":SnetIdle"));
                    czdx czdxVar = new czdx(context, czdhVar);
                    try {
                        deqrVar.c(czdxVar.c.b.a("watchdog_idle_mode_timeout_ms", 600000L));
                        czdxVar.b();
                        try {
                            deqrVar.g();
                        } catch (RuntimeException e) {
                            czdxVar.d.d(e);
                        }
                    } finally {
                    }
                } else if (c == 1 && frtq.i()) {
                    czdx.a(context, a2);
                }
            }
        } finally {
            try {
            } finally {
                try {
                    if (frtq.s()) {
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
        deqr deqrVar = new deqr(this, 1, b, null, "com.google.android.gms");
        deqrVar.j(false);
        try {
            deqrVar.c(SnetWatchdogTaskService.a);
            a(this, intent);
        } catch (Throwable unused) {
        }
        deqrVar.g();
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
    }
}
