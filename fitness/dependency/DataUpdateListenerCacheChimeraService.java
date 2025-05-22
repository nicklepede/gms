package com.google.android.gms.fitness.dependency;

import android.content.Intent;
import android.os.BadParcelableException;
import android.os.Bundle;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;
import defpackage.atos;
import defpackage.ausn;
import defpackage.bien;
import defpackage.bikw;
import defpackage.bjev;
import defpackage.eluo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class DataUpdateListenerCacheChimeraService extends TracingIntentService {
    private static final ausn a = bjev.a();

    public DataUpdateListenerCacheChimeraService() {
        super("DataUpdateListenerCacheChimeraService");
    }

    private final void b(Intent intent) {
        if (atos.m(intent) && atos.a(intent) == 2) {
            c().d(intent);
        }
    }

    private final bien c() {
        return bikw.a(this).z();
    }

    @Override // com.google.android.gms.framework.tracing.wrapper.TracingIntentService
    protected final void a(Intent intent) {
        try {
            b(intent);
        } catch (BadParcelableException e) {
            Bundle bundle = new Bundle();
            bundle.putInt("com.google.android.location.cache.cache_type", 2);
            bundle.putBoolean("com.google.android.location.cache.is_cache", true);
            intent.replaceExtras(bundle);
            b(intent);
            c().c();
            ((eluo) ((eluo) ((eluo) a.i()).s(e)).ai((char) 4676)).x("Found bad intent, had to clear it.");
        }
    }
}
