package com.google.android.gms.carsetup.frx;

import android.app.KeyguardManager;
import android.media.AudioAttributes;
import android.os.Handler;
import android.os.Vibrator;
import com.google.android.gms.carsetup.frx.SetupFsm$AutoIntroState;
import defpackage.amzl;
import defpackage.anvu;
import defpackage.anvv;
import defpackage.anvz;
import defpackage.anwa;
import defpackage.anwd;
import defpackage.anwg;
import defpackage.anwr;
import defpackage.anws;
import defpackage.anwt;
import defpackage.aobg;
import defpackage.aobh;
import defpackage.aobj;
import defpackage.caqj;
import defpackage.eluq;
import defpackage.eolk;
import defpackage.fojn;
import defpackage.fomu;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@anwt(a = {@anws(a = SetupFsm$AutoIntroState.class, c = SetupFsm$ErrorState.class, d = "EVENT_ERROR"), @anws(a = SetupFsm$AutoIntroState.class, c = SetupFsm$SetupFailedState.class, d = "EVENT_CAR_DISCONNECTED"), @anws(a = SetupFsm$AutoIntroState.class, c = SetupFsm$AuthorizingCarConnectionState.class, d = "EVENT_OK_STATE_SKIPPED"), @anws(a = SetupFsm$AutoIntroState.class, c = SetupFsm$SetupFailedState.class, d = "EVENT_INTRO_DECLINED"), @anws(a = SetupFsm$AutoIntroState.class, c = SetupFsm$AuthorizingCarConnectionState.class, d = "EVENT_INTRO_ACKNOWLEDGED"), @anws(a = SetupFsm$AutoIntroState.class, c = SetupFsm$SetupFailedState.class, d = "EVENT_INTRO_LOCK_TIMEOUT")})
/* loaded from: classes3.dex */
public class SetupFsm$AutoIntroState extends anwr {
    private amzl a;
    private final aobg d = new anvz(this);
    private Handler e;

    private final boolean e() {
        return ((KeyguardManager) this.b.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
    }

    @Override // defpackage.anwr
    public final int a() {
        return 39;
    }

    @Override // defpackage.anwr
    public final boolean b(String str, Object obj) {
        anwg anwgVar = (anwg) this.c.k;
        if ("EVENT_ACTIVITY_RESULT".equals(str)) {
            this.c.d("EVENT_CAR_DISCONNECTED");
            return true;
        }
        if ("EVENT_CAR_DISCONNECTED".equals(str)) {
            eluq eluqVar = anwd.a;
            anwgVar.M();
        }
        if (!"EVENT_INTRO_ACKNOWLEDGED".equals(str) && !"EVENT_INTRO_DECLINED".equals(str) && !"EVENT_INTRO_LOCK_TIMEOUT".equals(str) && !"EVENT_OK_STATE_SKIPPED".equals(str) && !"EVENT_ERROR".equals(str) && !"EVENT_CAR_DISCONNECTED".equals(str) && !"EVENT_INTRO_CANCEL_TIMER".equals(str)) {
            return true;
        }
        if (this.e != null) {
            anwd.a.h().ai(2820).x("AutoIntroState / auto-dismiss timer cancelled");
            this.e.removeCallbacksAndMessages(null);
            this.e = null;
        }
        if ("EVENT_INTRO_CANCEL_TIMER".equals(str)) {
            anwd.a.h().ai(2819).x("AutoIntroState / auto-dismiss timer cancellation event handled");
            return true;
        }
        if (!fojn.d() || !"EVENT_INTRO_ACKNOWLEDGED".equals(str) || !e()) {
            return false;
        }
        anwd.a.h().ai(2818).x("AutoIntroState / delaying acknowledgement until phone is unlocked");
        amzl amzlVar = this.a;
        if (!amzlVar.a) {
            amzlVar.a = true;
            amzlVar.a();
        }
        anwgVar.E();
        return true;
    }

    @Override // defpackage.anwr
    public final void c(String str) {
        if (fojn.d()) {
            this.a = new amzl(this.b, new Runnable() { // from class: anvy
                @Override // java.lang.Runnable
                public final void run() {
                    anwd.a.h().ai(2816).x("AutoIntroState / broadcasting delayed acknowledgement due to phone unlock");
                    SetupFsm$AutoIntroState.this.c.d("EVENT_INTRO_ACKNOWLEDGED");
                }
            });
        }
        anwg anwgVar = (anwg) this.c.k;
        if (anwgVar.Q()) {
            this.c.d("EVENT_OK_STATE_SKIPPED");
            return;
        }
        boolean e = e();
        aobj B = anwgVar.B();
        boolean z = true;
        if (anwgVar.S() && B.c()) {
            z = false;
        }
        if (!e && !z) {
            this.c.d("EVENT_OK_STATE_SKIPPED");
            return;
        }
        if (e) {
            eluq eluqVar = anwd.a;
            caqj caqjVar = new caqj();
            this.e = caqjVar;
            caqjVar.postDelayed(new anwa(this), 30000L);
            Vibrator vibrator = (Vibrator) this.b.getSystemService("vibrator");
            if (vibrator.hasVibrator()) {
                vibrator.vibrate(new long[]{0, 600, 100, 600}, -1, new AudioAttributes.Builder().setUsage(10).build());
            }
        }
        new aobh(this.b, this.d).a(e ? eolk.FRX_LOCK_SCREEN : eolk.FRX_INTRO_FRAGMENT);
        Class cls = (e && fomu.a.lK().b()) ? anvv.class : anvu.class;
        eluq eluqVar2 = anwd.a;
        this.c.j(cls);
    }

    @Override // defpackage.anwr
    public final void d() {
        if (fojn.d()) {
            this.a.b();
        }
    }
}
