package com.google.android.gms.autofill.operation;

import android.content.Intent;
import android.os.BadParcelableException;
import android.os.Bundle;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.autofill.data.Credential;
import com.google.android.gms.autofill.fill.FillForm;
import defpackage.afsm;
import defpackage.aftc;
import defpackage.afuf;
import defpackage.afvl;
import defpackage.afvn;
import defpackage.afyc;
import defpackage.agsl;
import defpackage.agsm;
import defpackage.ahju;
import defpackage.ahkw;
import defpackage.ahlo;
import defpackage.ajgc;
import defpackage.auid;
import defpackage.aupz;
import defpackage.ausn;
import defpackage.ektg;
import defpackage.ekvi;
import defpackage.elhx;
import defpackage.elhz;
import defpackage.elqn;
import defpackage.eluo;
import defpackage.eqgc;
import defpackage.eqgo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class WarmupPasswordBreachIntentOperation extends IntentOperation {
    public static final ausn a = ausn.b("WarmupPasswordBreachIntentOperation", auid.AUTOFILL);
    private final eqgo b;

    public WarmupPasswordBreachIntentOperation() {
        this(new aupz(1, 9));
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        afsm afsmVar;
        getBaseContext();
        if (ahju.a() != ahju.UI) {
            ((eluo) ((eluo) a.i()).ai((char) 1038)).x("WarmupPasswordBreachIntentOperation must run on UI process");
            return;
        }
        agsm a2 = agsl.a(this);
        ekvi q = a2.q();
        if (q.h() && intent.getBooleanExtra("clear_password_leak_cache", false)) {
            ((ahlo) q.c()).b();
            return;
        }
        try {
            FillForm fillForm = (FillForm) ajgc.b((Bundle) intent.getParcelableExtra("fill_form"));
            ekvi g = a2.x(getBaseContext()).g();
            if (q.h() && g.h() && fillForm != null) {
                eqgo eqgoVar = this.b;
                ekvi ekviVar = fillForm.g;
                afvn afvnVar = null;
                if (ekviVar.h()) {
                    afsmVar = (afsm) ekviVar.c();
                } else {
                    aftc aftcVar = fillForm.f;
                    afsmVar = aftcVar instanceof afsm ? (afsm) aftcVar : null;
                }
                if (afsmVar == null) {
                    ((eluo) ((eluo) a.j()).ai((char) 1036)).x("Android domain not found!");
                } else {
                    elhx D = elhz.D(1);
                    aftc aftcVar2 = fillForm.f;
                    if (aftcVar2 instanceof afuf) {
                        D.c(aftcVar2);
                    }
                    afvnVar = new afvn(eqgoVar, afsmVar, D.g(), ektg.a);
                }
                if (afvnVar != null) {
                    eqgc.t(((afyc) g.c()).a(new afvl(afvnVar, new elqn(Credential.class))), new ahkw((ahlo) q.c()), eqgoVar);
                }
            }
        } catch (BadParcelableException | IllegalStateException | NullPointerException | OutOfMemoryError e) {
            ((eluo) ((eluo) ((eluo) a.h()).s(e)).ai((char) 1037)).x("Failed to unbundle fill form.");
        }
    }

    public WarmupPasswordBreachIntentOperation(eqgo eqgoVar) {
        this.b = eqgoVar;
    }
}
