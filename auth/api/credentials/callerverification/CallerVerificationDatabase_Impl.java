package com.google.android.gms.auth.api.credentials.callerverification;

import defpackage.kol;
import defpackage.kpp;
import defpackage.wgi;
import defpackage.wgk;
import defpackage.wgp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class CallerVerificationDatabase_Impl extends CallerVerificationDatabase {
    private volatile wgk l;

    @Override // defpackage.kpm
    protected final kol a() {
        return new kol(this, new HashMap(0), new HashMap(0), "CallerVerificationToken");
    }

    @Override // defpackage.kpm
    protected final /* synthetic */ kpp c() {
        return new wgi(this);
    }

    @Override // defpackage.kpm
    protected final Map e() {
        HashMap hashMap = new HashMap();
        hashMap.put(wgk.class, Collections.EMPTY_LIST);
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

    @Override // com.google.android.gms.auth.api.credentials.callerverification.CallerVerificationDatabase
    public final wgk w() {
        wgk wgkVar;
        if (this.l != null) {
            return this.l;
        }
        synchronized (this) {
            if (this.l == null) {
                this.l = new wgp(this);
            }
            wgkVar = this.l;
        }
        return wgkVar;
    }
}
