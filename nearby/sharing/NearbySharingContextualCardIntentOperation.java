package com.google.android.gms.nearby.sharing;

import android.accounts.Account;
import defpackage.auiq;
import defpackage.btca;
import defpackage.btcc;
import defpackage.btce;
import defpackage.cofd;
import defpackage.cpcp;
import defpackage.cpcs;
import defpackage.cpda;
import defpackage.ekut;
import defpackage.ekvi;
import defpackage.eqdl;
import defpackage.eqex;
import defpackage.ftfh;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class NearbySharingContextualCardIntentOperation extends btce {
    public NearbySharingContextualCardIntentOperation() {
        super(auiq.NEARBY_SHARING);
    }

    @Override // defpackage.btce
    public final btca a(btcc btccVar) {
        Account account = btccVar.a;
        if (account == null) {
            return btca.e;
        }
        cpda a = cpcs.a(this, ekvi.j(account));
        return new cpcp(this, new cofd(this), a.a(a.b.i()), eqdl.f(a.a, new ekut() { // from class: cofc
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                return (Account) ((ekvi) obj).c();
            }
        }, eqex.a));
    }

    @Override // defpackage.btbb
    protected final boolean b() {
        return ftfh.a.lK().a();
    }
}
