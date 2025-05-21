package com.google.android.gms.fitness.dependency;

import android.content.Intent;
import android.os.BadParcelableException;
import android.os.Bundle;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;
import defpackage.armd;
import defpackage.asot;
import defpackage.bfzx;
import defpackage.bggg;
import defpackage.bhaf;
import defpackage.ejhf;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class DataUpdateListenerCacheChimeraService extends TracingIntentService {
    private static final asot a = bhaf.a();

    public DataUpdateListenerCacheChimeraService() {
        super("DataUpdateListenerCacheChimeraService");
    }

    private final void b(Intent intent) {
        if (armd.m(intent) && armd.a(intent) == 2) {
            c().d(intent);
        }
    }

    private final bfzx c() {
        return bggg.a(this).z();
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
            ((ejhf) ((ejhf) ((ejhf) a.i()).s(e)).ah((char) 4666)).x("Found bad intent, had to clear it.");
        }
    }
}
