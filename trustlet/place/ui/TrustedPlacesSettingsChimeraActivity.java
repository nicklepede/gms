package com.google.android.gms.trustlet.place.ui;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.widget.Toast;
import com.google.android.gms.R;
import defpackage.aszs;
import defpackage.aszt;
import defpackage.atad;
import defpackage.atas;
import defpackage.auid;
import defpackage.ausn;
import defpackage.cbre;
import defpackage.cbrh;
import defpackage.cbri;
import defpackage.dhlk;
import defpackage.dhlw;
import defpackage.dixz;
import defpackage.djgc;
import defpackage.djgd;
import defpackage.eluo;
import defpackage.ozo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class TrustedPlacesSettingsChimeraActivity extends dixz implements dhlk {
    private static final ausn l = ausn.b("Trustlet_Place", auid.TRUSTLET_PLACE);
    private boolean m = false;
    private atad n;

    @Override // defpackage.dixv
    protected final ozo a() {
        return new djgc();
    }

    @Override // defpackage.dhlk
    public final void hH(dhlw dhlwVar) {
        try {
            dhlwVar.j(aszt.class);
        } catch (aszt e) {
            try {
                if (this.m) {
                    return;
                }
                ((atas) e).c(getContainerActivity(), 10000);
                this.m = true;
            } catch (IntentSender.SendIntentException | ClassCastException e2) {
                ((eluo) ((eluo) ((eluo) l.j()).s(e2)).ai((char) 11763)).x("[TrustedPlacesSettingsChimeraSettingsActivity] Unable to resolve Location permission");
            }
        }
    }

    @Override // defpackage.dixv
    protected final String k() {
        return "TrustedPlacesFragment";
    }

    @Override // defpackage.dixz, defpackage.dixv, defpackage.dixs, defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        aszs aszsVar = cbrh.a;
        this.n = new atad(this, (float[][]) null);
    }

    @Override // defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onResume() {
        super.onResume();
        boolean b = djgd.b(this);
        boolean a = djgd.a(this);
        cbri cbriVar = new cbri();
        cbriVar.b(new cbre(102, 0L).a());
        this.n.ae(cbriVar.a()).x(this);
        if (!b || a) {
            return;
        }
        Toast.makeText(this, getString(R.string.auth_trust_agent_trusted_place_internet_off), 1).show();
    }
}
