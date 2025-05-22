package com.google.android.gms.autofill.operation;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.autofill.operation.AccountWarmUpOperation;
import defpackage.agsl;
import defpackage.agsm;
import defpackage.aier;
import defpackage.auid;
import defpackage.ausn;
import defpackage.ektc;
import defpackage.ekwr;
import defpackage.eqdl;
import defpackage.eqdv;
import defpackage.eqex;
import defpackage.fnvo;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class AccountWarmUpOperation extends IntentOperation {
    public static final ausn a = ausn.b("AccountWarmUpOperation", auid.AUTOFILL);

    private final void a(final int i) {
        final agsm a2 = agsl.a(this);
        aier i2 = a2.i();
        if (i2.o()) {
            final ekwr c = ekwr.c(ektc.a);
            eqdl.g(i2.f(), new eqdv() { // from class: ahjv
                @Override // defpackage.eqdv
                public final eqgl a(Object obj) {
                    Boolean bool = (Boolean) obj;
                    ((eluo) ((eluo) AccountWarmUpOperation.a.h()).ai((char) 1000)).B("Synced settings proto store initialized: %s", bool);
                    final fgrc v = ahqv.a.v();
                    ekwr ekwrVar = ekwr.this;
                    ekwrVar.g();
                    long millis = ekwrVar.d().toMillis();
                    if (!v.b.L()) {
                        v.U();
                    }
                    fgri fgriVar = v.b;
                    ((ahqv) fgriVar).b = millis;
                    if (!fgriVar.L()) {
                        v.U();
                    }
                    int i3 = i;
                    ((ahqv) v.b).c = ahqu.a(i3);
                    boolean booleanValue = bool.booleanValue();
                    if (!v.b.L()) {
                        v.U();
                    }
                    fgri fgriVar2 = v.b;
                    ((ahqv) fgriVar2).e = booleanValue;
                    if (!fgriVar2.L()) {
                        v.U();
                    }
                    agsm agsmVar = a2;
                    ((ahqv) v.b).d = false;
                    ahgf f = agsmVar.f();
                    Objects.requireNonNull(v);
                    f.U(new ekww() { // from class: ahjw
                        @Override // defpackage.ekww
                        public final Object lK() {
                            return (ahqv) fgrc.this.Q();
                        }
                    });
                    return eqgc.i(bool);
                }
            }, eqex.a);
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        fnvo fnvoVar = fnvo.a;
        if (fnvoVar.lK().a()) {
            if (Objects.equals(intent.getAction(), "com.google.android.setupwizard.SETUP_WIZARD_FINISHED")) {
                a(8);
            }
        } else if (fnvoVar.lK().b() && Objects.equals(intent.getAction(), "com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE") && intent.getCategories().contains("com.google.android.gms.auth.category.ACCOUNT_ADDED")) {
            a(7);
        }
    }
}
