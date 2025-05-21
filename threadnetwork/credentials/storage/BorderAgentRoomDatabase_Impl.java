package com.google.android.gms.threadnetwork.credentials.storage;

import defpackage.dfna;
import defpackage.dfnr;
import defpackage.dfns;
import defpackage.dfnt;
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
/* loaded from: classes7.dex */
public final class BorderAgentRoomDatabase_Impl extends BorderAgentRoomDatabase {
    private volatile dfna l;

    @Override // defpackage.kpm
    protected final kol a() {
        return new kol(this, new HashMap(0), new HashMap(0), "border_agent_table");
    }

    @Override // defpackage.kpm
    protected final /* synthetic */ kpp c() {
        return new dfnt(this);
    }

    @Override // defpackage.kpm
    protected final Map e() {
        HashMap hashMap = new HashMap();
        hashMap.put(dfna.class, Collections.EMPTY_LIST);
        return hashMap;
    }

    @Override // defpackage.kpm
    public final Set f() {
        return new HashSet();
    }

    @Override // defpackage.kpm
    public final void k() {
        super.t("border_agent_table");
    }

    @Override // defpackage.kpm
    public final List s() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new dfnr());
        arrayList.add(new dfns());
        return arrayList;
    }

    @Override // com.google.android.gms.threadnetwork.credentials.storage.BorderAgentRoomDatabase
    public final dfna v() {
        dfna dfnaVar;
        if (this.l != null) {
            return this.l;
        }
        synchronized (this) {
            if (this.l == null) {
                this.l = new dfna(this);
            }
            dfnaVar = this.l;
        }
        return dfnaVar;
    }
}
