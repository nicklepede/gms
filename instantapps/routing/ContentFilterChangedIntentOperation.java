package com.google.android.gms.instantapps.routing;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.asej;
import defpackage.asot;
import defpackage.boff;
import defpackage.bojn;
import defpackage.fiks;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class ContentFilterChangedIntentOperation extends IntentOperation {
    private bojn a;

    static {
        asot.b("CntntFilterChngedIntent", asej.INSTANT_APPS);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        this.a = boff.a(this).g;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent == null || !Objects.equals(intent.getAction(), "com.google.android.finsky.action.CONTENT_FILTERS_CHANGED")) {
            return;
        }
        this.a.c(fiks.ONE_OFF_FULL_DOMAIN_FILTER_SYNC_AT_CONTENT_FILTER_CHANGE);
    }
}
