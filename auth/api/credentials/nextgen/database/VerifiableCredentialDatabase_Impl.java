package com.google.android.gms.auth.api.credentials.nextgen.database;

import defpackage.kol;
import defpackage.kpp;
import defpackage.yrt;
import defpackage.yrv;
import defpackage.yse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class VerifiableCredentialDatabase_Impl extends VerifiableCredentialDatabase {
    private volatile yrv l;

    @Override // defpackage.kpm
    protected final kol a() {
        return new kol(this, new HashMap(0), new HashMap(0), "VerifiableCredentialEntity");
    }

    @Override // defpackage.kpm
    protected final /* synthetic */ kpp c() {
        return new yrt(this);
    }

    @Override // defpackage.kpm
    protected final Map e() {
        HashMap hashMap = new HashMap();
        hashMap.put(yrv.class, Collections.EMPTY_LIST);
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

    @Override // com.google.android.gms.auth.api.credentials.nextgen.database.VerifiableCredentialDatabase
    public final yrv w() {
        yrv yrvVar;
        if (this.l != null) {
            return this.l;
        }
        synchronized (this) {
            if (this.l == null) {
                this.l = new yse(this);
            }
            yrvVar = this.l;
        }
        return yrvVar;
    }
}
