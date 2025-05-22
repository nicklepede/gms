package com.google.android.gms.threadnetwork.credentials.storage;

import defpackage.dhye;
import defpackage.dhyv;
import defpackage.dhyw;
import defpackage.dhyx;
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
/* loaded from: classes7.dex */
public final class BorderAgentRoomDatabase_Impl extends BorderAgentRoomDatabase {
    private volatile dhye m;

    @Override // defpackage.mhx
    protected final mgw a() {
        return new mgw(this, new HashMap(0), new HashMap(0), "border_agent_table");
    }

    @Override // defpackage.mhx
    protected final /* synthetic */ mie c() {
        return new dhyx(this);
    }

    @Override // defpackage.mhx
    protected final Map e() {
        HashMap hashMap = new HashMap();
        hashMap.put(dhye.class, Collections.EMPTY_LIST);
        return hashMap;
    }

    @Override // defpackage.mhx
    public final Set f() {
        return new HashSet();
    }

    @Override // defpackage.mhx
    public final void k() {
        super.t("border_agent_table");
    }

    @Override // defpackage.mhx
    public final List s() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new dhyv());
        arrayList.add(new dhyw());
        return arrayList;
    }

    @Override // com.google.android.gms.threadnetwork.credentials.storage.BorderAgentRoomDatabase
    public final dhye v() {
        dhye dhyeVar;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            if (this.m == null) {
                this.m = new dhye(this);
            }
            dhyeVar = this.m;
        }
        return dhyeVar;
    }
}
