package com.google.android.gms.autofill.ui.settings;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.R;
import defpackage.ajcr;
import defpackage.ajdb;
import defpackage.ajdm;
import defpackage.ajdx;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bp;
import defpackage.dg;
import defpackage.eluo;
import defpackage.fnvu;
import defpackage.rzk;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class AutofillModernSettingsChimeraActivity extends rzk {
    private static final ausn j = ausn.b("AutofillModernSettingsChimeraActivity", auid.AUTOFILL);
    private Intent k;
    private Bundle l;

    @Override // defpackage.rzk, defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
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
            ((eluo) ((eluo) j.j()).ai((char) 1431)).x("Finishing because intent is not found.");
            return;
        }
        if (this.l == null) {
            this.l = new Bundle();
        }
        String action = this.k.getAction();
        if (action == null) {
            ((eluo) ((eluo) j.i()).ai((char) 1430)).x("Fragment name is missing");
            return;
        }
        dg ajdbVar = action.equals("MODERN_PREFERENCES") ? fnvu.g() ? new ajdb() : new ajcr() : fnvu.g() ? new ajdx() : new ajdm();
        ajdbVar.setArguments(this.l);
        bp bpVar = new bp(getSupportFragmentManager());
        bpVar.F(R.id.content_frame, ajdbVar);
        bpVar.a();
    }

    @Override // defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("com.google.android.gms.autofill.activity_intent", this.k);
        bundle.putBundle("com.google.android.gms.autofill.state", this.l);
    }
}
