package com.google.android.gms.notifications.registration.data;

import defpackage.csbq;
import defpackage.csbr;
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
public final class ChimeGmsAccountDatabase_Impl extends ChimeGmsAccountDatabase {
    private volatile csbr l;

    @Override // defpackage.kpm
    protected final kol a() {
        return new kol(this, new HashMap(0), new HashMap(0), "chime_gms_accounts");
    }

    @Override // defpackage.kpm
    protected final /* synthetic */ kpp c() {
        return new csbq(this);
    }

    @Override // defpackage.kpm
    protected final Map e() {
        HashMap hashMap = new HashMap();
        hashMap.put(csbr.class, Collections.EMPTY_LIST);
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

    @Override // com.google.android.gms.notifications.registration.data.ChimeGmsAccountDatabase
    public final csbr v() {
        csbr csbrVar;
        if (this.l != null) {
            return this.l;
        }
        synchronized (this) {
            if (this.l == null) {
                this.l = new csbr(this);
            }
            csbrVar = this.l;
        }
        return csbrVar;
    }
}
