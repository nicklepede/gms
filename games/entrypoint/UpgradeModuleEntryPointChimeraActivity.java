package com.google.android.gms.games.entrypoint;

import android.content.Intent;
import android.os.Bundle;
import defpackage.asej;
import defpackage.asot;
import defpackage.bhlt;
import defpackage.bhsf;
import defpackage.bp;
import defpackage.dg;
import defpackage.ew;
import defpackage.fiwq;
import defpackage.fiwu;
import defpackage.qet;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class UpgradeModuleEntryPointChimeraActivity extends qet implements fiwu {
    private static final asot j = asot.b("UpgradeModuleActivity", asej.GAMES);
    private bhlt k;

    private final void k() {
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("com.google.android.gms.games.GAME_PACKAGE_NAME");
        if (stringExtra == null) {
            stringExtra = getPackageName();
        }
        String stringExtra2 = intent.getStringExtra("com.google.android.gms.games.GAME_ID");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        int i = bhsf.ag;
        Bundle bundle = new Bundle();
        bundle.putString("game_package_name", stringExtra);
        bundle.putString("game_id", stringExtra2);
        bhsf bhsfVar = new bhsf();
        bhsfVar.setCancelable(false);
        bhsfVar.setArguments(bundle);
        ew supportFragmentManager = getSupportFragmentManager();
        bp bpVar = new bp(supportFragmentManager);
        dg h = supportFragmentManager.h("play_games_upgrade");
        if (h != null) {
            bpVar.n(h);
        }
        bpVar.v(bhsfVar, "play_games_upgrade");
        bpVar.b();
    }

    @Override // defpackage.fiwu
    public final fiwq a() {
        return this.k.c();
    }

    @Override // defpackage.qfw, defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        bhlt bhltVar = this.k;
        if (bhltVar != null) {
            bhltVar.b().a(i, intent);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a9, code lost:
    
        if (r7 >= r1) goto L36;
     */
    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onCreate(android.os.Bundle r11) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.games.entrypoint.UpgradeModuleEntryPointChimeraActivity.onCreate(android.os.Bundle):void");
    }

    @Override // defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onSaveInstanceState(Bundle bundle) {
        bhlt bhltVar = this.k;
        if (bhltVar != null) {
            bhltVar.a().c(bundle);
        }
        super.onSaveInstanceState(bundle);
    }
}
