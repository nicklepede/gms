package com.google.android.gms.autofill.ui.settings;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.R;
import defpackage.ahcb;
import defpackage.ahcl;
import defpackage.ahcw;
import defpackage.ahdh;
import defpackage.asej;
import defpackage.asot;
import defpackage.bp;
import defpackage.dg;
import defpackage.ejhf;
import defpackage.flek;
import defpackage.qgg;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class AutofillModernSettingsChimeraActivity extends qgg {
    private static final asot j = asot.b("AutofillModernSettingsChimeraActivity", asej.AUTOFILL);
    private Intent k;
    private Bundle l;

    @Override // defpackage.qgg, defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.autofill_label);
        if (bundle != null) {
            this.k = (Intent) bundle.getParcelable("com.google.android.gms.autofill.activity_intent");
            this.l = bundle.getBundle("com.google.android.gms.autofill.state");
        } else {
            Intent intent = getIntent();
            if (intent != null) {
                this.k = intent;
                this.l = intent.getExtras();
                intent.replaceExtras((Bundle) null);
            }
        }
        if (this.k == null) {
            ((ejhf) ((ejhf) j.j()).ah((char) 1427)).x("Finishing because intent is not found.");
            return;
        }
        if (this.l == null) {
            this.l = new Bundle();
        }
        String action = this.k.getAction();
        if (action == null) {
            ((ejhf) ((ejhf) j.i()).ah((char) 1426)).x("Fragment name is missing");
            return;
        }
        dg ahclVar = action.equals("MODERN_PREFERENCES") ? flek.f() ? new ahcl() : new ahcb() : flek.f() ? new ahdh() : new ahcw();
        ahclVar.setArguments(this.l);
        bp bpVar = new bp(getSupportFragmentManager());
        bpVar.F(R.id.content_frame, ahclVar);
        bpVar.a();
    }

    @Override // defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("com.google.android.gms.autofill.activity_intent", this.k);
        bundle.putBundle("com.google.android.gms.autofill.state", this.l);
    }
}
