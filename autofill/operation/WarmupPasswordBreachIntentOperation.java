package com.google.android.gms.autofill.operation;

import android.content.Intent;
import android.os.BadParcelableException;
import android.os.Bundle;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.autofill.data.Credential;
import com.google.android.gms.autofill.fill.FillForm;
import defpackage.adsf;
import defpackage.adsv;
import defpackage.adty;
import defpackage.adve;
import defpackage.advg;
import defpackage.adxv;
import defpackage.aery;
import defpackage.aerz;
import defpackage.afji;
import defpackage.afkk;
import defpackage.aflc;
import defpackage.ahfm;
import defpackage.asej;
import defpackage.asmf;
import defpackage.asot;
import defpackage.eigb;
import defpackage.eiid;
import defpackage.eius;
import defpackage.eiuu;
import defpackage.ejdg;
import defpackage.ejhf;
import defpackage.ensj;
import defpackage.ensv;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class WarmupPasswordBreachIntentOperation extends IntentOperation {
    public static final asot a = asot.b("WarmupPasswordBreachIntentOperation", asej.AUTOFILL);
    private final ensv b;

    public WarmupPasswordBreachIntentOperation() {
        this(new asmf(1, 9));
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        adsf adsfVar;
        getBaseContext();
        if (afji.a() != afji.UI) {
            ((ejhf) ((ejhf) a.i()).ah((char) 1044)).x("WarmupPasswordBreachIntentOperation must run on UI process");
            return;
        }
        aerz a2 = aery.a(this);
        eiid q = a2.q();
        if (q.h() && intent.getBooleanExtra("clear_password_leak_cache", false)) {
            ((aflc) q.c()).b();
            return;
        }
        try {
            FillForm fillForm = (FillForm) ahfm.b((Bundle) intent.getParcelableExtra("fill_form"));
            eiid g = a2.x(getBaseContext()).g();
            if (q.h() && g.h() && fillForm != null) {
                ensv ensvVar = this.b;
                eiid eiidVar = fillForm.g;
                advg advgVar = null;
                if (eiidVar.h()) {
                    adsfVar = (adsf) eiidVar.c();
                } else {
                    adsv adsvVar = fillForm.f;
                    adsfVar = adsvVar instanceof adsf ? (adsf) adsvVar : null;
                }
                if (adsfVar == null) {
                    ((ejhf) ((ejhf) a.j()).ah((char) 1042)).x("Android domain not found!");
                } else {
                    eius D = eiuu.D(1);
                    adsv adsvVar2 = fillForm.f;
                    if (adsvVar2 instanceof adty) {
                        D.c(adsvVar2);
                    }
                    advgVar = new advg(ensvVar, adsfVar, D.g(), eigb.a);
                }
                if (advgVar != null) {
                    ensj.t(((adxv) g.c()).a(new adve(advgVar, new ejdg(Credential.class))), new afkk((aflc) q.c()), ensvVar);
                }
            }
        } catch (BadParcelableException | IllegalStateException | NullPointerException | OutOfMemoryError e) {
            ((ejhf) ((ejhf) ((ejhf) a.h()).s(e)).ah((char) 1043)).x("Failed to unbundle fill form.");
        }
    }

    public WarmupPasswordBreachIntentOperation(ensv ensvVar) {
        this.b = ensvVar;
    }
}
