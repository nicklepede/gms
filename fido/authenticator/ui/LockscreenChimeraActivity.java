package com.google.android.gms.fido.authenticator.ui;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import com.google.android.gms.R;
import com.google.android.gms.fido.authenticator.ui.LockscreenChimeraActivity;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.arvi;
import defpackage.arvr;
import defpackage.ausn;
import defpackage.bcvm;
import defpackage.bcvy;
import defpackage.bcvz;
import defpackage.bdjz;
import defpackage.beov;
import defpackage.bvbp;
import defpackage.dpxc;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fqpp;
import defpackage.fqqz;
import defpackage.fqrd;
import defpackage.fyyo;
import defpackage.imt;
import defpackage.ryb;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class LockscreenChimeraActivity extends ryb {
    public static final ausn h = beov.a("LockscreenChimeraActivity");
    private static final long i = TimeUnit.MINUTES.toMillis(2);
    private CountDownTimer j;

    public final void j() {
        CountDownTimer countDownTimer = this.j;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        finish();
    }

    @Override // defpackage.ryb, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        getContainerActivity().setShowWhenLocked(true);
        getContainerActivity().setTurnScreenOn(true);
        setTheme(R.style.FidoThemeLockScreen);
        super.onCreate(bundle);
        setContentView(R.layout.fido_lockscreen_activity);
        findViewById(R.id.cancel).setOnClickListener(new View.OnClickListener() { // from class: bdjx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LockscreenChimeraActivity.this.j();
            }
        });
        findViewById(R.id.continue_btn).setOnClickListener(new View.OnClickListener() { // from class: bdjy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LockscreenChimeraActivity lockscreenChimeraActivity = LockscreenChimeraActivity.this;
                ((KeyguardManager) lockscreenChimeraActivity.getSystemService("keyguard")).requestDismissKeyguard(lockscreenChimeraActivity.getContainerActivity(), new bdka(lockscreenChimeraActivity));
            }
        });
        setFinishOnTouchOutside(false);
        int intExtra = getIntent().getIntExtra("session_id", 0);
        if (intExtra != 0) {
            Context applicationContext = getApplicationContext();
            List list = arvr.n;
            arvr a = new arvi(applicationContext, "FIDO").a();
            Context applicationContext2 = getApplicationContext();
            bcvy bcvyVar = bcvy.TYPE_CABLE_V2_USER_SHOWN_FULL_SCREEN_NOTIFICATION;
            if (fqpp.c()) {
                fgrc v = bcvm.a.v();
                if (!v.b.L()) {
                    v.U();
                }
                fgri fgriVar = v.b;
                bcvm bcvmVar = (bcvm) fgriVar;
                bcvmVar.b |= 1;
                bcvmVar.c = intExtra;
                if (!fgriVar.L()) {
                    v.U();
                }
                bcvm bcvmVar2 = (bcvm) v.b;
                bcvmVar2.d = 300;
                bcvmVar2.b |= 2;
                fgrc v2 = bcvz.a.v();
                if (!v2.b.L()) {
                    v2.U();
                }
                bcvz bcvzVar = (bcvz) v2.b;
                bcvzVar.c = bcvyVar.aH;
                bcvzVar.b = 1 | bcvzVar.b;
                bcvz bcvzVar2 = (bcvz) v2.Q();
                if (!v.b.L()) {
                    v.U();
                }
                bcvm bcvmVar3 = (bcvm) v.b;
                bcvzVar2.getClass();
                bcvmVar3.u = bcvzVar2;
                bcvmVar3.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
                if (fqqz.d()) {
                    bvbp.v().f((bcvm) v.Q());
                } else {
                    a.j(v.Q(), dpxc.b(applicationContext2, new fyyo())).d();
                }
            }
        }
        this.j = new bdjz(this, i);
    }

    @Override // defpackage.ryb, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onDestroy() {
        CountDownTimer countDownTimer = this.j;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        super.onDestroy();
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onResume() {
        KeyguardManager keyguardManager;
        new imt(this).b();
        super.onResume();
        if (fqrd.a.lK().w() && ((keyguardManager = (KeyguardManager) getSystemService("keyguard")) == null || !keyguardManager.isKeyguardLocked())) {
            j();
        }
        this.j.start();
    }
}
