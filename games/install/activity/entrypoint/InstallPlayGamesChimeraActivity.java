package com.google.android.gms.games.install.activity.entrypoint;

import android.content.Intent;
import android.os.Bundle;
import defpackage.bhlt;
import defpackage.bhlu;
import defpackage.bhnq;
import defpackage.bp;
import defpackage.fiwq;
import defpackage.fiwu;
import defpackage.qet;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class InstallPlayGamesChimeraActivity extends qet implements fiwu {
    private bhlt j;

    @Override // defpackage.fiwu
    public final fiwq a() {
        return this.j.c();
    }

    @Override // defpackage.qfw, defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.j.b().a(i, intent);
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        bhlt a = bhlu.a(this);
        this.j = a;
        a.a().b(bundle);
        super.onCreate(bundle);
        if (getSupportFragmentManager().h("installFlowFragment") != null) {
            return;
        }
        bhnq bhnqVar = new bhnq();
        bp bpVar = new bp(getSupportFragmentManager());
        bpVar.v(bhnqVar, "installFlowFragment");
        bpVar.a();
    }

    @Override // defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onSaveInstanceState(Bundle bundle) {
        this.j.a().c(bundle);
        super.onSaveInstanceState(bundle);
    }
}
