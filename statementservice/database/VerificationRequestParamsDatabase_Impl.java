package com.google.android.gms.statementservice.database;

import defpackage.dhau;
import defpackage.dhba;
import defpackage.dhbb;
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
/* loaded from: classes7.dex */
public final class VerificationRequestParamsDatabase_Impl extends VerificationRequestParamsDatabase {
    private volatile dhau n;

    @Override // defpackage.mhx
    protected final mgw a() {
        return new mgw(this, new HashMap(0), new HashMap(0), "VerificationRequestParams");
    }

    @Override // defpackage.mhx
    protected final /* synthetic */ mie c() {
        return new dhbb(this);
    }

    @Override // defpackage.mhx
    protected final Map e() {
        HashMap hashMap = new HashMap();
        hashMap.put(dhau.class, Collections.EMPTY_LIST);
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

    @Override // com.google.android.gms.statementservice.database.VerificationRequestParamsDatabase
    public final dhau v() {
        dhau dhauVar;
        if (this.n != null) {
            return this.n;
        }
        synchronized (this) {
            if (this.n == null) {
                this.n = new dhba(this);
            }
            dhauVar = this.n;
        }
        return dhauVar;
    }
}
