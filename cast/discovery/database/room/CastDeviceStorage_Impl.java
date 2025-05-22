package com.google.android.gms.cast.discovery.database.room;

import defpackage.aosf;
import defpackage.aosk;
import defpackage.aosl;
import defpackage.aosq;
import defpackage.aoud;
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
/* loaded from: classes3.dex */
public final class CastDeviceStorage_Impl extends CastDeviceStorage {
    private volatile aosl m;
    private volatile aosf n;

    @Override // defpackage.mhx
    protected final mgw a() {
        return new mgw(this, new HashMap(0), new HashMap(0), "wifi_network_info", "cast_device_info");
    }

    @Override // defpackage.mhx
    protected final /* synthetic */ mie c() {
        return new aoud(this);
    }

    @Override // defpackage.mhx
    protected final Map e() {
        HashMap hashMap = new HashMap();
        hashMap.put(aosl.class, Collections.EMPTY_LIST);
        hashMap.put(aosf.class, Collections.EMPTY_LIST);
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

    @Override // com.google.android.gms.cast.discovery.database.room.CastDeviceStorage
    public final aosf v() {
        aosf aosfVar;
        if (this.n != null) {
            return this.n;
        }
        synchronized (this) {
            if (this.n == null) {
                this.n = new aosk(this);
            }
            aosfVar = this.n;
        }
        return aosfVar;
    }

    @Override // com.google.android.gms.cast.discovery.database.room.CastDeviceStorage
    public final aosl w() {
        aosl aoslVar;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            if (this.m == null) {
                this.m = new aosq(this);
            }
            aoslVar = this.m;
        }
        return aoslVar;
    }
}
