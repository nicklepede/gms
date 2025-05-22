package com.google.android.gms.auth.api.credentials.yolo.ui;

import android.os.Bundle;
import com.google.android.gms.R;
import defpackage.aaxe;
import defpackage.aaxh;
import defpackage.aaxj;
import defpackage.bp;
import defpackage.dg;
import defpackage.rxx;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class CredentialsSnackbarChimeraActivity extends rxx {
    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        char c;
        dg aaxeVar;
        super.onCreate(bundle);
        hS().q(1);
        setTheme(R.style.ThemeTranslucentDayNight);
        String action = getIntent().getAction();
        int hashCode = action.hashCode();
        if (hashCode == -1073830085) {
            if (action.equals("com.google.android.gms.auth.api.credentials.AUTO_SAVE_SNACKBAR")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 1124021545) {
            if (hashCode == 1263009336 && action.equals("com.google.android.gms.auth.api.credentials.AUTO_SIGN_IN_WARM_WELCOME_SNACKBAR")) {
                c = 2;
            }
            c = 65535;
        } else {
            if (action.equals("com.google.android.gms.auth.api.credentials.AUTO_SIGN_IN_SNACKBAR")) {
                c = 1;
            }
            c = 65535;
        }
        if (c == 0) {
            aaxeVar = new aaxe();
        } else if (c == 1) {
            aaxeVar = new aaxh();
        } else if (c != 2) {
            return;
        } else {
            aaxeVar = new aaxj();
        }
        bp bpVar = new bp(getSupportFragmentManager());
        bpVar.t(android.R.id.content, aaxeVar);
        bpVar.a();
    }
}
