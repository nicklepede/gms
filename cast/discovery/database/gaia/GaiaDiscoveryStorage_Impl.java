package com.google.android.gms.cast.discovery.database.gaia;

import defpackage.aoss;
import defpackage.aosx;
import defpackage.aosz;
import defpackage.aote;
import defpackage.aotg;
import defpackage.aoti;
import defpackage.aotn;
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
public final class GaiaDiscoveryStorage_Impl extends GaiaDiscoveryStorage {
    private volatile aoti m;
    private volatile aosz n;
    private volatile aoss o;

    @Override // defpackage.mhx
    protected final mgw a() {
        return new mgw(this, new HashMap(0), new HashMap(0), "gaia_info", "gaia_device_link", "cloud_device_info");
    }

    @Override // defpackage.mhx
    protected final /* synthetic */ mie c() {
        return new aotg(this);
    }

    @Override // defpackage.mhx
    protected final Map e() {
        HashMap hashMap = new HashMap();
        hashMap.put(aoti.class, Collections.EMPTY_LIST);
        hashMap.put(aosz.class, Collections.EMPTY_LIST);
        hashMap.put(aoss.class, Collections.EMPTY_LIST);
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

    @Override // com.google.android.gms.cast.discovery.database.gaia.GaiaDiscoveryStorage
    public final aoss v() {
        aoss aossVar;
        if (this.o != null) {
            return this.o;
        }
        synchronized (this) {
            if (this.o == null) {
                this.o = new aosx(this);
            }
            aossVar = this.o;
        }
        return aossVar;
    }

    @Override // com.google.android.gms.cast.discovery.database.gaia.GaiaDiscoveryStorage
    public final aosz w() {
        aosz aoszVar;
        if (this.n != null) {
            return this.n;
        }
        synchronized (this) {
            if (this.n == null) {
                this.n = new aote(this);
            }
            aoszVar = this.n;
        }
        return aoszVar;
    }

    @Override // com.google.android.gms.cast.discovery.database.gaia.GaiaDiscoveryStorage
    public final aoti x() {
        aoti aotiVar;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            if (this.m == null) {
                this.m = new aotn(this);
            }
            aotiVar = this.m;
        }
        return aotiVar;
    }
}
