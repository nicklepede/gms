package com.google.android.gms.personalsafety.storage.roomdb;

import defpackage.cyhf;
import defpackage.cyhp;
import defpackage.cyhq;
import defpackage.cyht;
import defpackage.cyib;
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
public final class PersonalSafetyRoomDb_Impl extends PersonalSafetyRoomDb {
    private volatile cyhf m;
    private volatile cyht n;

    @Override // defpackage.mhx
    protected final mgw a() {
        return new mgw(this, new HashMap(0), new HashMap(0), "DeviceData", "Scan");
    }

    @Override // defpackage.mhx
    protected final /* synthetic */ mie c() {
        return new cyhq(this);
    }

    @Override // defpackage.mhx
    protected final Map e() {
        HashMap hashMap = new HashMap();
        hashMap.put(cyhf.class, Collections.EMPTY_LIST);
        hashMap.put(cyht.class, Collections.EMPTY_LIST);
        return hashMap;
    }

    @Override // defpackage.mhx
    public final Set f() {
        return new HashSet();
    }

    @Override // defpackage.mhx
    public final void k() {
        super.t("DeviceData", "Scan");
    }

    @Override // defpackage.mhx
    public final List s() {
        return new ArrayList();
    }

    @Override // com.google.android.gms.personalsafety.storage.roomdb.PersonalSafetyRoomDb
    public final cyhf v() {
        cyhf cyhfVar;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            if (this.m == null) {
                this.m = new cyhp(this);
            }
            cyhfVar = this.m;
        }
        return cyhfVar;
    }

    @Override // com.google.android.gms.personalsafety.storage.roomdb.PersonalSafetyRoomDb
    public final cyht x() {
        cyht cyhtVar;
        if (this.n != null) {
            return this.n;
        }
        synchronized (this) {
            if (this.n == null) {
                this.n = new cyib(this);
            }
            cyhtVar = this.n;
        }
        return cyhtVar;
    }
}
