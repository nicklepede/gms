package com.google.android.gms.cast.discovery.database.tcp;

import defpackage.amsv;
import defpackage.amta;
import defpackage.amtc;
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
public final class TcpProberStorage_Impl extends TcpProberStorage {
    private volatile amsv l;

    @Override // defpackage.kpm
    protected final kol a() {
        return new kol(this, new HashMap(0), new HashMap(0), "probed_socket_address_info");
    }

    @Override // defpackage.kpm
    protected final /* synthetic */ kpp c() {
        return new amtc(this);
    }

    @Override // defpackage.kpm
    protected final Map e() {
        HashMap hashMap = new HashMap();
        hashMap.put(amsv.class, Collections.EMPTY_LIST);
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

    @Override // com.google.android.gms.cast.discovery.database.tcp.TcpProberStorage
    public final amsv v() {
        amsv amsvVar;
        if (this.l != null) {
            return this.l;
        }
        synchronized (this) {
            if (this.l == null) {
                this.l = new amta(this);
            }
            amsvVar = this.l;
        }
        return amsvVar;
    }
}
