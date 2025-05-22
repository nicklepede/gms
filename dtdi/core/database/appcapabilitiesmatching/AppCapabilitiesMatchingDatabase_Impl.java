package com.google.android.gms.dtdi.core.database.appcapabilitiesmatching;

import defpackage.bapu;
import defpackage.bapz;
import defpackage.baqc;
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
/* loaded from: classes4.dex */
public final class AppCapabilitiesMatchingDatabase_Impl extends AppCapabilitiesMatchingDatabase {
    private volatile bapu o;

    @Override // defpackage.mhx
    protected final mgw a() {
        return new mgw(this, new HashMap(0), new HashMap(0), "AppCapabilitiesInfoEntity");
    }

    @Override // defpackage.mhx
    protected final /* synthetic */ mie c() {
        return new baqc(this);
    }

    @Override // defpackage.mhx
    protected final Map e() {
        HashMap hashMap = new HashMap();
        hashMap.put(bapu.class, Collections.EMPTY_LIST);
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

    @Override // com.google.android.gms.dtdi.core.database.appcapabilitiesmatching.AppCapabilitiesMatchingDatabase
    public final bapu v() {
        bapu bapuVar;
        if (this.o != null) {
            return this.o;
        }
        synchronized (this) {
            if (this.o == null) {
                this.o = new bapz(this);
            }
            bapuVar = this.o;
        }
        return bapuVar;
    }
}
