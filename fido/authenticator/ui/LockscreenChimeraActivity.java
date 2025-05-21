package com.google.android.gms.fido.authenticator.ui;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import com.google.android.gms.R;
import com.google.android.gms.fido.authenticator.ui.LockscreenChimeraActivity;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.apsr;
import defpackage.apta;
import defpackage.asot;
import defpackage.barq;
import defpackage.basc;
import defpackage.basd;
import defpackage.bbgc;
import defpackage.bcni;
import defpackage.bstr;
import defpackage.dnmt;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fnxn;
import defpackage.fnyx;
import defpackage.fnzb;
import defpackage.fwcn;
import defpackage.ild;
import defpackage.qex;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class LockscreenChimeraActivity extends qex {
    public static final asot h = bcni.a("LockscreenChimeraActivity");
    private static final long i = TimeUnit.MINUTES.toMillis(2);
    private CountDownTimer j;

    public final void j() {
        CountDownTimer countDownTimer = this.j;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        finish();
    }

    @Override // defpackage.qex, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        getContainerActivity().setShowWhenLocked(true);
        getContainerActivity().setTurnScreenOn(true);
        setTheme(R.style.FidoThemeLockScreen);
        super.onCreate(bundle);
        setContentView(R.layout.fido_lockscreen_activity);
        findViewById(R.id.cancel).setOnClickListener(new View.OnClickListener() { // from class: bbga
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LockscreenChimeraActivity.this.j();
            }
        });
        findViewById(R.id.continue_btn).setOnClickListener(new View.OnClickListener() { // from class: bbgb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LockscreenChimeraActivity lockscreenChimeraActivity = LockscreenChimeraActivity.this;
                ((KeyguardManager) lockscreenChimeraActivity.getSystemService("keyguard")).requestDismissKeyguard(lockscreenChimeraActivity.getContainerActivity(), new bbgd(lockscreenChimeraActivity));
            }
        });
        setFinishOnTouchOutside(false);
        int intExtra = getIntent().getIntExtra("session_id", 0);
        if (intExtra != 0) {
            Context applicationContext = getApplicationContext();
            List list = apta.n;
            apta a = new apsr(applicationContext, "FIDO").a();
            Context applicationContext2 = getApplicationContext();
            basc bascVar = basc.TYPE_CABLE_V2_USER_SHOWN_FULL_SCREEN_NOTIFICATION;
            if (fnxn.c()) {
                fecj v = barq.a.v();
                if (!v.b.L()) {
                    v.U();
                }
                fecp fecpVar = v.b;
                barq barqVar = (barq) fecpVar;
                barqVar.b |= 1;
                barqVar.c = intExtra;
                if (!fecpVar.L()) {
                    v.U();
                }
                barq barqVar2 = (barq) v.b;
                barqVar2.d = 300;
                barqVar2.b |= 2;
                fecj v2 = basd.a.v();
                if (!v2.b.L()) {
                    v2.U();
                }
                basd basdVar = (basd) v2.b;
                basdVar.c = bascVar.aH;
                basdVar.b = 1 | basdVar.b;
                basd basdVar2 = (basd) v2.Q();
                if (!v.b.L()) {
                    v.U();
                }
                barq barqVar3 = (barq) v.b;
                basdVar2.getClass();
                barqVar3.u = basdVar2;
                barqVar3.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
                if (fnyx.d()) {
                    bstr.v().f((barq) v.Q());
                } else {
                    a.j(v.Q(), dnmt.b(applicationContext2, new fwcn())).d();
                }
            }
        }
        this.j = new bbgc(this, i);
    }

    @Override // defpackage.qex, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onDestroy() {
        CountDownTimer countDownTimer = this.j;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        super.onDestroy();
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onResume() {
        KeyguardManager keyguardManager;
        new ild(this).b();
        super.onResume();
        if (fnzb.a.a().w() && ((keyguardManager = (KeyguardManager) getSystemService("keyguard")) == null || !keyguardManager.isKeyguardLocked())) {
            j();
        }
        this.j.start();
    }
}
