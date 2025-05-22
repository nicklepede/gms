package com.google.android.gms.constellation.ui.debug;

import android.graphics.Rect;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import defpackage.auad;
import defpackage.auub;
import defpackage.avdh;
import defpackage.avpn;
import defpackage.avpz;
import defpackage.avqf;
import defpackage.avqj;
import defpackage.caqj;
import defpackage.ekwr;
import defpackage.fgpr;
import defpackage.fgrc;
import defpackage.fgub;
import defpackage.fmgx;
import defpackage.fpen;
import defpackage.rxx;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class ConstellationDebugChimeraActivity extends rxx {
    public static final auad j = avqj.a("debug_activity");
    private Button A;
    private Button B;
    private Button C;
    private Button D;
    private Button E;
    private Button F;
    private Button G;
    private Button H;
    private Button I;
    private Button J;
    private Button K;
    private Button L;
    private Button M;
    private Button N;
    private Button O;
    private Button P;
    private Button Q;
    private Button R;
    private Button S;
    private Button T;
    private Button U;
    private Button V;
    private Button W;
    private Button X;
    private Button Y;
    private Button Z;
    private Button aa;
    private Button ab;
    public final Handler k = new caqj();
    public avpz l;
    public Button m;
    public TextView n;
    public EditText o;
    public EditText p;
    public String q;
    public ArrayList r;
    public avdh s;
    public avqf t;
    public ekwr u;
    private Button v;
    private Button w;
    private Button x;
    private Button y;
    private Button z;

    public static final fmgx p(String str) {
        fgrc v = fmgx.a.v();
        fgpr A = fgpr.A(str);
        if (!v.b.L()) {
            v.U();
        }
        ((fmgx) v.b).c = A;
        fgub c = avpn.c(System.currentTimeMillis());
        if (!v.b.L()) {
            v.U();
        }
        fmgx fmgxVar = (fmgx) v.b;
        c.getClass();
        fmgxVar.d = c;
        fmgxVar.b |= 1;
        return (fmgx) v.Q();
    }

    public final avqf a(String str) {
        avqf avqfVar = new avqf(str);
        avqfVar.g = this.q;
        avqfVar.h = this.r;
        avqfVar.c = 6;
        return avqfVar;
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            View currentFocus = getCurrentFocus();
            if (currentFocus instanceof TextView) {
                Rect rect = new Rect();
                currentFocus.getGlobalVisibleRect(rect);
                if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                    currentFocus.clearFocus();
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void k(boolean z) {
        this.A.setEnabled(z);
        this.B.setEnabled(z);
        this.C.setEnabled(z);
        this.E.setEnabled(z);
        this.X.setEnabled(z);
        this.ab.setEnabled(z);
        if (!z || fpen.a.lK().k()) {
            this.v.setEnabled(z);
            this.F.setEnabled(z);
            this.H.setEnabled(z);
            this.I.setEnabled(z);
            this.J.setEnabled(z);
            this.K.setEnabled(z);
            this.L.setEnabled(z);
            this.M.setEnabled(z);
            this.N.setEnabled(z);
            this.O.setEnabled(z);
            this.P.setEnabled(z);
            this.Q.setEnabled(z);
            this.R.setEnabled(z);
            this.S.setEnabled(z);
            if (auub.c()) {
                this.T.setEnabled(z);
                this.U.setEnabled(z);
            } else {
                this.T.setEnabled(false);
                this.U.setEnabled(false);
            }
            this.V.setEnabled(z);
            this.W.setEnabled(z);
        }
        if (z && TextUtils.isEmpty(this.q)) {
            return;
        }
        this.y.setEnabled(z);
        this.z.setEnabled(z);
        this.w.setEnabled(z);
        this.x.setEnabled(z);
    }

    public final void l(boolean z) {
        Settings.Global.putInt(getContentResolver(), "airplane_mode_on", z ? 1 : 0);
    }

    public final void m(boolean z) {
        ((TelephonyManager) getSystemService("phone")).setDataEnabled(z);
    }

    public final void n(boolean z) {
        ((WifiManager) getApplicationContext().getSystemService("wifi")).setWifiEnabled(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0347 A[SYNTHETIC] */
    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onCreate(android.os.Bundle r20) {
        /*
            Method dump skipped, instructions count: 1312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.constellation.ui.debug.ConstellationDebugChimeraActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
