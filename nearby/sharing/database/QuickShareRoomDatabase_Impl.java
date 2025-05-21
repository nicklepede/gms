package com.google.android.gms.nearby.sharing.database;

import defpackage.cmsu;
import defpackage.cmta;
import defpackage.cmtc;
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
public final class QuickShareRoomDatabase_Impl extends QuickShareRoomDatabase {
    private volatile cmsu n;

    @Override // defpackage.kpm
    protected final kol a() {
        return new kol(this, new HashMap(0), new HashMap(0), "AnalyticsTransferMetadata");
    }

    @Override // defpackage.kpm
    protected final /* synthetic */ kpp c() {
        return new cmtc(this);
    }

    @Override // defpackage.kpm
    protected final Map e() {
        HashMap hashMap = new HashMap();
        hashMap.put(cmsu.class, Collections.EMPTY_LIST);
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

    @Override // com.google.android.gms.nearby.sharing.database.QuickShareRoomDatabase
    public final cmsu v() {
        cmsu cmsuVar;
        if (this.n != null) {
            return this.n;
        }
        synchronized (this) {
            if (this.n == null) {
                this.n = new cmta(this);
            }
            cmsuVar = this.n;
        }
        return cmsuVar;
    }
}
