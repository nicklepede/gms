package com.google.android.gms.kids.database;

import defpackage.brkd;
import defpackage.brke;
import defpackage.brkh;
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
/* loaded from: classes5.dex */
public final class DirectBootSupervisionDatabase_Impl extends DirectBootSupervisionDatabase {
    @Override // defpackage.mhx
    protected final mgw a() {
        return new mgw(this, new HashMap(0), new HashMap(0), "DirectBootTrustedPhoneNumber", "KeyValue");
    }

    @Override // defpackage.mhx
    protected final /* synthetic */ mie c() {
        return new brkd(this);
    }

    @Override // defpackage.mhx
    protected final Map e() {
        HashMap hashMap = new HashMap();
        hashMap.put(brke.class, Collections.EMPTY_LIST);
        hashMap.put(brkh.class, Collections.EMPTY_LIST);
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
}
