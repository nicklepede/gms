package com.google.android.gms.setupservices;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import defpackage.arkc;
import defpackage.arke;
import defpackage.arxo;
import defpackage.byzz;
import defpackage.dcef;
import defpackage.dcfn;
import defpackage.edeq;
import defpackage.edjs;
import defpackage.ejya;
import defpackage.ejzj;
import defpackage.enla;
import defpackage.fecj;
import defpackage.fssc;
import defpackage.ips;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class CoverSheetWelcomeChimeraActivity extends dcef implements View.OnClickListener {
    public static final arxo j = new arxo("SetupServices", "CoverSheetWelcomeActivity");
    public byzz k;
    private Bundle l;
    private fecj m;

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
            fecj fecjVar = this.m;
            if (!fecjVar.b.L()) {
                fecjVar.U();
            }
            ejzj ejzjVar = (ejzj) fecjVar.b;
            ejzj ejzjVar2 = ejzj.a;
            ejzjVar.b |= 2;
            ejzjVar.d = true;
        } catch (ActivityNotFoundException unused) {
            j.m("Coversheet was not found", new Object[0]);
        }
        if (dcfn.a("pixel_legal_joint_permission", false) && Settings.Global.getInt(getContentResolver(), "el_capitan_reviewed", 0) == 1 && Settings.Global.getInt(getContentResolver(), "el_capitan_reviewed_version", 0) <= 0) {
            Settings.Global.putInt(getContentResolver(), "el_capitan_reviewed_version", 1);
        }
        j.h("Skip el-cap Coversheet.", new Object[0]);
        if (!fssc.g()) {
            i = 3;
        } else if (n() != 2 && !dcfn.a("pixel_legal_joint_permission_v2", false)) {
            int i2 = ips.a;
            i = 4;
        }
        fecj fecjVar2 = this.m;
        if (!fecjVar2.b.L()) {
            fecjVar2.U();
        }
        ejzj ejzjVar3 = (ejzj) fecjVar2.b;
        ejzj ejzjVar4 = ejzj.a;
        ejzjVar3.f = i - 1;
        ejzjVar3.b |= 16;
        if (!fecjVar2.b.L()) {
            fecjVar2.U();
        }
        ejzj ejzjVar5 = (ejzj) fecjVar2.b;
        ejzjVar5.b = 1 | ejzjVar5.b;
        ejzjVar5.c = false;
        p((ejzj) fecjVar2.Q());
        this.h.c();
        finish();
    }

    private final void p(ejzj ejzjVar) {
        fecj k = k();
        if (!k.b.L()) {
            k.U();
        }
        ejya ejyaVar = (ejya) k.b;
        ejya ejyaVar2 = ejya.a;
        ejzjVar.getClass();
        ejyaVar.ad = ejzjVar;
        ejyaVar.d |= 2;
    }

    private static final void q() {
        if (fssc.e()) {
            fssc.f();
        }
    }

    private static final void r() {
        if (fssc.e() && fssc.g()) {
            int i = ips.a;
        }
    }

    @Override // defpackage.dcah
    protected final String a() {
        return "CoverSheetWelcomeActivity";
    }

    @Override // defpackage.arjn
    protected final void gu(String str, boolean z) {
        if (str != null) {
            arkc.h(this, str);
        }
        int i = edjs.a;
        if (edeq.w(this)) {
            setTheme(edjs.a(this));
        }
        arkc.d(this, z, getBaseContext());
    }

    @Override // defpackage.dcgc
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
                this.k.c(enla.TAP, null);
            }
            Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SERVICES");
            intent.setPackage("com.google.android.gms");
            intent.setFlags(335544320);
            intent.putExtra("theme", edeq.l(this));
            r();
            q();
            fecj fecjVar = this.m;
            if (!fecjVar.b.L()) {
                fecjVar.U();
            }
            ejzj ejzjVar = (ejzj) fecjVar.b;
            ejzj ejzjVar2 = ejzj.a;
            ejzjVar.b |= 1;
            ejzjVar.c = true;
            p((ejzj) fecjVar.Q());
            startActivity(intent);
            c(-1);
        }
    }

    @Override // defpackage.dcah, defpackage.dced, defpackage.arjn, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        if (bundle != null) {
            this.l = new Bundle(bundle);
        }
        super.onCreate(bundle);
        int n = n();
        ejzj ejzjVar = ((ejya) k().b).ad;
        if (ejzjVar == null) {
            ejzjVar = ejzj.a;
        }
        fecj fecjVar = (fecj) ejzjVar.iB(5, null);
        fecjVar.X(ejzjVar);
        if (!fecjVar.b.L()) {
            fecjVar.U();
        }
        ejzj ejzjVar2 = (ejzj) fecjVar.b;
        ejzjVar2.b |= 4;
        ejzjVar2.e = n;
        this.m = fecjVar;
        j.h("Original Reviewed version: %d, elCapitanPostOtaFlowEnabled: %b, elCapitanPostOtaFlowV2Enabled: %b", Integer.valueOf(n), Boolean.valueOf(fssc.f()), Boolean.valueOf(fssc.g()));
        r();
        q();
        o();
    }

    @Override // defpackage.arjn
    protected final arke x() {
        arke b = arke.b(null);
        String l = edeq.l(this);
        if (l != null) {
            b.a = l;
            return b;
        }
        b.a = "glif_v4_light";
        return b;
    }
}
