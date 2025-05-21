package com.google.android.gms.carsetup;

import android.app.KeyguardManager;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.R;
import com.google.android.gms.carsetup.frx.SetupFsm$EntryState;
import com.google.android.gms.carsetup.fsm.impl.ActivityResult;
import defpackage.albn;
import defpackage.alsb;
import defpackage.alsh;
import defpackage.altc;
import defpackage.alte;
import defpackage.alth;
import defpackage.altl;
import defpackage.altt;
import defpackage.altw;
import defpackage.alty;
import defpackage.aluf;
import defpackage.aluj;
import defpackage.aluk;
import defpackage.alvc;
import defpackage.alve;
import defpackage.bp;
import defpackage.bul;
import defpackage.dg;
import defpackage.ejgq;
import defpackage.ejhh;
import defpackage.elxv;
import defpackage.elxw;
import defpackage.elxx;
import defpackage.fecj;
import defpackage.flsv;
import defpackage.flvu;
import defpackage.qet;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class SetupActivityImpl extends qet implements alve {
    private static final ejhh k = albn.a("CAR.SETUP");
    private static final bul l;
    public boolean j;
    private alvc m;
    private dg n;
    private volatile dg o;
    private ActivityResult p;
    private boolean q;

    static {
        bul bulVar = new bul();
        l = bulVar;
        bulVar.put(aluf.class, elxw.FRX_INSTALL_APPS);
        bulVar.put(altc.class, elxw.FRX_AUTHORIZE_CAR);
        bulVar.put(alte.class, elxw.FRX_CAR_MOVING);
        bulVar.put(altl.class, elxw.FRX_ERROR_FRAGMENT);
        bulVar.put(alth.class, elxw.FRX_DOWNLOAD_RETRY);
        bulVar.put(aluj.class, elxw.FRX_INTRO_FRAGMENT);
        bulVar.put(altw.class, elxw.FRX_INCOMPATIBLE);
        bulVar.put(alty.class, elxw.FRX_INCOMPATIBLE_NO_VANAGON);
        bulVar.put(altt.class, elxw.FRX_INCOMPATIBLE_ALERT);
        bulVar.put(aluk.class, elxw.FRX_LOCK_SCREEN);
    }

    @Override // defpackage.alve
    public final dg a() {
        return this.n;
    }

    @Override // defpackage.alve
    public final alvc k() {
        return this.m;
    }

    @Override // defpackage.alve
    public final Class l() {
        return SetupFsm$EntryState.class;
    }

    @Override // defpackage.alve
    public final List m() {
        return Collections.singletonList(new alsb(this));
    }

    @Override // defpackage.alve
    public final void n(alvc alvcVar) {
        this.m = alvcVar;
    }

    @Override // defpackage.alve
    public final void o() {
        getWindow().clearFlags(2621568);
    }

    @Override // defpackage.qfw, defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1) {
            if (this.p != null) {
                ejgq ah = k.h().ah(2752);
                ActivityResult activityResult = this.p;
                ah.G("Got an activity result when mPendingFsmActivityResult is not null. losing result with resultCode=%d data=%s", activityResult.a, activityResult.b);
            }
            if (this.q) {
                this.p = new ActivityResult(i2, intent);
            } else {
                this.m.e("EVENT_ACTIVITY_RESULT", new ActivityResult(i2, intent));
            }
        }
    }

    @Override // defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onBackPressed() {
        this.m.d("EVENT_BACKBUTTON_PRESSED");
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTheme(R.style.CarFrxTheme_Cakewalk_Phone);
        if (flvu.a.a().b() && flvu.a.a().a().b.contains(Build.MANUFACTURER.toLowerCase(Locale.ROOT))) {
            getTheme().applyStyle(R.style.ThemeOverlay_CarFrx_DeviceFontFamily, true);
        }
        getWindow().addFlags(2621568);
        setRequestedOrientation(1);
        setContentView(R.layout.car_frx_activity);
        flsv.a.a().a();
        this.n = getSupportFragmentManager().h("fragment_main");
        if (bundle == null) {
            bp bpVar = new bp(getSupportFragmentManager());
            bpVar.v(new alsh(), "fragment_fsm_controller");
            bpVar.a();
        }
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onPause() {
        this.q = true;
        super.onPause();
    }

    @Override // defpackage.qfw
    protected final void onResumeFragments() {
        super.onResumeFragments();
        this.q = false;
        if (this.o != null) {
            this.n = this.o;
            this.o = null;
            bp bpVar = new bp(getSupportFragmentManager());
            bpVar.z(R.id.fragment_container, this.n, "fragment_main");
            bpVar.a();
        }
        ActivityResult activityResult = this.p;
        if (activityResult != null) {
            this.m.e("EVENT_ACTIVITY_RESULT", activityResult);
            this.p = null;
        }
    }

    public final void p(elxw elxwVar, elxv elxvVar) {
        alvc alvcVar = this.m;
        fecj v = elxx.a.v();
        if (!v.b.L()) {
            v.U();
        }
        int i = elxwVar.gA;
        elxx elxxVar = (elxx) v.b;
        elxxVar.b |= 1;
        elxxVar.d = i;
        int a = elxvVar.a();
        if (!v.b.L()) {
            v.U();
        }
        elxx elxxVar2 = (elxx) v.b;
        elxxVar2.b |= 2;
        elxxVar2.e = a;
        alvcVar.f((elxx) v.Q());
    }

    @Override // defpackage.alve
    public final void q(Class cls, elxv elxvVar) {
        elxw elxwVar = (elxw) l.get(cls);
        if (elxwVar != null) {
            p(elxwVar, elxvVar);
        } else {
            k.j().ah(2749).B("Attempting to log unknown FRX screen for class: %s", cls.getName());
        }
    }

    @Override // defpackage.alve
    public final void r(Class cls) {
        elxw elxwVar = (elxw) l.get(cls);
        if (elxwVar != null) {
            p(elxwVar, elxv.f);
        } else {
            k.j().ah(2750).B("Attempting to log unknown FRX screen for class: %s", cls.getName());
        }
    }

    @Override // defpackage.alve
    public final void s(Intent intent) {
        startActivityForResult(intent, 1);
    }

    @Override // defpackage.alve
    public final void t(Class cls, Bundle bundle, boolean z) {
        dg dgVar;
        if (z || (dgVar = this.n) == null || !cls.equals(dgVar.getClass())) {
            if (!cls.equals(aluj.class) && !cls.equals(aluk.class)) {
                o();
            }
            try {
                dg dgVar2 = (dg) cls.getConstructor(null).newInstance(null);
                dgVar2.setArguments(bundle);
                if (this.q && !(dgVar2 instanceof aluj)) {
                    this.o = dgVar2;
                    return;
                }
                dg dgVar3 = this.n;
                boolean z2 = (dgVar3 == null || cls.equals(dgVar3.getClass())) ? false : true;
                boolean z3 = !((KeyguardManager) getSystemService("keyguard")).inKeyguardRestrictedInputMode();
                this.n = dgVar2;
                bp bpVar = new bp(getSupportFragmentManager());
                if (z2 & z3) {
                    if (this.j) {
                        bpVar.G(R.anim.car_frx_slide_in_left, R.anim.car_frx_slide_out_right);
                    } else {
                        bpVar.G(R.anim.car_frx_slide_in_right, R.anim.car_frx_slide_out_left);
                    }
                }
                bpVar.z(R.id.fragment_container, this.n, "fragment_main");
                bpVar.b();
                this.j = false;
            } catch (ReflectiveOperationException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
