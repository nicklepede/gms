package com.google.android.gms.autofill.operation;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.autofill.operation.AccountWarmUpOperation;
import defpackage.aery;
import defpackage.aerz;
import defpackage.ageb;
import defpackage.asej;
import defpackage.asot;
import defpackage.eifw;
import defpackage.eijm;
import defpackage.enps;
import defpackage.enqc;
import defpackage.enre;
import defpackage.flee;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class AccountWarmUpOperation extends IntentOperation {
    public static final asot a = asot.b("AccountWarmUpOperation", asej.AUTOFILL);

    private final void a(final int i) {
        final aerz a2 = aery.a(this);
        ageb i2 = a2.i();
        if (i2.o()) {
            final eijm c = eijm.c(eifw.a);
            enps.g(i2.f(), new enqc() { // from class: afjj
                @Override // defpackage.enqc
                public final enss a(Object obj) {
                    Boolean bool = (Boolean) obj;
                    ((ejhf) ((ejhf) AccountWarmUpOperation.a.h()).ah((char) 1011)).B("Synced settings proto store initialized: %s", bool);
                    final fecj v = afqj.a.v();
                    eijm eijmVar = eijm.this;
                    eijmVar.g();
                    long millis = eijmVar.d().toMillis();
                    if (!v.b.L()) {
                        v.U();
                    }
                    fecp fecpVar = v.b;
                    ((afqj) fecpVar).b = millis;
                    if (!fecpVar.L()) {
                        v.U();
                    }
                    int i3 = i;
                    ((afqj) v.b).c = afqi.a(i3);
                    boolean booleanValue = bool.booleanValue();
                    if (!v.b.L()) {
                        v.U();
                    }
                    fecp fecpVar2 = v.b;
                    ((afqj) fecpVar2).e = booleanValue;
                    if (!fecpVar2.L()) {
                        v.U();
                    }
                    aerz aerzVar = a2;
                    ((afqj) v.b).d = false;
                    afft f = aerzVar.f();
                    Objects.requireNonNull(v);
                    f.U(new eijr() { // from class: afjk
                        @Override // defpackage.eijr
                        public final Object a() {
                            return (afqj) fecj.this.Q();
                        }
                    });
                    return ensj.i(bool);
                }
            }, enre.a);
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (flee.a.a().a()) {
            if (Objects.equals(intent.getAction(), "com.google.android.setupwizard.SETUP_WIZARD_FINISHED")) {
                a(8);
            }
        } else if (flee.a.a().b() && Objects.equals(intent.getAction(), "com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE") && intent.getCategories().contains("com.google.android.gms.auth.category.ACCOUNT_ADDED")) {
            a(7);
        }
    }
}
