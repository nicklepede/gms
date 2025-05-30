package com.google.android.gms.backup.transport.postd2dapptransfer;

import defpackage.amlb;
import defpackage.amlj;
import defpackage.amlk;
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
public final class PostD2dAppTransferInfoDatabase_Impl extends PostD2dAppTransferInfoDatabase {
    private volatile amlb m;

    @Override // defpackage.mhx
    protected final mgw a() {
        return new mgw(this, new HashMap(0), new HashMap(0), "PostD2dAppDataCleanupInfo");
    }

    @Override // defpackage.mhx
    protected final /* synthetic */ mie c() {
        return new amlk(this);
    }

    @Override // defpackage.mhx
    protected final Map e() {
        HashMap hashMap = new HashMap();
        hashMap.put(amlb.class, Collections.EMPTY_LIST);
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

    @Override // com.google.android.gms.backup.transport.postd2dapptransfer.PostD2dAppTransferInfoDatabase
    public final amlb v() {
        amlb amlbVar;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            if (this.m == null) {
                this.m = new amlj(this);
            }
            amlbVar = this.m;
        }
        return amlbVar;
    }
}
