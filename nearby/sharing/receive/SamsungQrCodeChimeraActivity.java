package com.google.android.gms.nearby.sharing.receive;

import android.content.Intent;
import android.os.Bundle;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.gms.nearby.sharing.QrCodeMetadata;
import com.google.android.gms.nearby.sharing.receive.SamsungQrCodeChimeraActivity;
import defpackage.cmfe;
import defpackage.cmpn;
import defpackage.cpza;
import defpackage.cqfs;
import defpackage.cqfw;
import defpackage.cqfx;
import defpackage.cqfy;
import defpackage.cqgn;
import defpackage.cqgx;
import defpackage.cqhd;
import defpackage.fuuw;
import defpackage.fuy;
import defpackage.fvaf;
import defpackage.fvbi;
import defpackage.fvbo;
import defpackage.fvcc;
import defpackage.fvgt;
import defpackage.fvjt;
import defpackage.joo;
import defpackage.jqx;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class SamsungQrCodeChimeraActivity extends cpza {
    public cqgn f;
    private final fuuw g;
    private fvjt h;

    public SamsungQrCodeChimeraActivity() {
        fvaf fvafVar = new fvaf() { // from class: cqfq
            @Override // defpackage.fvaf
            public final Object a() {
                cqgn cqgnVar = SamsungQrCodeChimeraActivity.this.f;
                if (cqgnVar != null) {
                    return cqgnVar;
                }
                fvbo.j("factory");
                return null;
            }
        };
        int i = fvcc.a;
        this.g = new jqx(new fvbi(cqhd.class), new cqfx(this), fvafVar, new cqfy(this));
    }

    private final void c() {
        QrCodeMetadata a = cmpn.a(getIntent().getData(), false);
        if (a == null) {
            cmfe.a.e().h("Invalid QR code in intent %s", getIntent().getData());
            finish();
        } else {
            fvjt fvjtVar = this.h;
            if (fvjtVar != null) {
                fvjtVar.s(null);
            }
            this.h = fvgt.b(joo.a(this), null, null, new cqfs(this, a, null), 3);
        }
    }

    public final cqhd b() {
        return (cqhd) this.g.a();
    }

    @Override // defpackage.cpza, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        cmfe.a.d().h("SamsungQrCodeChimeraActivity onCreate: %s", getIntent().getData());
        c();
        ComposeView composeView = new ComposeView(this, null, 0, 6, null);
        composeView.a(new fuy(1128799075, true, new cqfw(this)));
        setContentView(composeView);
    }

    @Override // defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onNewIntent(Intent intent) {
        fvbo.f(intent, "intent");
        super.onNewIntent(intent);
        cmfe.a.d().h("SamsungQrCodeChimeraActivity onNewIntent: %s", intent.getData());
        setIntent(intent);
        c();
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        cmfe.a.d().h("SamsungQrCodeChimeraActivity onWindowFocusChanged: %s", Boolean.valueOf(z));
        if (z && ((cqgx) b().e.b()).a()) {
            finish();
        }
    }
}
