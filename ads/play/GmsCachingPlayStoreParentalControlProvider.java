package com.google.android.gms.ads.play;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import com.google.android.gms.ads.internal.config.p;
import com.google.android.gms.ads.internal.util.client.h;
import com.google.android.gms.ads.internal.util.future.e;
import com.google.android.gms.ads.internal.util.future.i;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.aumo;
import defpackage.eqgc;
import defpackage.eqgl;
import defpackage.ind;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class GmsCachingPlayStoreParentalControlProvider extends TracingBroadcastReceiver {
    private static GmsCachingPlayStoreParentalControlProvider d;
    public final Object a;
    public eqgl b;
    public boolean c;
    private final AtomicBoolean e;

    public GmsCachingPlayStoreParentalControlProvider() {
        super("admob");
        this.a = new Object();
        this.e = new AtomicBoolean(false);
        this.c = true;
    }

    public static GmsCachingPlayStoreParentalControlProvider b() {
        if (d == null) {
            d = new GmsCachingPlayStoreParentalControlProvider();
        }
        return d;
    }

    public final eqgl c(Context context) {
        eqgl eqglVar;
        if (!this.e.getAndSet(true)) {
            ((Boolean) p.bx.g()).booleanValue();
            ind.b(context, this, new IntentFilter("com.google.android.finsky.action.CONTENT_FILTERS_CHANGED"), 2);
        }
        synchronized (this.a) {
            if (!this.c) {
                return this.b;
            }
            int i = com.google.android.gms.ads.internal.util.c.a;
            h.i("Parental control value is stale. Refreshing.");
            Intent intent = new Intent("com.android.vending.contentfilters.IContentFiltersService.BIND");
            intent.setPackage("com.android.vending");
            List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 64);
            if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                h.k("Play store is not installed or the service for parental controls is not available.");
                Bundle bundle = new Bundle();
                bundle.putBoolean("success", false);
                bundle.putBoolean("is_cacheable", true);
                bundle.putBoolean("is_service_available", false);
                eqglVar = eqgc.i(bundle);
            } else {
                i iVar = new i();
                c cVar = new c(context, iVar);
                eqglVar = iVar;
                if (!aumo.a().d(context, intent, cVar, 1)) {
                    h.k("Connection to play store is not available for getting parental controls.");
                    Bundle bundle2 = new Bundle();
                    bundle2.putBoolean("success", false);
                    bundle2.putBoolean("is_cacheable", false);
                    bundle2.putBoolean("is_service_available", true);
                    iVar.a(bundle2);
                    try {
                        aumo.a().b(context, cVar);
                        eqglVar = iVar;
                    } catch (Exception e) {
                        h.h("Error while unbinding from parental controls connection", e);
                        eqglVar = iVar;
                    }
                }
            }
            eqglVar.hD(new a(this, eqglVar), e.a);
            return eqglVar;
        }
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jP(Context context, Intent intent) {
        synchronized (this.a) {
            int i = com.google.android.gms.ads.internal.util.c.a;
            h.i("Change in parental control settings is detected. Marking the value as stale.");
            this.c = true;
        }
    }
}
