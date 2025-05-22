package com.google.android.gms.security.snet;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;
import defpackage.auid;
import defpackage.aury;
import defpackage.ausn;
import defpackage.dbbs;
import defpackage.dbls;
import defpackage.dbnv;
import defpackage.fuoj;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class SnetLaunchInProcessChimeraIntentService extends IntentOperation {
    public static final /* synthetic */ int a = 0;
    private static final String b = "SnetLaunchInProcessChimeraIntentService";
    private String c;
    private String d;
    private dbls e;
    private ArrayList f;
    private String g;
    private Bundle h;
    private ArrayList i;

    static {
        ausn.b(b, auid.SECURITY);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        this.g = action;
        if ("com.google.android.gms.security.snet.ACTION_EVENT_LOG_COLLECTOR".equals(action)) {
            this.e = new dbls(this, intent.getIntExtra("snet.intent.extra.GMS_CORE_VERSION", -1));
            this.c = intent.getStringExtra("snet.intent.extra.UUID");
            this.d = intent.getStringExtra("snet.intent.extra.SHARED_UUID");
            this.f = intent.getStringArrayListExtra("snet.intent.extra.SNET_API_PACKAGES");
            this.h = intent.getBundleExtra("snet.intent.extra.SNET_FLAGS");
            if (!TextUtils.isEmpty(this.c)) {
                this.e.f = this.c;
            }
            if (!TextUtils.isEmpty(this.d)) {
                this.e.g = this.d;
            }
            this.i = intent.getParcelableArrayListExtra("snet.intent.extra.DEX_INFO_BUNDLES");
            try {
                try {
                    try {
                        Bundle a2 = dbbs.a(this);
                        if (!TextUtils.isEmpty(this.c)) {
                            a2.putString("snet_uuid", this.c);
                        }
                        if (!TextUtils.isEmpty(this.d)) {
                            a2.putString("snet_shared_uuid", this.d);
                        }
                        a2.putBoolean("snet_is_sidewinder_device", aury.c(this));
                        a2.putStringArrayList("snet_verify_apps_api_usage", this.f);
                        a2.putBundle("snet.intent.extra.SNET_FLAGS", this.h);
                        a2.putParcelableArrayList("snet.intent.extra.DEX_INFO_BUNDLES", this.i);
                        if ("com.google.android.gms.security.snet.ACTION_EVENT_LOG_COLLECTOR".equals(this.g) && fuoj.i()) {
                            dbnv.a(this, a2);
                        }
                        if (fuoj.s()) {
                            return;
                        }
                        SnetWatchdogChimeraIntentService.a(this, this.g);
                    } catch (Throwable th) {
                        try {
                            if (!fuoj.s()) {
                                SnetWatchdogChimeraIntentService.a(this, this.g);
                            }
                        } catch (RuntimeException unused) {
                        }
                        throw th;
                    }
                } catch (RuntimeException e) {
                    dbls.a(e);
                    try {
                        this.e.c(3);
                    } catch (RuntimeException unused2) {
                    }
                    if (fuoj.s()) {
                        return;
                    }
                    SnetWatchdogChimeraIntentService.a(this, this.g);
                }
            } catch (RuntimeException unused3) {
            }
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
    }
}
