package com.google.android.gms.carsetup;

import android.app.KeyguardManager;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.R;
import com.google.android.gms.carsetup.frx.SetupFsm$EntryState;
import com.google.android.gms.carsetup.fsm.impl.ActivityResult;
import defpackage.ancy;
import defpackage.antm;
import defpackage.ants;
import defpackage.anun;
import defpackage.anup;
import defpackage.anus;
import defpackage.anuw;
import defpackage.anve;
import defpackage.anvh;
import defpackage.anvj;
import defpackage.anvq;
import defpackage.anvu;
import defpackage.anvv;
import defpackage.anwn;
import defpackage.anwp;
import defpackage.bp;
import defpackage.buy;
import defpackage.dg;
import defpackage.eltz;
import defpackage.eluq;
import defpackage.eolj;
import defpackage.eolk;
import defpackage.eoll;
import defpackage.fgrc;
import defpackage.fond;
import defpackage.rxx;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class SetupActivityImpl extends rxx implements anwp {
    private static final eluq k = ancy.a("CAR.SETUP");
    private static final buy l;
    public boolean j;
    private anwn m;
    private dg n;
    private volatile dg o;
    private ActivityResult p;
    private boolean q;

    static {
        buy buyVar = new buy();
        l = buyVar;
        buyVar.put(anvq.class, eolk.FRX_INSTALL_APPS);
        buyVar.put(anun.class, eolk.FRX_AUTHORIZE_CAR);
        buyVar.put(anup.class, eolk.FRX_CAR_MOVING);
        buyVar.put(anuw.class, eolk.FRX_ERROR_FRAGMENT);
        buyVar.put(anus.class, eolk.FRX_DOWNLOAD_RETRY);
        buyVar.put(anvu.class, eolk.FRX_INTRO_FRAGMENT);
        buyVar.put(anvh.class, eolk.FRX_INCOMPATIBLE);
        buyVar.put(anvj.class, eolk.FRX_INCOMPATIBLE_NO_VANAGON);
        buyVar.put(anve.class, eolk.FRX_INCOMPATIBLE_ALERT);
        buyVar.put(anvv.class, eolk.FRX_LOCK_SCREEN);
    }

    @Override // defpackage.anwp
    public final dg a() {
        return this.n;
    }

    @Override // defpackage.anwp
    public final anwn k() {
        return this.m;
    }

    @Override // defpackage.anwp
    public final Class l() {
        return SetupFsm$EntryState.class;
    }

    @Override // defpackage.anwp
    public final List m() {
        return Collections.singletonList(new antm(this));
    }

    @Override // defpackage.anwp
    public final void n(anwn anwnVar) {
        this.m = anwnVar;
    }

    @Override // defpackage.anwp
    public final void o() {
        getWindow().clearFlags(2621568);
    }

    @Override // defpackage.rza, defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1) {
            if (this.p != null) {
                eltz ai = k.h().ai(2756);
                ActivityResult activityResult = this.p;
                ai.G("Got an activity result when mPendingFsmActivityResult is not null. losing result with resultCode=%d data=%s", activityResult.a, activityResult.b);
            }
            if (this.q) {
                this.p = new ActivityResult(i2, intent);
            } else {
                this.m.e("EVENT_ACTIVITY_RESULT", new ActivityResult(i2, intent));
            }
        }
    }

    @Override // defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onBackPressed() {
        this.m.d("EVENT_BACKBUTTON_PRESSED");
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTheme(R.style.CarFrxTheme_Cakewalk_Phone);
        fond fondVar = fond.a;
        if (fondVar.lK().b() && fondVar.lK().a().b.contains(Build.MANUFACTURER.toLowerCase(Locale.ROOT))) {
            getTheme().applyStyle(R.style.ThemeOverlay_CarFrx_DeviceFontFamily, true);
        }
        getWindow().addFlags(2621568);
        setRequestedOrientation(1);
        setContentView(R.layout.car_frx_activity);
        this.n = getSupportFragmentManager().h("fragment_main");
        if (bundle == null) {
            bp bpVar = new bp(getSupportFragmentManager());
            bpVar.v(new ants(), "fragment_fsm_controller");
            bpVar.a();
        }
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onPause() {
        this.q = true;
        super.onPause();
    }

    @Override // defpackage.rza
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

    public final void p(eolk eolkVar, eolj eoljVar) {
        anwn anwnVar = this.m;
        fgrc v = eoll.a.v();
        if (!v.b.L()) {
            v.U();
        }
        int i = eolkVar.gC;
        eoll eollVar = (eoll) v.b;
        eollVar.b |= 1;
        eollVar.d = i;
        int a = eoljVar.a();
        if (!v.b.L()) {
            v.U();
        }
        eoll eollVar2 = (eoll) v.b;
        eollVar2.b |= 2;
        eollVar2.e = a;
        anwnVar.f((eoll) v.Q());
    }

    @Override // defpackage.anwp
    public final void q(Class cls, eolj eoljVar) {
        eolk eolkVar = (eolk) l.get(cls);
        if (eolkVar != null) {
            p(eolkVar, eoljVar);
        } else {
            k.j().ai(2753).B("Attempting to log unknown FRX screen for class: %s", cls.getName());
        }
    }

    @Override // defpackage.anwp
    public final void r(Class cls) {
        eolk eolkVar = (eolk) l.get(cls);
        if (eolkVar != null) {
            p(eolkVar, eolj.f);
        } else {
            k.j().ai(2754).B("Attempting to log unknown FRX screen for class: %s", cls.getName());
        }
    }

    @Override // defpackage.anwp
    public final void s(Intent intent) {
        startActivityForResult(intent, 1);
    }

    @Override // defpackage.anwp
    public final void t(Class cls, Bundle bundle, boolean z) {
        dg dgVar;
        if (z || (dgVar = this.n) == null || !cls.equals(dgVar.getClass())) {
            if (!cls.equals(anvu.class) && !cls.equals(anvv.class)) {
                o();
            }
            try {
                dg dgVar2 = (dg) cls.getConstructor(null).newInstance(null);
                dgVar2.setArguments(bundle);
                if (this.q && !(dgVar2 instanceof anvu)) {
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
