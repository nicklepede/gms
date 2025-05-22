package com.google.android.gms.games.install.activity.entrypoint;

import android.content.Intent;
import android.os.Bundle;
import defpackage.bjqi;
import defpackage.bjqj;
import defpackage.bjsf;
import defpackage.bp;
import defpackage.flmn;
import defpackage.flmr;
import defpackage.rxx;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class InstallPlayGamesChimeraActivity extends rxx implements flmr {
    private bjqi j;

    @Override // defpackage.flmr
    public final flmn a() {
        return this.j.c();
    }

    @Override // defpackage.rza, defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.j.b().a(i, intent);
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        bjqi a = bjqj.a(this);
        this.j = a;
        a.a().b(bundle);
        super.onCreate(bundle);
        if (getSupportFragmentManager().h("installFlowFragment") != null) {
            return;
        }
        bjsf bjsfVar = new bjsf();
        bp bpVar = new bp(getSupportFragmentManager());
        bpVar.v(bjsfVar, "installFlowFragment");
        bpVar.a();
    }

    @Override // defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onSaveInstanceState(Bundle bundle) {
        this.j.a().c(bundle);
        super.onSaveInstanceState(bundle);
    }
}
