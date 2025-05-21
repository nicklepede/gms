package com.google.android.gms.cast.discovery.database.gaia;

import defpackage.amrh;
import defpackage.amrm;
import defpackage.amro;
import defpackage.amrt;
import defpackage.amrv;
import defpackage.amrx;
import defpackage.amsc;
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
public final class GaiaDiscoveryStorage_Impl extends GaiaDiscoveryStorage {
    private volatile amrx l;
    private volatile amro m;
    private volatile amrh n;

    @Override // defpackage.kpm
    protected final kol a() {
        return new kol(this, new HashMap(0), new HashMap(0), "gaia_info", "gaia_device_link", "cloud_device_info");
    }

    @Override // defpackage.kpm
    protected final /* synthetic */ kpp c() {
        return new amrv(this);
    }

    @Override // defpackage.kpm
    protected final Map e() {
        HashMap hashMap = new HashMap();
        hashMap.put(amrx.class, Collections.EMPTY_LIST);
        hashMap.put(amro.class, Collections.EMPTY_LIST);
        hashMap.put(amrh.class, Collections.EMPTY_LIST);
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

    @Override // com.google.android.gms.cast.discovery.database.gaia.GaiaDiscoveryStorage
    public final amrh v() {
        amrh amrhVar;
        if (this.n != null) {
            return this.n;
        }
        synchronized (this) {
            if (this.n == null) {
                this.n = new amrm(this);
            }
            amrhVar = this.n;
        }
        return amrhVar;
    }

    @Override // com.google.android.gms.cast.discovery.database.gaia.GaiaDiscoveryStorage
    public final amro w() {
        amro amroVar;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            if (this.m == null) {
                this.m = new amrt(this);
            }
            amroVar = this.m;
        }
        return amroVar;
    }

    @Override // com.google.android.gms.cast.discovery.database.gaia.GaiaDiscoveryStorage
    public final amrx x() {
        amrx amrxVar;
        if (this.l != null) {
            return this.l;
        }
        synchronized (this) {
            if (this.l == null) {
                this.l = new amsc(this);
            }
            amrxVar = this.l;
        }
        return amrxVar;
    }
}
