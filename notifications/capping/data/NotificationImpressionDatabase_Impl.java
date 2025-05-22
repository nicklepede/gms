package com.google.android.gms.notifications.capping.data;

import defpackage.cujn;
import defpackage.cujo;
import defpackage.mgw;
import defpackage.mie;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class NotificationImpressionDatabase_Impl extends NotificationImpressionDatabase {
    private volatile cujo m;

    @Override // defpackage.mhx
    protected final mgw a() {
        return new mgw(this, new HashMap(0), new HashMap(0), "notifications_impressions");
    }

    @Override // defpackage.mhx
    protected final /* synthetic */ mie c() {
        return new cujn(this);
    }

    @Override // defpackage.mhx
    protected final Map e() {
        HashMap hashMap = new HashMap();
        hashMap.put(cujo.class, Collections.EMPTY_LIST);
        return hashMap;
    }

    @Override // defpackage.mhx
    public final Set f() {
        return new HashSet();
    }

    @Override // defpackage.mhx
    public final void k() {
        throw null;
    }

    @Override // defpackage.mhx
    public final List s() {
        return new ArrayList();
    }

    @Override // com.google.android.gms.notifications.capping.data.NotificationImpressionDatabase
    public final cujo v() {
        cujo cujoVar;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            if (this.m == null) {
                this.m = new cujo(this);
            }
            cujoVar = this.m;
        }
        return cujoVar;
    }
}
