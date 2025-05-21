package com.google.android.gms.findmydevice.spot.sync;

import android.accounts.Account;
import com.google.android.gms.findmydevice.util.SafeGmsTaskBoundService;
import defpackage.asej;
import defpackage.asot;
import defpackage.bebo;
import defpackage.bebp;
import defpackage.belk;
import defpackage.bfcs;
import defpackage.bfdr;
import defpackage.byjl;
import defpackage.byln;
import defpackage.eiid;
import defpackage.ejhf;
import defpackage.ensj;
import defpackage.enss;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class EidCachingService extends SafeGmsTaskBoundService {
    private static final asot a = asot.b("EidCachingService", asej.FIND_MY_DEVICE_SPOT);
    private final belk b;

    public EidCachingService() {
        this(bebo.a());
    }

    @Override // com.google.android.gms.findmydevice.util.SafeGmsTaskBoundService
    protected final enss d(byln bylnVar) {
        if (!bfdr.a()) {
            ((ejhf) ((ejhf) a.j()).ah((char) 4521)).x("Eddystone use cases are disabled.");
            return ensj.i(2);
        }
        eiid d = bfcs.d(bylnVar, getBaseContext());
        if (d.h()) {
            this.b.g((Account) d.c());
            return ensj.i(0);
        }
        ((ejhf) ((ejhf) a.i()).ah((char) 4520)).x("Account is missing while caching EIDs to memory.");
        eiid e = bfcs.e(bylnVar);
        if (e.h()) {
            bfcs.f(byjl.a(getBaseContext()), (String) e.c());
        }
        return ensj.i(2);
    }

    public EidCachingService(bebp bebpVar) {
        this.b = bebpVar.o();
    }
}
