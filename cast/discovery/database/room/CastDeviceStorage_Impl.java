package com.google.android.gms.cast.discovery.database.room;

import defpackage.amqu;
import defpackage.amqz;
import defpackage.amra;
import defpackage.amrf;
import defpackage.amss;
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
/* loaded from: classes3.dex */
public final class CastDeviceStorage_Impl extends CastDeviceStorage {
    private volatile amra l;
    private volatile amqu m;

    @Override // defpackage.kpm
    protected final kol a() {
        return new kol(this, new HashMap(0), new HashMap(0), "wifi_network_info", "cast_device_info");
    }

    @Override // defpackage.kpm
    protected final /* synthetic */ kpp c() {
        return new amss(this);
    }

    @Override // defpackage.kpm
    protected final Map e() {
        HashMap hashMap = new HashMap();
        hashMap.put(amra.class, Collections.EMPTY_LIST);
        hashMap.put(amqu.class, Collections.EMPTY_LIST);
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

    @Override // com.google.android.gms.cast.discovery.database.room.CastDeviceStorage
    public final amqu v() {
        amqu amquVar;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            if (this.m == null) {
                this.m = new amqz(this);
            }
            amquVar = this.m;
        }
        return amquVar;
    }

    @Override // com.google.android.gms.cast.discovery.database.room.CastDeviceStorage
    public final amra w() {
        amra amraVar;
        if (this.l != null) {
            return this.l;
        }
        synchronized (this) {
            if (this.l == null) {
                this.l = new amrf(this);
            }
            amraVar = this.l;
        }
        return amraVar;
    }
}
