package com.google.android.gms.nearby.sharing.receive;

import android.content.Intent;
import android.os.Bundle;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.gms.nearby.sharing.QrCodeMetadata;
import com.google.android.gms.nearby.sharing.receive.SamsungQrCodeChimeraActivity;
import defpackage.conm;
import defpackage.coxv;
import defpackage.cshx;
import defpackage.csow;
import defpackage.cspa;
import defpackage.cspb;
import defpackage.cspc;
import defpackage.cspr;
import defpackage.csqb;
import defpackage.csqh;
import defpackage.fvp;
import defpackage.fxqu;
import defpackage.fxwd;
import defpackage.fxxg;
import defpackage.fxxm;
import defpackage.fxya;
import defpackage.fycr;
import defpackage.fyfr;
import defpackage.jvd;
import defpackage.jxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class SamsungQrCodeChimeraActivity extends cshx {
    public cspr f;
    private final fxqu g;
    private fyfr h;

    public SamsungQrCodeChimeraActivity() {
        fxwd fxwdVar = new fxwd() { // from class: csou
            @Override // defpackage.fxwd
            public final Object a() {
                cspr csprVar = SamsungQrCodeChimeraActivity.this.f;
                if (csprVar != null) {
                    return csprVar;
                }
                fxxm.j("factory");
                return null;
            }
        };
        int i = fxya.a;
        this.g = new jxm(new fxxg(csqh.class), new cspb(this), fxwdVar, new cspc(this));
    }

    private final void c() {
        QrCodeMetadata a = coxv.a(getIntent().getData(), false);
        if (a == null) {
            conm.a.e().h("Invalid QR code in intent %s", getIntent().getData());
            finish();
        } else {
            fyfr fyfrVar = this.h;
            if (fyfrVar != null) {
                fyfrVar.s(null);
            }
            this.h = fycr.b(jvd.a(this), null, null, new csow(this, a, null), 3);
        }
    }

    public final csqh b() {
        return (csqh) this.g.a();
    }

    @Override // defpackage.cshx, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        conm.a.d().h("SamsungQrCodeChimeraActivity onCreate: %s", getIntent().getData());
        c();
        ComposeView composeView = new ComposeView(this, null, 0, 6, null);
        composeView.a(new fvp(1128799075, true, new cspa(this)));
        setContentView(composeView);
    }

    @Override // defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onNewIntent(Intent intent) {
        fxxm.f(intent, "intent");
        super.onNewIntent(intent);
        conm.a.d().h("SamsungQrCodeChimeraActivity onNewIntent: %s", intent.getData());
        setIntent(intent);
        c();
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        conm.a.d().h("SamsungQrCodeChimeraActivity onWindowFocusChanged: %s", Boolean.valueOf(z));
        if (z && ((csqb) b().e.b()).a()) {
            finish();
        }
    }
}
