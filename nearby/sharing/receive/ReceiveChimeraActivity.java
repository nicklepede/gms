package com.google.android.gms.nearby.sharing.receive;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.gms.nearby.sharing.receive.ReceiveChimeraActivity;
import defpackage.aby;
import defpackage.aca;
import defpackage.acq;
import defpackage.chkv;
import defpackage.colj;
import defpackage.comx;
import defpackage.conm;
import defpackage.coqc;
import defpackage.cqqt;
import defpackage.cqqu;
import defpackage.cshv;
import defpackage.csif;
import defpackage.csjd;
import defpackage.csje;
import defpackage.csjf;
import defpackage.csnp;
import defpackage.csot;
import defpackage.ctsl;
import defpackage.ctss;
import defpackage.ftgf;
import defpackage.fvp;
import defpackage.fxqu;
import defpackage.fxwd;
import defpackage.fxxg;
import defpackage.fxxm;
import defpackage.fxya;
import defpackage.fycr;
import defpackage.iwv;
import defpackage.jvd;
import defpackage.jxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class ReceiveChimeraActivity extends cshv {
    public coqc f;
    public colj g;
    public csnp h;
    public final aca i;
    private final fxqu j;

    public ReceiveChimeraActivity() {
        fxwd fxwdVar = new fxwd() { // from class: csia
            @Override // defpackage.fxwd
            public final Object a() {
                ReceiveChimeraActivity receiveChimeraActivity = ReceiveChimeraActivity.this;
                csnp csnpVar = receiveChimeraActivity.h;
                if (csnpVar == null) {
                    fxxm.j("factory");
                    csnpVar = null;
                }
                csnpVar.a = receiveChimeraActivity;
                return csnpVar;
            }
        };
        int i = fxya.a;
        this.j = new jxm(new fxxg(csot.class), new csje(this), fxwdVar, new csjf(this));
        this.i = registerForActivityResult(new acq(), new aby() { // from class: csib
            @Override // defpackage.aby
            public final void jF(Object obj) {
                ActivityResult activityResult = (ActivityResult) obj;
                fxxm.f(activityResult, "result");
                if (activityResult.a == -1) {
                    ReceiveChimeraActivity.this.finish();
                }
            }
        });
    }

    public final colj b() {
        colj coljVar = this.g;
        if (coljVar != null) {
            return coljVar;
        }
        fxxm.j("analyticsLogger");
        return null;
    }

    public final csot c() {
        return (csot) this.j.a();
    }

    @Override // defpackage.cshv, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        Intent intent = getIntent();
        fxxm.e(intent, "getIntent(...)");
        Intent a = cqqu.a(this, intent, cqqt.d);
        if (a != null) {
            startActivity(a);
            finish();
            return;
        }
        comx.b(this);
        fycr.b(jvd.a(this), null, null, new csif(this, null), 3);
        boolean z = ftgf.a.lK().bc() || ((extras = getIntent().getExtras()) != null && extras.getBoolean("enable_send_button_on_receive_ui", false));
        ctsl ctslVar = new ctsl(new ctss(this, chkv.f()));
        iwv.a(getWindow(), false);
        colj f = colj.f(this);
        fxxm.f(f, "<set-?>");
        this.g = f;
        ComposeView composeView = new ComposeView(this, null, 0, 6, null);
        composeView.a(new fvp(-198976679, true, new csjd(this, composeView, ctslVar, z)));
        setContentView(composeView);
    }

    @Override // defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onNewIntent(Intent intent) {
        fxxm.f(intent, "intent");
        if (ftgf.F()) {
            conm.a.b().h("ReceiveChimeraActivity onNewIntent setting intent to: %s", intent.getData());
            c().c = true;
            setIntent(intent);
        }
        super.onNewIntent(intent);
    }
}
