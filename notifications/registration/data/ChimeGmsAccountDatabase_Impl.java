package com.google.android.gms.notifications.registration.data;

import defpackage.cukv;
import defpackage.cukw;
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
public final class ChimeGmsAccountDatabase_Impl extends ChimeGmsAccountDatabase {
    private volatile cukw m;

    @Override // defpackage.mhx
    protected final mgw a() {
        return new mgw(this, new HashMap(0), new HashMap(0), "chime_gms_accounts");
    }

    @Override // defpackage.mhx
    protected final /* synthetic */ mie c() {
        return new cukv(this);
    }

    @Override // defpackage.mhx
    protected final Map e() {
        HashMap hashMap = new HashMap();
        hashMap.put(cukw.class, Collections.EMPTY_LIST);
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

    @Override // com.google.android.gms.notifications.registration.data.ChimeGmsAccountDatabase
    public final cukw v() {
        cukw cukwVar;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            if (this.m == null) {
                this.m = new cukw(this);
            }
            cukwVar = this.m;
        }
        return cukwVar;
    }
}
