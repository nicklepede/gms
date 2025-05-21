package com.google.android.gms.trustlet.place.ui;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.widget.Toast;
import com.google.android.gms.R;
import defpackage.aqxd;
import defpackage.aqxe;
import defpackage.aqxo;
import defpackage.aqyd;
import defpackage.asej;
import defpackage.asot;
import defpackage.bzin;
import defpackage.bziq;
import defpackage.bzir;
import defpackage.dfae;
import defpackage.dfaq;
import defpackage.dgms;
import defpackage.dguw;
import defpackage.dgux;
import defpackage.ejhf;
import defpackage.ngn;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class TrustedPlacesSettingsCollapsingToolbarChimeraActivity extends dgms implements dfae {
    private static final asot k = asot.b("Trustlet_Place", asej.TRUSTLET_PLACE);
    private boolean l = false;
    private aqxo m;

    @Override // defpackage.dgmp
    protected final ngn a() {
        return new dguw();
    }

    @Override // defpackage.dgmp
    protected final String c() {
        return "TrustedPlacesFragment";
    }

    @Override // defpackage.dfae
    public final void hr(dfaq dfaqVar) {
        try {
            dfaqVar.j(aqxe.class);
        } catch (aqxe e) {
            try {
                if (this.l) {
                    return;
                }
                ((aqyd) e).c(getContainerActivity(), 10000);
                this.l = true;
            } catch (IntentSender.SendIntentException | ClassCastException e2) {
                ((ejhf) ((ejhf) ((ejhf) k.j()).s(e2)).ah((char) 11761)).x("[TrustedPlacesSettingsCollapsingToolbarChimeraActivity] Unable to resolve Location permission");
            }
        }
    }

    @Override // defpackage.dgms, defpackage.dgmp, defpackage.dgmo, defpackage.qgg, defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        aqxd aqxdVar = bziq.a;
        this.m = new aqxo(this, (float[][]) null);
    }

    @Override // defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onResume() {
        super.onResume();
        boolean b = dgux.b(this);
        boolean a = dgux.a(this);
        bzir bzirVar = new bzir();
        bzirVar.b(new bzin(102, 0L).a());
        this.m.ae(bzirVar.a()).x(this);
        if (!b || a) {
            return;
        }
        Toast.makeText(this, getString(R.string.auth_trust_agent_trusted_place_internet_off), 1).show();
    }
}
