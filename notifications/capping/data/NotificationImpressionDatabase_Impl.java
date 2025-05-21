package com.google.android.gms.notifications.capping.data;

import defpackage.csai;
import defpackage.csaj;
import defpackage.kol;
import defpackage.kpp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class NotificationImpressionDatabase_Impl extends NotificationImpressionDatabase {
    private volatile csaj l;

    @Override // defpackage.kpm
    protected final kol a() {
        return new kol(this, new HashMap(0), new HashMap(0), "notifications_impressions");
    }

    @Override // defpackage.kpm
    protected final /* synthetic */ kpp c() {
        return new csai(this);
    }

    @Override // defpackage.kpm
    protected final Map e() {
        HashMap hashMap = new HashMap();
        hashMap.put(csaj.class, Collections.EMPTY_LIST);
        return hashMap;
    }

    @Override // defpackage.kpm
    public final Set f() {
        return new HashSet();
    }

    @Override // defpackage.kpm
    public final void k() {
        throw null;
    }

    @Override // defpackage.kpm
    public final List s() {
        return new ArrayList();
    }

    @Override // com.google.android.gms.notifications.capping.data.NotificationImpressionDatabase
    public final csaj v() {
        csaj csajVar;
        if (this.l != null) {
            return this.l;
        }
        synchronized (this) {
            if (this.l == null) {
                this.l = new csaj(this);
            }
            csajVar = this.l;
        }
        return csajVar;
    }
}
