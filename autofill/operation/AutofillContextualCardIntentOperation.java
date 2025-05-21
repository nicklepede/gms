package com.google.android.gms.autofill.operation;

import android.accounts.Account;
import android.content.Context;
import defpackage.aeyd;
import defpackage.aeye;
import defpackage.aghc;
import defpackage.aghd;
import defpackage.asew;
import defpackage.bquj;
import defpackage.bqul;
import defpackage.bqun;
import defpackage.eiid;
import defpackage.eijr;
import defpackage.eijy;
import defpackage.fixm;
import defpackage.flfw;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class AutofillContextualCardIntentOperation extends bqun {
    public AutofillContextualCardIntentOperation() {
        super(asew.DEFAULT_AUTOFILL);
    }

    @Override // defpackage.bqun
    public final bquj a(bqul bqulVar) {
        Account account = bqulVar.a;
        if (account == null) {
            return bquj.e;
        }
        aeyd a = aeye.a(this, eiid.j(account));
        Context context = a.a;
        final fixm fixmVar = a.o;
        Objects.requireNonNull(fixmVar);
        return new aghc(context, new aghd(eijy.a(new eijr() { // from class: aesi
            @Override // defpackage.eijr
            public final Object a() {
                return ((aesm) fuuq.this).a();
            }
        })), a.a());
    }

    @Override // defpackage.bqtk
    protected final boolean b() {
        return flfw.a.a().d();
    }
}
