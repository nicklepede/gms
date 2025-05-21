package com.google.android.gms.personalsafety.storage.roomdb;

import defpackage.cvxi;
import defpackage.cvxs;
import defpackage.cvxt;
import defpackage.cvxw;
import defpackage.cvye;
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
public final class PersonalSafetyRoomDb_Impl extends PersonalSafetyRoomDb {
    private volatile cvxi l;
    private volatile cvxw m;

    @Override // defpackage.kpm
    protected final kol a() {
        return new kol(this, new HashMap(0), new HashMap(0), "DeviceData", "Scan");
    }

    @Override // defpackage.kpm
    protected final /* synthetic */ kpp c() {
        return new cvxt(this);
    }

    @Override // defpackage.kpm
    protected final Map e() {
        HashMap hashMap = new HashMap();
        hashMap.put(cvxi.class, Collections.EMPTY_LIST);
        hashMap.put(cvxw.class, Collections.EMPTY_LIST);
        return hashMap;
    }

    @Override // defpackage.kpm
    public final Set f() {
        return new HashSet();
    }

    @Override // defpackage.kpm
    public final void k() {
        super.t("DeviceData", "Scan");
    }

    @Override // defpackage.kpm
    public final List s() {
        return new ArrayList();
    }

    @Override // com.google.android.gms.personalsafety.storage.roomdb.PersonalSafetyRoomDb
    public final cvxi v() {
        cvxi cvxiVar;
        if (this.l != null) {
            return this.l;
        }
        synchronized (this) {
            if (this.l == null) {
                this.l = new cvxs(this);
            }
            cvxiVar = this.l;
        }
        return cvxiVar;
    }

    @Override // com.google.android.gms.personalsafety.storage.roomdb.PersonalSafetyRoomDb
    public final cvxw x() {
        cvxw cvxwVar;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            if (this.m == null) {
                this.m = new cvye(this);
            }
            cvxwVar = this.m;
        }
        return cvxwVar;
    }
}
