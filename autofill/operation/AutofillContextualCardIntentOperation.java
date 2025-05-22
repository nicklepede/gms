package com.google.android.gms.autofill.operation;

import android.accounts.Account;
import android.content.Context;
import defpackage.agyq;
import defpackage.agyr;
import defpackage.aihs;
import defpackage.aiht;
import defpackage.auiq;
import defpackage.btca;
import defpackage.btcc;
import defpackage.btce;
import defpackage.ekvi;
import defpackage.ekww;
import defpackage.ekxd;
import defpackage.flnj;
import defpackage.fnxj;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class AutofillContextualCardIntentOperation extends btce {
    public AutofillContextualCardIntentOperation() {
        super(auiq.DEFAULT_AUTOFILL);
    }

    @Override // defpackage.btce
    public final btca a(btcc btccVar) {
        Account account = btccVar.a;
        if (account == null) {
            return btca.e;
        }
        agyq a = agyr.a(this, ekvi.j(account));
        Context context = a.a;
        final flnj flnjVar = a.o;
        Objects.requireNonNull(flnjVar);
        return new aihs(context, new aiht(ekxd.a(new ekww() { // from class: agsv
            @Override // defpackage.ekww
            public final Object lK() {
                return ((agsz) fxqo.this).a();
            }
        })), a.a());
    }

    @Override // defpackage.btbb
    protected final boolean b() {
        return fnxj.a.lK().d();
    }
}
