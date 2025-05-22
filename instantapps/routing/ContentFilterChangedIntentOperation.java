package com.google.android.gms.instantapps.routing;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bqmv;
import defpackage.bqrd;
import defpackage.flap;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class ContentFilterChangedIntentOperation extends IntentOperation {
    private bqrd a;

    static {
        ausn.b("CntntFilterChngedIntent", auid.INSTANT_APPS);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        this.a = bqmv.a(this).g;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent == null || !Objects.equals(intent.getAction(), "com.google.android.finsky.action.CONTENT_FILTERS_CHANGED")) {
            return;
        }
        this.a.c(flap.ONE_OFF_FULL_DOMAIN_FILTER_SYNC_AT_CONTENT_FILTER_CHANGE);
    }
}
