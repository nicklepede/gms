package com.google.android.gms.auth.api.credentials.callerverification;

import defpackage.mgw;
import defpackage.mie;
import defpackage.yco;
import defpackage.ycq;
import defpackage.ycv;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class CallerVerificationDatabase_Impl extends CallerVerificationDatabase {
    private volatile ycq m;

    @Override // defpackage.mhx
    protected final mgw a() {
        return new mgw(this, new HashMap(0), new HashMap(0), "CallerVerificationToken");
    }

    @Override // defpackage.mhx
    protected final /* synthetic */ mie c() {
        return new yco(this);
    }

    @Override // defpackage.mhx
    protected final Map e() {
        HashMap hashMap = new HashMap();
        hashMap.put(ycq.class, Collections.EMPTY_LIST);
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

    @Override // com.google.android.gms.auth.api.credentials.callerverification.CallerVerificationDatabase
    public final ycq w() {
        ycq ycqVar;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            if (this.m == null) {
                this.m = new ycv(this);
            }
            ycqVar = this.m;
        }
        return ycqVar;
    }
}
