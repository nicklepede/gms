package com.google.android.gms.kids.settings.flows.addkiduser;

import android.os.Bundle;
import com.google.android.gms.R;
import com.google.android.gms.kids.settings.flows.addkiduser.CreateSupervisedUserChimeraActivity;
import defpackage.bp;
import defpackage.bpwc;
import defpackage.bpwi;
import defpackage.bpxt;
import defpackage.edeq;
import defpackage.edjs;
import defpackage.edjt;
import defpackage.fuuw;
import defpackage.fuvg;
import defpackage.fvaf;
import defpackage.qet;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class CreateSupervisedUserChimeraActivity extends qet {
    private final fuuw j = new fuvg(new fvaf() { // from class: bpwp
        @Override // defpackage.fvaf
        public final Object a() {
            return (bpwi) new jrh(CreateSupervisedUserChimeraActivity.this).a(bpwi.class);
        }
    });

    private final bpwi a() {
        return (bpwi) this.j.a();
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        int a;
        super.onCreate(bundle);
        setTheme(R.style.Theme_GoogleMaterial3_DayNight);
        setTheme(new edjt(R.style.SudThemeGlifV3_DayNight, true).a(getIntent()));
        int i = edjs.a;
        if (edeq.w(this) && (a = edjs.a(this)) != 0) {
            setTheme(a);
        }
        Bundle extras = getIntent().getExtras();
        a().f.hS(Boolean.valueOf(extras != null ? extras.getBoolean("kh_ise") : false));
        if (bundle == null || a().b.hT() == bpwc.a) {
            bp bpVar = new bp(getSupportFragmentManager());
            bpVar.z(android.R.id.content, new bpxt(), "fragment");
            bpVar.d();
        }
    }
}
