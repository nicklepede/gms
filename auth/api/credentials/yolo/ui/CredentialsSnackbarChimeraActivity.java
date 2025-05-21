package com.google.android.gms.auth.api.credentials.yolo.ui;

import android.os.Bundle;
import com.google.android.gms.R;
import defpackage.bp;
import defpackage.dg;
import defpackage.qet;
import defpackage.yxo;
import defpackage.yxr;
import defpackage.yxt;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class CredentialsSnackbarChimeraActivity extends qet {
    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        char c;
        dg yxoVar;
        super.onCreate(bundle);
        hC().q(1);
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
            yxoVar = new yxo();
        } else if (c == 1) {
            yxoVar = new yxr();
        } else if (c != 2) {
            return;
        } else {
            yxoVar = new yxt();
        }
        bp bpVar = new bp(getSupportFragmentManager());
        bpVar.t(android.R.id.content, yxoVar);
        bpVar.a();
    }
}
