package com.google.android.gms.carsetup.frx;

import android.app.KeyguardManager;
import android.media.AudioAttributes;
import android.os.Handler;
import android.os.Vibrator;
import com.google.android.gms.carsetup.frx.SetupFsm$AutoIntroState;
import defpackage.akya;
import defpackage.aluj;
import defpackage.aluk;
import defpackage.aluo;
import defpackage.alup;
import defpackage.alus;
import defpackage.aluv;
import defpackage.alvg;
import defpackage.alvh;
import defpackage.alvi;
import defpackage.alzv;
import defpackage.alzw;
import defpackage.alzy;
import defpackage.byhr;
import defpackage.ejhh;
import defpackage.elxw;
import defpackage.flsb;
import defpackage.flvl;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@alvi(a = {@alvh(a = SetupFsm$AutoIntroState.class, c = SetupFsm$ErrorState.class, d = "EVENT_ERROR"), @alvh(a = SetupFsm$AutoIntroState.class, c = SetupFsm$SetupFailedState.class, d = "EVENT_CAR_DISCONNECTED"), @alvh(a = SetupFsm$AutoIntroState.class, c = SetupFsm$AuthorizingCarConnectionState.class, d = "EVENT_OK_STATE_SKIPPED"), @alvh(a = SetupFsm$AutoIntroState.class, c = SetupFsm$SetupFailedState.class, d = "EVENT_INTRO_DECLINED"), @alvh(a = SetupFsm$AutoIntroState.class, c = SetupFsm$AuthorizingCarConnectionState.class, d = "EVENT_INTRO_ACKNOWLEDGED"), @alvh(a = SetupFsm$AutoIntroState.class, c = SetupFsm$SetupFailedState.class, d = "EVENT_INTRO_LOCK_TIMEOUT")})
/* loaded from: classes3.dex */
public class SetupFsm$AutoIntroState extends alvg {
    private akya a;
    private final alzv d = new aluo(this);
    private Handler e;

    private final boolean e() {
        return ((KeyguardManager) this.b.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
    }

    @Override // defpackage.alvg
    public final int a() {
        return 39;
    }

    @Override // defpackage.alvg
    public final boolean b(String str, Object obj) {
        aluv aluvVar = (aluv) this.c.k;
        if ("EVENT_ACTIVITY_RESULT".equals(str)) {
            this.c.d("EVENT_CAR_DISCONNECTED");
            return true;
        }
        if ("EVENT_CAR_DISCONNECTED".equals(str)) {
            ejhh ejhhVar = alus.a;
            aluvVar.M();
        }
        if (!"EVENT_INTRO_ACKNOWLEDGED".equals(str) && !"EVENT_INTRO_DECLINED".equals(str) && !"EVENT_INTRO_LOCK_TIMEOUT".equals(str) && !"EVENT_OK_STATE_SKIPPED".equals(str) && !"EVENT_ERROR".equals(str) && !"EVENT_CAR_DISCONNECTED".equals(str) && !"EVENT_INTRO_CANCEL_TIMER".equals(str)) {
            return true;
        }
        if (this.e != null) {
            alus.a.h().ah(2816).x("AutoIntroState / auto-dismiss timer cancelled");
            this.e.removeCallbacksAndMessages(null);
            this.e = null;
        }
        if ("EVENT_INTRO_CANCEL_TIMER".equals(str)) {
            alus.a.h().ah(2815).x("AutoIntroState / auto-dismiss timer cancellation event handled");
            return true;
        }
        if (!flsb.e() || !"EVENT_INTRO_ACKNOWLEDGED".equals(str) || !e()) {
            return false;
        }
        alus.a.h().ah(2814).x("AutoIntroState / delaying acknowledgement until phone is unlocked");
        akya akyaVar = this.a;
        if (!akyaVar.a) {
            akyaVar.a = true;
            akyaVar.a();
        }
        aluvVar.E();
        return true;
    }

    @Override // defpackage.alvg
    public final void c(String str) {
        if (flsb.e()) {
            this.a = new akya(this.b, new Runnable() { // from class: alun
                @Override // java.lang.Runnable
                public final void run() {
                    alus.a.h().ah(2812).x("AutoIntroState / broadcasting delayed acknowledgement due to phone unlock");
                    SetupFsm$AutoIntroState.this.c.d("EVENT_INTRO_ACKNOWLEDGED");
                }
            });
        }
        aluv aluvVar = (aluv) this.c.k;
        if (aluvVar.Q()) {
            this.c.d("EVENT_OK_STATE_SKIPPED");
            return;
        }
        boolean e = e();
        alzy B = aluvVar.B();
        boolean z = true;
        if (aluvVar.S() && B.c()) {
            z = false;
        }
        if (!e && !z) {
            this.c.d("EVENT_OK_STATE_SKIPPED");
            return;
        }
        if (e) {
            ejhh ejhhVar = alus.a;
            byhr byhrVar = new byhr();
            this.e = byhrVar;
            byhrVar.postDelayed(new alup(this), 30000L);
            Vibrator vibrator = (Vibrator) this.b.getSystemService("vibrator");
            if (vibrator.hasVibrator()) {
                vibrator.vibrate(new long[]{0, 600, 100, 600}, -1, new AudioAttributes.Builder().setUsage(10).build());
            }
        }
        new alzw(this.b, this.d).a(e ? elxw.FRX_LOCK_SCREEN : elxw.FRX_INTRO_FRAGMENT);
        Class cls = (e && flvl.a.a().b()) ? aluk.class : aluj.class;
        ejhh ejhhVar2 = alus.a;
        this.c.j(cls);
    }

    @Override // defpackage.alvg
    public final void d() {
        if (flsb.e()) {
            this.a.b();
        }
    }
}
