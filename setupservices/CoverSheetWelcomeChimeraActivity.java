package com.google.android.gms.setupservices;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import com.google.android.cast.JGCastService;
import defpackage.atmr;
import defpackage.atmt;
import defpackage.auad;
import defpackage.cbiq;
import defpackage.deol;
import defpackage.dept;
import defpackage.efrl;
import defpackage.efwn;
import defpackage.emll;
import defpackage.emmu;
import defpackage.epyr;
import defpackage.fgrc;
import defpackage.fvns;
import defpackage.iri;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class CoverSheetWelcomeChimeraActivity extends deol implements View.OnClickListener {
    public static final auad j = new auad("SetupServices", "CoverSheetWelcomeActivity");
    public cbiq k;
    private Bundle l;
    private fgrc m;

    private final int n() {
        return Settings.Global.getInt(getContentResolver(), "el_capitan_reviewed_version", 0);
    }

    private final void o() {
        int i = 2;
        try {
            Intent intent = new Intent("com.google.android.apps.tips.action.COVERSHEET");
            intent.setPackage("com.google.android.apps.tips");
            intent.setFlags(335544320);
            startActivity(intent);
            fgrc fgrcVar = this.m;
            if (!fgrcVar.b.L()) {
                fgrcVar.U();
            }
            emmu emmuVar = (emmu) fgrcVar.b;
            emmu emmuVar2 = emmu.a;
            emmuVar.b |= 2;
            emmuVar.d = true;
        } catch (ActivityNotFoundException unused) {
            j.m("Coversheet was not found", new Object[0]);
        }
        if (dept.a("pixel_legal_joint_permission", false) && Settings.Global.getInt(getContentResolver(), "el_capitan_reviewed", 0) == 1 && Settings.Global.getInt(getContentResolver(), "el_capitan_reviewed_version", 0) <= 0) {
            Settings.Global.putInt(getContentResolver(), "el_capitan_reviewed_version", 1);
        }
        j.h("Skip el-cap Coversheet.", new Object[0]);
        if (!fvns.g()) {
            i = 3;
        } else if (n() != 2 && !dept.a("pixel_legal_joint_permission_v2", false)) {
            int i2 = iri.a;
            i = 4;
        }
        fgrc fgrcVar2 = this.m;
        if (!fgrcVar2.b.L()) {
            fgrcVar2.U();
        }
        emmu emmuVar3 = (emmu) fgrcVar2.b;
        emmu emmuVar4 = emmu.a;
        emmuVar3.f = i - 1;
        emmuVar3.b |= 16;
        if (!fgrcVar2.b.L()) {
            fgrcVar2.U();
        }
        emmu emmuVar5 = (emmu) fgrcVar2.b;
        emmuVar5.b = 1 | emmuVar5.b;
        emmuVar5.c = false;
        p((emmu) fgrcVar2.Q());
        this.h.c();
        finish();
    }

    private final void p(emmu emmuVar) {
        fgrc k = k();
        if (!k.b.L()) {
            k.U();
        }
        emll emllVar = (emll) k.b;
        emll emllVar2 = emll.a;
        emmuVar.getClass();
        emllVar.ad = emmuVar;
        emllVar.c |= JGCastService.FLAG_PRIVATE_DISPLAY;
    }

    private static final void q() {
        if (fvns.e()) {
            fvns.f();
        }
    }

    private static final void r() {
        if (fvns.e() && fvns.g()) {
            int i = iri.a;
        }
    }

    @Override // defpackage.dekn
    protected final String a() {
        return "CoverSheetWelcomeActivity";
    }

    @Override // defpackage.atmc
    protected final void gJ(String str, boolean z) {
        if (str != null) {
            atmr.h(this, str);
        }
        int i = efwn.a;
        if (efrl.w(this)) {
            setTheme(efwn.a(this));
        }
        atmr.d(this, z, getBaseContext());
    }

    @Override // defpackage.deqi
    public final Bundle j() {
        if (this.l == null) {
            this.l = new Bundle();
        }
        return this.l;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == null) {
            if (l()) {
                this.k.c(epyr.TAP, null);
            }
            Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SERVICES");
            intent.setPackage("com.google.android.gms");
            intent.setFlags(335544320);
            intent.putExtra("theme", efrl.l(this));
            r();
            q();
            fgrc fgrcVar = this.m;
            if (!fgrcVar.b.L()) {
                fgrcVar.U();
            }
            emmu emmuVar = (emmu) fgrcVar.b;
            emmu emmuVar2 = emmu.a;
            emmuVar.b |= 1;
            emmuVar.c = true;
            p((emmu) fgrcVar.Q());
            startActivity(intent);
            c(-1);
        }
    }

    @Override // defpackage.dekn, defpackage.deoj, defpackage.atmc, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        if (bundle != null) {
            this.l = new Bundle(bundle);
        }
        super.onCreate(bundle);
        int n = n();
        emmu emmuVar = ((emll) k().b).ad;
        if (emmuVar == null) {
            emmuVar = emmu.a;
        }
        fgrc fgrcVar = (fgrc) emmuVar.iQ(5, null);
        fgrcVar.X(emmuVar);
        if (!fgrcVar.b.L()) {
            fgrcVar.U();
        }
        emmu emmuVar2 = (emmu) fgrcVar.b;
        emmuVar2.b |= 4;
        emmuVar2.e = n;
        this.m = fgrcVar;
        j.h("Original Reviewed version: %d, elCapitanPostOtaFlowEnabled: %b, elCapitanPostOtaFlowV2Enabled: %b", Integer.valueOf(n), Boolean.valueOf(fvns.f()), Boolean.valueOf(fvns.g()));
        r();
        q();
        o();
    }

    @Override // defpackage.atmc
    protected final atmt x() {
        atmt b = atmt.b(null);
        String l = efrl.l(this);
        if (l != null) {
            b.a = l;
            return b;
        }
        b.a = "glif_v4_light";
        return b;
    }
}
