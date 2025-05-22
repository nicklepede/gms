package com.google.android.gms.credential.manager.database;

import defpackage.awte;
import defpackage.awtk;
import defpackage.awtm;
import defpackage.awtq;
import defpackage.awts;
import defpackage.awua;
import defpackage.awue;
import defpackage.awuf;
import defpackage.awug;
import defpackage.awuh;
import defpackage.awui;
import defpackage.awuj;
import defpackage.awuk;
import defpackage.awul;
import defpackage.awum;
import defpackage.awuu;
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
public final class PwmDatabase_Impl extends PwmDatabase {
    private volatile awtm m;
    private volatile awte n;
    private volatile awts o;
    private volatile awum p;

    @Override // defpackage.mhx
    protected final mgw a() {
        return new mgw(this, new HashMap(0), new HashMap(0), "device_settings_table", "checkup_reencryption_table", "leak_check_reencryption", "weak_check_result");
    }

    @Override // defpackage.mhx
    protected final /* synthetic */ mie c() {
        return new awul(this);
    }

    @Override // defpackage.mhx
    protected final Map e() {
        HashMap hashMap = new HashMap();
        hashMap.put(awtm.class, Collections.EMPTY_LIST);
        hashMap.put(awte.class, Collections.EMPTY_LIST);
        hashMap.put(awts.class, Collections.EMPTY_LIST);
        hashMap.put(awum.class, Collections.EMPTY_LIST);
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
        ArrayList arrayList = new ArrayList();
        arrayList.add(new awue());
        arrayList.add(new awuf());
        arrayList.add(new awug());
        arrayList.add(new awuh());
        arrayList.add(new awui());
        arrayList.add(new awuj());
        arrayList.add(new awuk());
        return arrayList;
    }

    @Override // com.google.android.gms.credential.manager.database.PwmDatabase
    public final awte v() {
        awte awteVar;
        if (this.n != null) {
            return this.n;
        }
        synchronized (this) {
            if (this.n == null) {
                this.n = new awtk(this);
            }
            awteVar = this.n;
        }
        return awteVar;
    }

    @Override // com.google.android.gms.credential.manager.database.PwmDatabase
    public final awtm w() {
        awtm awtmVar;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            if (this.m == null) {
                this.m = new awtq(this);
            }
            awtmVar = this.m;
        }
        return awtmVar;
    }

    @Override // com.google.android.gms.credential.manager.database.PwmDatabase
    public final awts x() {
        awts awtsVar;
        if (this.o != null) {
            return this.o;
        }
        synchronized (this) {
            if (this.o == null) {
                this.o = new awua(this);
            }
            awtsVar = this.o;
        }
        return awtsVar;
    }

    @Override // com.google.android.gms.credential.manager.database.PwmDatabase
    public final awum z() {
        awum awumVar;
        if (this.p != null) {
            return this.p;
        }
        synchronized (this) {
            if (this.p == null) {
                this.p = new awuu(this);
            }
            awumVar = this.p;
        }
        return awumVar;
    }
}
