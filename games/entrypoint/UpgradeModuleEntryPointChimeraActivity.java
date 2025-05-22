package com.google.android.gms.games.entrypoint;

import android.content.Intent;
import android.os.Bundle;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bjqi;
import defpackage.bjwu;
import defpackage.bp;
import defpackage.dg;
import defpackage.ew;
import defpackage.flmn;
import defpackage.flmr;
import defpackage.rxx;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class UpgradeModuleEntryPointChimeraActivity extends rxx implements flmr {
    private static final ausn j = ausn.b("UpgradeModuleActivity", auid.GAMES);
    private bjqi k;

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
        int i = bjwu.ag;
        Bundle bundle = new Bundle();
        bundle.putString("game_package_name", stringExtra);
        bundle.putString("game_id", stringExtra2);
        bjwu bjwuVar = new bjwu();
        bjwuVar.setCancelable(false);
        bjwuVar.setArguments(bundle);
        ew supportFragmentManager = getSupportFragmentManager();
        bp bpVar = new bp(supportFragmentManager);
        dg h = supportFragmentManager.h("play_games_upgrade");
        if (h != null) {
            bpVar.m(h);
        }
        bpVar.v(bjwuVar, "play_games_upgrade");
        bpVar.b();
    }

    @Override // defpackage.flmr
    public final flmn a() {
        return this.k.c();
    }

    @Override // defpackage.rza, defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        bjqi bjqiVar = this.k;
        if (bjqiVar != null) {
            bjqiVar.b().a(i, intent);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a9, code lost:
    
        if (r7 >= r1) goto L36;
     */
    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
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

    @Override // defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onSaveInstanceState(Bundle bundle) {
        bjqi bjqiVar = this.k;
        if (bjqiVar != null) {
            bjqiVar.a().c(bundle);
        }
        super.onSaveInstanceState(bundle);
    }
}
