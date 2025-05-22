package com.google.android.gms.findmydevice.spot.sync;

import android.accounts.Account;
import com.google.android.gms.findmydevice.util.SafeGmsTaskBoundService;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bgda;
import defpackage.bgdb;
import defpackage.bgmw;
import defpackage.bhei;
import defpackage.bhfh;
import defpackage.casd;
import defpackage.cauf;
import defpackage.ekvi;
import defpackage.eluo;
import defpackage.eqgc;
import defpackage.eqgl;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class EidCachingService extends SafeGmsTaskBoundService {
    private static final ausn a = ausn.b("EidCachingService", auid.FIND_MY_DEVICE_SPOT);
    private final bgmw b;

    public EidCachingService() {
        this(bgda.a());
    }

    @Override // com.google.android.gms.findmydevice.util.SafeGmsTaskBoundService
    protected final eqgl d(cauf caufVar) {
        if (!bhfh.a()) {
            ((eluo) ((eluo) a.j()).ai((char) 4531)).x("Eddystone use cases are disabled.");
            return eqgc.i(2);
        }
        ekvi d = bhei.d(caufVar, getBaseContext());
        if (d.h()) {
            this.b.g((Account) d.c());
            return eqgc.i(0);
        }
        ((eluo) ((eluo) a.i()).ai((char) 4530)).x("Account is missing while caching EIDs to memory.");
        ekvi e = bhei.e(caufVar);
        if (e.h()) {
            bhei.f(casd.a(getBaseContext()), (String) e.c());
        }
        return eqgc.i(2);
    }

    public EidCachingService(bgdb bgdbVar) {
        this.b = bgdbVar.o();
    }
}
