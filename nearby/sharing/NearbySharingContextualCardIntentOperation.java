package com.google.android.gms.nearby.sharing;

import android.accounts.Account;
import defpackage.asew;
import defpackage.bquj;
import defpackage.bqul;
import defpackage.bqun;
import defpackage.clwv;
import defpackage.cmuh;
import defpackage.cmuk;
import defpackage.cmus;
import defpackage.eiho;
import defpackage.eiid;
import defpackage.enps;
import defpackage.enre;
import defpackage.fqlm;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class NearbySharingContextualCardIntentOperation extends bqun {
    public NearbySharingContextualCardIntentOperation() {
        super(asew.NEARBY_SHARING);
    }

    @Override // defpackage.bqun
    public final bquj a(bqul bqulVar) {
        Account account = bqulVar.a;
        if (account == null) {
            return bquj.e;
        }
        cmus a = cmuk.a(this, eiid.j(account));
        return new cmuh(this, new clwv(this), a.a(a.b.i()), enps.f(a.a, new eiho() { // from class: clwu
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                return (Account) ((eiid) obj).c();
            }
        }, enre.a));
    }

    @Override // defpackage.bqtk
    protected final boolean b() {
        return fqlm.a.a().a();
    }
}
