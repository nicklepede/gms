package com.google.android.gms.credential.manager.database;

import defpackage.aupe;
import defpackage.aupk;
import defpackage.aupm;
import defpackage.aupq;
import defpackage.aups;
import defpackage.auqa;
import defpackage.auqe;
import defpackage.auqf;
import defpackage.auqg;
import defpackage.auqh;
import defpackage.auqi;
import defpackage.auqj;
import defpackage.auqk;
import defpackage.auql;
import defpackage.auqm;
import defpackage.auqu;
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
public final class PwmDatabase_Impl extends PwmDatabase {
    private volatile aupm l;
    private volatile aupe m;
    private volatile aups n;
    private volatile auqm o;

    @Override // defpackage.kpm
    protected final kol a() {
        return new kol(this, new HashMap(0), new HashMap(0), "device_settings_table", "checkup_reencryption_table", "leak_check_reencryption", "weak_check_result");
    }

    @Override // defpackage.kpm
    protected final /* synthetic */ kpp c() {
        return new auql(this);
    }

    @Override // defpackage.kpm
    protected final Map e() {
        HashMap hashMap = new HashMap();
        hashMap.put(aupm.class, Collections.EMPTY_LIST);
        hashMap.put(aupe.class, Collections.EMPTY_LIST);
        hashMap.put(aups.class, Collections.EMPTY_LIST);
        hashMap.put(auqm.class, Collections.EMPTY_LIST);
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
        ArrayList arrayList = new ArrayList();
        arrayList.add(new auqe());
        arrayList.add(new auqf());
        arrayList.add(new auqg());
        arrayList.add(new auqh());
        arrayList.add(new auqi());
        arrayList.add(new auqj());
        arrayList.add(new auqk());
        return arrayList;
    }

    @Override // com.google.android.gms.credential.manager.database.PwmDatabase
    public final aupe v() {
        aupe aupeVar;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            if (this.m == null) {
                this.m = new aupk(this);
            }
            aupeVar = this.m;
        }
        return aupeVar;
    }

    @Override // com.google.android.gms.credential.manager.database.PwmDatabase
    public final aupm w() {
        aupm aupmVar;
        if (this.l != null) {
            return this.l;
        }
        synchronized (this) {
            if (this.l == null) {
                this.l = new aupq(this);
            }
            aupmVar = this.l;
        }
        return aupmVar;
    }

    @Override // com.google.android.gms.credential.manager.database.PwmDatabase
    public final aups x() {
        aups aupsVar;
        if (this.n != null) {
            return this.n;
        }
        synchronized (this) {
            if (this.n == null) {
                this.n = new auqa(this);
            }
            aupsVar = this.n;
        }
        return aupsVar;
    }

    @Override // com.google.android.gms.credential.manager.database.PwmDatabase
    public final auqm z() {
        auqm auqmVar;
        if (this.o != null) {
            return this.o;
        }
        synchronized (this) {
            if (this.o == null) {
                this.o = new auqu(this);
            }
            auqmVar = this.o;
        }
        return auqmVar;
    }
}
