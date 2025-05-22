package com.google.android.gms.kids.settings.flows.addkiduser;

import android.os.Bundle;
import com.google.android.gms.R;
import com.google.android.gms.kids.settings.flows.addkiduser.CreateSupervisedUserChimeraActivity;
import defpackage.bp;
import defpackage.bsds;
import defpackage.bsdy;
import defpackage.bsfj;
import defpackage.efrl;
import defpackage.efwn;
import defpackage.efwo;
import defpackage.fxqu;
import defpackage.fxre;
import defpackage.fxwd;
import defpackage.rxx;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class CreateSupervisedUserChimeraActivity extends rxx {
    private final fxqu j = new fxre(new fxwd() { // from class: bsef
        @Override // defpackage.fxwd
        public final Object a() {
            return (bsdy) new jxw(CreateSupervisedUserChimeraActivity.this).a(bsdy.class);
        }
    });

    private final bsdy a() {
        return (bsdy) this.j.a();
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        int a;
        super.onCreate(bundle);
        setTheme(R.style.Theme_GoogleMaterial3_DayNight);
        setTheme(new efwo(R.style.SudThemeGlifV3_DayNight, true).a(getIntent()));
        int i = efwn.a;
        if (efrl.w(this) && (a = efwn.a(this)) != 0) {
            setTheme(a);
        }
        Bundle extras = getIntent().getExtras();
        a().f.ih(Boolean.valueOf(extras != null ? extras.getBoolean("kh_ise") : false));
        if (bundle == null || a().b.ii() == bsds.a) {
            bp bpVar = new bp(getSupportFragmentManager());
            bpVar.z(android.R.id.content, new bsfj(), "fragment");
            bpVar.d();
        }
    }
}
